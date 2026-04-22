# Actividad de Recuperación - Entornos de Desarrollo

## Descripción del Proyecto
Este proyecto forma parte de la actividad de recuperación de la asignatura Entornos de Desarrollo. El objetivo principal es demostrar la adquisición de conocimientos sobre planificación de pruebas, optimización de código mediante refactorización, documentación técnica y gestión de versiones utilizando Git y GitHub.

El repositorio contiene ejemplos prácticos de refactorización en Python y Java, así como una base teórica sobre la calidad del software.

## Cómo se ejecuta
El proyecto consta de varios archivos que pueden ser revisados o ejecutados de la siguiente manera:

1. Scripts de Refactorización:
   - Python: Ejecutar con 'python refactorizacion_de_codigo_I.py' para ver el ejemplo de cálculo de área.
   - Java: Revisar 'refactorizacion_de_codigo_II.java' para observar la lógica de registro de usuarios refactorizada.
2. Lógica inicial:
   - JavaScript: El archivo 'app.js' contiene una muestra simple de salida por consola que ha sido evolucionada mediante ramas.

## Pruebas Realizadas
Se han diseñado casos de prueba para un Módulo de Login, enfocándose en:
- Validación de credenciales correctas: Asegurar que el acceso se concede con datos válidos.
- Control de campos vacíos: Verificar que el sistema bloquea envíos sin información y muestra las alertas correspondientes.

Además, se han realizado pruebas de regresión tras cada refactorización para asegurar que la funcionalidad original se mantiene intacta.

## Uso de Git y GitHub
Durante el desarrollo se ha seguido un flujo de trabajo profesional de control de versiones:
- Inicialización del repositorio local y configuración de remotos.
- Realización de commits frecuentes con mensajes descriptivos siguiendo el estándar 'feat:'.
- Uso de ramas (branch) para el desarrollo de nuevas funcionalidades o experimentos (rama 'desarrollo-nueva-funcionalidad'), evitando afectar la rama principal (main).
- Fusión (merge) de ramas tras validar el código.
- Sincronización con el repositorio remoto en GitHub.

## Mejoras Futuras
Para evolucionar este proyecto, se podrían implementar las siguientes mejoras:
1. Automatización de pruebas: Integrar un framework de pruebas unitarias (como PyTest o JUnit) para ejecutar los casos de prueba de forma automática.
2. Integración Continua (CI): Configurar GitHub Actions para validar cada commit de forma automática.
3. Ampliación de la cobertura: Añadir más casos de prueba estructurales para cubrir todos los flujos lógicos del código.
4. Documentación avanzada: Generar documentación técnica automática utilizando herramientas como Javadoc o Sphinx.
