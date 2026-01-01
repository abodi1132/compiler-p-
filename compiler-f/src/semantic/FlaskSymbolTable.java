package semantic;

import java.util.*;

public class FlaskSymbolTable {

    private final Map<String, FlaskSymbol> symbols = new LinkedHashMap<>();

    // إضافة متغير جديد
    public void define(String name) {
        define(name, "global");
    }

    public void define(String name, String scope) {
        String key = scope + "::" + name; // مفتاح فريد حسب scope
        symbols.put(key, new FlaskSymbol(name, scope));
    }

    // التحقق من وجود متغير
    public boolean contains(String name) {
        return symbols.containsKey("global::" + name);
    }

    public boolean contains(String name, String scope) {
        return symbols.containsKey(scope + "::" + name);
    }

    // الحصول على كل الرموز
    public Collection<FlaskSymbol> getAll() {
        return symbols.values();
    }

    // طباعة الجدول بالكامل
    public void print() {
        System.out.println("Symbol Table:");
        for (FlaskSymbol s : symbols.values()) {
            System.out.println("- " + s);
        }
    }

    // حذف جميع المتغيرات في scope محدد (مثلاً عند انتهاء دالة)
    public void removeScope(String scope) {
        symbols.keySet().removeIf(key -> key.startsWith(scope + "::"));
    }

    // الحصول على المتغير حسب اسمه و scope
    public FlaskSymbol get(String name, String scope) {
        return symbols.get(scope + "::" + name);
    }
}
