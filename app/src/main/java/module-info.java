module edu.isu.cs.cs2263.app.main {
    requires javafx.controls;
    requires com.google.common;
    requires com.google.gson;
    exports edu.isu.cs.cs2263.hw02;
    opens edu.isu.cs.cs2263.hw02 to com.google.gson;
}