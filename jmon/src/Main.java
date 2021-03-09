import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;

public class Main extends SimpleApplication {

    public static void main(String[] args) {

        Main app = new Main();

        AppSettings settings = new AppSettings(true);
        settings.setTitle("My Awesome Game");
        app.setSettings(settings);

        app.start();

    }

    @Override
    public void simpleInitApp() {

        //Box b = new Box(1, 1, 1);
        //Geometry geom = new Geometry("Box", b);
        Box b2 = new Box(1, 2, 2);
        Geometry geom2 = new Geometry("Box2", b2);

//        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        ///      mat.setColor("Color", ColorRGBA.Cyan);
        ///   geom.setMaterial(mat);

        Material m2 = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        m2.setColor("Color", ColorRGBA.Red);
        geom2.setMaterial(m2);

        //rootNode.attachChild(geom);
        rootNode.attachChild(geom2);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

}