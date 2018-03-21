package client;

import java.util.List;

public final class Controller {
    private static final Controller INSTANCE = new Controller();
    private Controller() {}
    public static Controller getInstance() { return INSTANCE; }

    private ControllerSOAP controllerSOAP = new ControllerSOAP();

    public List<String> takeTitles() {
        return controllerSOAP.takeArticleList();
    }

    public void takeArticle(String title) {
            controllerSOAP.takeArticle(title);
    }

    public String add(String title, String body) {
        return controllerSOAP.add(title, body);
    }

    public String delete(int id) {
        return controllerSOAP.deleteArticle(id);
    }

    public void update(int id, String body) {
        controllerSOAP.updateArticle(id, body);
    }
 }