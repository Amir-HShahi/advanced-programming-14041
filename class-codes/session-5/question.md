# تمرین کلاس - Builder Pattern

## سوال: Builder Pattern
یک کلاس `Person` با فیلدهای `name`، `age` و `city` بنویسید. متدهای `setName()`, `setAge()` و `setCity()` را طوری پیاده‌سازی کنید که بتوان به صورت زنجیره‌ای فراخوانی کرد:
```java
Person p = new Person().setName("علی").setAge(25).setCity("تهران");
```

**نکته:** از کلمه کلیدی `this` برای برگرداندن شیء جاری استفاده کنید تا method chaining امکان‌پذیر شود.
