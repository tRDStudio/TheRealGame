package engineTester;


import gameEngine.DisplayManager;
import gameEngine.Loader;
import models.RawModel;
import gameEngine.Renderer;
import models.TexturedModel;
import org.lwjgl.opengl.Display;
import shaders.StaticShader;
import textures.ModelTexture;

public class MainGameLoop {

    public static void main(String[] args) {

        DisplayManager.createDisplay();

        Loader loader = new Loader();
        Renderer renderer = new Renderer();
        StaticShader shader = new StaticShader();

        float[] vertices = { -0.5f, 0.5f, 0, -0.5f, -0.5f, 0, 0.5f, -0.5f, 0, 0.5f, 0.5f, 0f };
        int[] indices = { 0,1,3,
                            3,1,2 };
        float[] texutreCoords = {
                0,0,
                0,1,
                1,1,
                1,0

        };

        RawModel model = loader.loadToVAO(vertices,texutreCoords,indices);
        ModelTexture texture = new ModelTexture(loader.loadTexture("TerrainTexture0"));
        TexturedModel texturedModel = new TexturedModel(model,texture);

        //main game loop
        while(!Display.isCloseRequested()) {
            renderer.prepare();
            shader.start();

            renderer.render(texturedModel);
            shader.stop();
            DisplayManager.updateDisplay();
        }


        shader.cleanUp();
        loader.cleanUp();
        DisplayManager.closeDisplay();
    }
}