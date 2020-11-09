# KeyGeneratorAPI

Latest Version: [v.1.0](https://github.com/Zero-Developing/KeyGeneratorAPI/releases/tag/v.1.0)

The KeyGeneratorAPI is a API developed by Zero-Developing for generating and scanning Keys. You can use these Keys to verify Beta-Users.

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

A generated Key with the default parameters would look like this: Qr8K-VT7Y-nPo2-o7m7-IHtB

### Generate a Key
To generate a Key you have to create a instance of the KeyGenerator class.
The Generator needs a pattern to generate a Key so we set one.
```java
KeyGenerator keyGenerator = new KeyGenerator();
keyGenerator.setPattern(KeyPattern.getDefault());
```
### Check if a Key is valid
To check if a key is valid you can use the KeyScanner class. 

KeyScanner keyScanner = new KeyScanner();
