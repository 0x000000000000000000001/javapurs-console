    public static Object log = (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Supplier<Object>) () -> { System.out.println((String) s); return null; };

    public static Object warn = (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Supplier<Object>) () -> { System.err.println((String) s); return null; };

    public static Object error = (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Supplier<Object>) () -> { System.err.println((String) s); return null; };

    public static Object info = (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Supplier<Object>) () -> { System.out.println((String) s); return null; };

    public static Object debug = (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Supplier<Object>) () -> { System.out.println((String) s); return null; };

    // Named timers, like the Node console keeps.
    private static final java.util.Map<String, Long> __consoleTimers = new java.util.HashMap<>();

    private static void __consoleTimeLog(String label, boolean end) {
        Long started = __consoleTimers.get(label);
        double elapsed = started == null ? 0.0 : (System.nanoTime() - started) / 1000000.0;
        System.out.println(label + ": " + elapsed + " ms");
        if (end) __consoleTimers.remove(label);
    }

    public static Object time = (java.util.function.Function<Object, Object>) (label) ->
        (java.util.function.Supplier<Object>) () -> { __consoleTimers.put((String) label, System.nanoTime()); return null; };

    public static Object timeLog = (java.util.function.Function<Object, Object>) (label) ->
        (java.util.function.Supplier<Object>) () -> { __consoleTimeLog((String) label, false); return null; };

    public static Object timeEnd = (java.util.function.Function<Object, Object>) (label) ->
        (java.util.function.Supplier<Object>) () -> { __consoleTimeLog((String) label, true); return null; };

    public static Object clear = (java.util.function.Supplier<Object>) () ->
        { System.out.print("\033[H\033[2J"); System.out.flush(); return null; };

    public static Object group = (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Supplier<Object>) () -> { System.out.println((String) s); return null; };

    public static Object groupCollapsed = (java.util.function.Function<Object, Object>) (s) ->
        (java.util.function.Supplier<Object>) () -> { System.out.println((String) s); return null; };

    public static Object groupEnd = (java.util.function.Supplier<Object>) () -> null;
