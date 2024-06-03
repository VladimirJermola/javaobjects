public class Controller {
    public Controller(Model model, View view) {
        view.registerButtonShow(new ButtonShowListener(model, view));
    }
}
