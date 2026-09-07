# Assignment1-Converter-and-Pixel-System
## The Repository
This repository contains Assignment 1 for CS 240 - Computer Organization. The
project demonstrates how information is represented using character codes,
number bases, two's-complement bit patterns, and RGB pixel values.
GitHub link: `https://github.com/jpaul7421/Assignment1-Converter-and-Pixel-System`
## CS 240 - Computer Organization
The assignment includes an ASCII-to-decimal converter, a binary/decimal/octal/
hexadecimal converter, an image-to-pixel converter, and a pixel-to-image
converter.
### ASCII-to-Decimal Converter
`Assignment1.java` accepts a string and displays the decimal, 8-bit binary, and
hexadecimal value of each character. The same program converts numbers among
binary, decimal, octal, and hexadecimal. It also demonstrates 8-bit
two's-complement encoding and decoding.
### Image-to-Pixel Converter
`ImageToPixels.java` reads an image and prints each pixel as red, green, and blue
values. It also saves the image dimensions and pixel values in `pixels.txt`.
### Pixel-to-Image Converter
`PixelsToImage.java` reads `pixels.txt` and creates `reconstructed.png`. The
included test reconstructs the 7-by-6 smiley with identical RGB pixel values.
## Files
- `Assignment1.java` - character, base-number, and two's-complement converter
- `ImageToPixels.java` - converts an image into numeric RGB values
- `PixelsToImage.java` - creates an image from numeric RGB values
- `smiley.png` - original test image
- `pixels.txt` - exported test-image values
- `reconstructed.png` - image generated from `pixels.txt`
- `TEST_RESULTS.txt` - representative test results
## Running the Programs
Java 17 or newer is required. Open a terminal in the project folder and run:
```text
javac Assignment1.java ImageToPixels.java PixelsToImage.java
java Assignment1
java ImageToPixels smiley.png pixels.txt
java PixelsToImage pixels.txt reconstructed.png
```
No external libraries are needed.
## Tests
- Normal character input: `Jasmine`
- Base conversion: hexadecimal `FF` equals binary `11111111`, decimal `255`,
and octal `377`
- Zero boundary: unsigned `00000000` equals `0`
- Largest 8-bit unsigned value: `11111111` equals `255`
- Negative two's complement: signed `11111111` equals `-1`
- Image round-trip: 42 exported pixels reconstruct the 7-by-6 smiley without
changing any RGB values
## Sources and Collaboration
The programs use Java standard-library classes including `Scanner`, `Integer`,
`BufferedImage`, `Color`, `ImageIO`, `File`, and `PrintWriter`. The original
character-conversion and image-reading ideas were developed during the
assignment work.
## License
This course project is intended for educational use.
