// Date: 4/18/2018 6:08:08 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.benjibrat.minecraftplusmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBramble extends ModelBase
{
  //fields
    ModelRenderer body;
    ModelRenderer Shape1;
  
  public ModelBramble()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      body = new ModelRenderer(this, 0, 0);
      body.addBox(-8F, -8F, -8F, 16, 16, 16);
      body.setRotationPoint(0F, 16F, 0F);
      body.setTextureSize(64, 128);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, -1, 32);
      Shape1.addBox(-7F, -7F, -7F, 14, 14, 14);
      Shape1.setRotationPoint(0F, 16F, 0F);
      Shape1.setTextureSize(64, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    body.render(f5);
    Shape1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
