# KeyGeneratorAPI

Latest Version: [v.1.0](https://github.com/BlueLight/KeyGeneratorAPI/releases/tag/v.1.0)

The KeyGeneratorAPI is a API developed by BlueLight for generating and scanning Keys. You can use these Keys to verify Beta-Users. We **do not recommend** to use this key's as **security feature** or for **paid licenses**.

## Installation

[Release-Site](https://github.com/Zero-Developing/KeyGeneratorAPI/releases) -> Latest Version -> Assets -> KeyGeneratorAPI.jar

To download the API go to the Release-Site and select the latest version. Go to the "Assets" Folder and download the KeyGerneratorAPI.jar.

## Usage
First you have to create a KeyPattern```KeyPattern keyPattern = new KeyPattern("");```. <br>
For ***test purposes*** you can use the ```KeyPattern.getDefault();```function, wich generates a KeyPattern with following parameters:<br>
- key_pattern -> "aaaa-aaaa-aaaa-aaaa-aaaa"
- security_number -> '7'
- ascii_code -> 1648
- alphabet_pattern -> "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYL0123456789"

A generated Key with the default parameters would look like this: **Qr8K-VT7Y-nPo2-o7m7-IHtB**

### Generate a Key
To generate a Key you have to create a instance of the KeyGenerator class.
The Generator needs a pattern to generate a Key so we set one.
The last step is to call the generate method.
```java
KeyGenerator keyGenerator = new KeyGenerator();
keyGenerator.setPattern(KeyPattern.getDefault());
String key = keyGenerator.generate();
```
### Check if a Key is valid
To check if a key is valid you can use the KeyScanner class. First create an instance of the KeyScanner class, then set a pattern to scan. To actually check if a Key is valid you can use the ```KeyPattern.isValid();``` method.

```java
KeyScanner keyScanner = new KeyScanner();
keyScanner.setPattern(KeyPattern.getDefault());

if(keyScanner.isValid(key)){
//Do something...
}
```
