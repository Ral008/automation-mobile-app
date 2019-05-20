El proyecto muestra la integración de Appium y Serenity framework para ejecutar casos de pruebas de una aplicación nativa de Android

### Antes de ejecutar
1.  Tener un emulador o dispositivo Android conectado
2.  ANDROID_HOME variable de entorno
3.  appium.platformVersion  =  set_valid_value
4.  appium.deviceName  =  set_valid_value
5.  appium.app  =  set_full_path
<br><br>

### Ejecutar desde la línea de comandos
1. mvn clean verify -Dappium.hub=http://localhost:4723/wd/hub -Dwebdriver.driver=appium -Dappium.platformName=Android -Dappium.deviceName="HUAWEI P smart"

<br><br>