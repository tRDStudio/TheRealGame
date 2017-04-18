package models;

import textures.ModelTexture;

/**
 * Created by hrq on 2017-04-18.
 */
public class TexturedModel {

    private RawModel rawModel;
    private ModelTexture texture;

    public RawModel getRawModel() {
        return rawModel;
    }

    public ModelTexture getTexture() {
        return texture;
    }

    public TexturedModel(RawModel model, ModelTexture texture){
        this.rawModel = model;
        this.texture = texture;

    }



}
