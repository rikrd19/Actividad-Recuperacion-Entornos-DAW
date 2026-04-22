/*
- Se muestra código "Antes" (malo).
- Situación: Función que registra a un usuario en una app.
- Código ANTES de Refactorizar (Código Sucio / "Espagueti")
*/

public void registrar(String nombre, String email) {
    // Hace demasiadas cosas a la vez: Validar, Formatear y Guardar
    if (nombre != null && email != null && email.contains("@") && email.length() > 5) {
        String nombreMayus = nombre.toUpperCase();
        String emailLimpio = email.trim().toLowerCase();
        
        // Aquí iría código de conexión a Base de Datos...
        System.out.println("INSERT INTO USUARIOS VALUES ('" + nombreMayus + "', '" + emailLimpio + "')");
        System.out.println("Usuario guardado.");
    } else {
        System.out.println("Error: Datos inválidos");
    }
}


/*
- Se muestra código "Despues" (bueno).
- Legibilidad: La función registrar ahora se lee como un guion (Si email válido -> guardar).
- Reutilización: Las funciones esEmailValido y formatearEmail pueden usarse ahora en 
la pantalla de "Login" o "Recuperar contraseña" sin copiar y pegar el código de validación.
- Mantenimiento: Si mañana se quiere que los emails se guarden SIEMPRE en mayúsculas 
    en vez de minúsculas, solo tendremos que cambiar la línea dentro de formatearEmail, 
    no buscar en 50 archivos del proyecto.
*/

public void registrar(String nombre, String email) {
    if (esEmailValido(email) && esNombreValido(nombre)) {
        guardarEnBaseDeDatos(formatearNombre(nombre), formatearEmail(email));
    } else {
        mostrarError("Datos inválidos");
    }
}

// Nuevas funciones extraídas (Refactorización)
private boolean esEmailValido(String email) {
    return email != null && email.contains("@") && email.length() > 5;
}

private boolean esNombreValido(String nombre) {
    return nombre != null && !nombre.isEmpty();
}

private String formatearNombre(String nombre) {
    return nombre.toUpperCase();
}

private String formatearEmail(String email) {
    return email.trim().toLowerCase();
}

private void guardarEnBaseDeDatos(String nombre, String email) {
    System.out.println("INSERT INTO USUARIOS VALUES ('" + nombre + "', '" + email + "')");
}

private void mostrarError(String mensaje) {
    System.out.println("Error: " + mensaje);
}