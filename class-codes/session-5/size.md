# Java Primitive Data Types - Quick Reference

## Integer Types

| Type | Size | Range | Default | Example |
|------|------|-------|---------|---------|
| `byte` | 8 bits (1 byte) | -128 to 127 | 0 | `byte age = 25;` |
| `short` | 16 bits (2 bytes) | -32,768 to 32,767 | 0 | `short year = 2024;` |
| `int` | 32 bits (4 bytes) | -2,147,483,648 to 2,147,483,647 | 0 | `int count = 1000;` |
| `long` | 64 bits (8 bytes) | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | 0L | `long population = 8000000000L;` |

## Floating-Point Types

| Type | Size | Precision | Default | Example |
|------|------|-----------|---------|---------|
| `float` | 32 bits (4 bytes) | ~6-7 decimal digits | 0.0f | `float price = 19.99f;` |
| `double` | 64 bits (8 bytes) | ~15 decimal digits | 0.0d | `double pi = 3.14159;` |

## Other Types

| Type | Size | Values | Default | Example |
|------|------|--------|---------|---------|
| `char` | 16 bits (2 bytes) | 0 to 65,535 (Unicode) | '\u0000' | `char grade = 'A';` |
| `boolean` | ~1 bit* | true or false | false | `boolean isValid = true;` |