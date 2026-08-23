<h1 align="center">⛩️ Snapdragon Performance ⛩️</h1>
<p align="center">
  <img src="banner.png" alt="Qualcomm Banner" width="800"/>
</p>

<p align="center">
  <a href="https://www.android.com">
    <img src="https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android">
  </a>
  <a href="https://www.java.com">
    <img src="https://img.shields.io/badge/Language-Java-007396?style=for-the-badge&logo=java&logoColor=white">
  </a>
  <a href="https://github.com/topjohnwu/Magisk">
    <img src="https://img.shields.io/badge/Root-Required-critical?style=for-the-badge">
  </a>
  <a href="https://github.com/r0xx3z/SD-Perf/blob/main/LICENSE">
    <img src="https://img.shields.io/github/license/r0xx3z/SD-Perf?style=for-the-badge&color=228BE6">
  </a>
</p>

---

# Overview

_Snapdragon Performance (SD-Perf)_ is a application designed to customize GPU frequency and voltage tables without the need for kernel recompilation.

## Key Features

- **Kernel-Free Customization:** Edit GPU frequency and voltage tables without recompiling the kernel.
- **Performance:** Overclock older chips to rival newer generation performance.
- **Efficiency Tuning:** Undervolt GPU to significantly reduce power consumption.
- **Compatibility:** Supports a wide range of Snapdragon chipsets from 6 - 8 series.

## How it Operates

The application achieves deep system customization by extracting and unpacking the `Boot/Vendor` Boot image, analyzing its internal components, and modifying relevant `DTB` (Device Tree Binary) files that define low-level hardware configurations and kernel parameters. After applying the required changes, the modified device tree data is rebuilt and integrated back into the image through a repacking process. The resulting customized image can then be flashed onto the device, allowing the applied modifications to take effect at the kernel and hardware abstraction level.

# Compatibility

| Serie                  | SoC                                   |
| ----------------------- | :---------------------------------------------------------- |
| Snapdragon 6     		  | Snapdragon: 690  |
| Snapdragon 7     		  | Snapdragon: 750, 765, 778G, 780G, 7 Gen 1, 7+ Gen 2 & 3 |
| Snapdragon 8  | Snapdragon: 855, 865, 888, 8 Gen 1/2/3, 8+ Gen 1 & 8s Gen 3|

---

# Requirements

*   **Android OS**: Android 9.0+ 
*   **Root Access**: Magisk, KernelSU or APatch.

 ## Why "KonaBess"? 

-  **Legacy**: "_Kona_" is the codename for the Snapdragon 865 platform.
-  **Purpose**: Created to address the energy efficiency concerns of the Snapdragon 888 by maximizing the potential of the Snapdragon 865.
-  **Continuity**: The name remains as a tribute to its origins, despite expanding support to newer and older generations.
   
  
# Prebuilt Binaries

- [magiskboot](https://github.com/topjohnwu/Magisk)
- [dtc](https://github.com/xzr467706992/dtc-aosp/tree/standalone)

# Credits 🪪

*   **Original KonaBess and DTC**: [libxzr](https://github.com/libxzr)
*   **Magisk**: [topjohnwu](https://github.com/topjohnwu)
*   **Claude**: [Anthropic](https://platform.claude.com/docs/es/intro)
