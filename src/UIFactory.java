// Abstract Factory
interface Button {
    void render();
}

class DarkThemeButton implements Button {
    public void render() {
        System.out.println("Rendering Dark Theme Button");
    }
}

interface UIFactory {
    Button createButton();
}

class DarkThemeFactory implements UIFactory {
    public Button createButton() {
        return new DarkThemeButton();
    }
}