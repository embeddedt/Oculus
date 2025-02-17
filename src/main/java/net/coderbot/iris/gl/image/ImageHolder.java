package net.coderbot.iris.gl.image;

import java.util.function.IntSupplier;

import net.coderbot.iris.gl.texture.InternalTextureFormat;

public interface ImageHolder {
	boolean hasImage(String name);
	void addTextureImage(IntSupplier textureID, InternalTextureFormat internalFormat, String name);
}
