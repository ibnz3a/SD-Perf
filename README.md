# Based in KonaBess

### Overview

_Snapdragon Performance (SD-Perf)_ is a application designed to customize GPU frequency and voltage tables without the need for kernel recompilation.

# Compatibility

| Serie                  | SoC                                   |
| ----------------------- | :---------------------------------------------------------- |
| Snapdragon 6     		  | Snapdragon: 690  |
| Snapdragon 7     		  | Snapdragon: 750, 765, 778G, 780G, 7 Gen 1, 7+ Gen 2 & 3 |
| Snapdragon 8  | Snapdragon: 855, 865, 888, 8 Gen 1/2/3, 8+ Gen 1 & 8s Gen 3|

---

### How it Operates

The application achieves customization by unpacking the Boot/Vendor Boot image, decompiling and editing relevant dtb (device tree binary) files, and finally repacking and flashing the modified image.

### Performance Enhancement

The extent of improvement varies, with some users reporting a 25% reduction in power consumption in the graphics benchmark (4.2w->3.2w) after undervolting the Snapdragon 865. Actual improvement is chip-specific and contingent on stability requirements.

### Prebuilt Binaries

- [magiskboot](https://github.com/topjohnwu/Magisk)
- [dtc](https://github.com/xzr467706992/dtc-aosp/tree/standalone)
