package net.minecraft.client.audio;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public interface IAudioStream extends Closeable {
   AudioFormat getAudioFormat();

   ByteBuffer readOggSoundWithCapacity(int size) throws IOException;
}
