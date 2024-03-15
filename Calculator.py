# Imports the monkeyrunner modules used by this program.
from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice

# Connects to the current device, returning a MonkeyDevice object.
device = MonkeyRunner.waitForConnection()

# Installs the Android package. Notice that this method returns a boolean, so you can test
# whether the installation worked.
device.installPackage('"C:\Users\HP\OneDrive - Concordia University - Canada\Desktop\BasicCalculator\app\build\intermediates\apk\flavorAtest\debug\net.gsantner.calculator-v148-2.11.1-flavorAtest-debug.apk"')

# Sets a variable with the package's internal name.
package = 'net.gsantner.markor'

# Sets a variable with the name of an Activity in the package.a
activity = 'net.gsantner.BasicCalculator.activity.MainActivity'

# Sets the name of the component to start.
runComponent = package + '/' + activity

# Runs the component.
device.startActivity(component=runComponent)

# Presses the Menu button.
device.press('KEYCODE_MENU', MonkeyDevice.DOWN_AND_UP)

# Takes a screenshot.
result = device.takeSnapshot()

# Writes the screenshot to a file.
result.writeToFile('C:\Users\HP\OneDrive - Concordia University - Canada\Desktop\monkey\shot1.png','png')
