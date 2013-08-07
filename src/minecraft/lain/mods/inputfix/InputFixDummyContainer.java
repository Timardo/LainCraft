package lain.mods.inputfix;

import java.util.Arrays;
import com.google.common.eventbus.EventBus;
import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;

public class InputFixDummyContainer extends DummyModContainer
{

    public InputFixDummyContainer()
    {
        super(new ModMetadata());
        ModMetadata meta = getMetadata();
        meta.modId = "InputFix";
        meta.name = "InputFix";
        meta.version = "1.6.x-v2";
        meta.authorList = Arrays.asList("Lain");
        meta.description = "InputFix is a way to enable multi-byte input method in Minecraft.";
        meta.credits = "Dear_ICE, pa001024, sunny00123, crafteverywhere";
        meta.url = "https://github.com/zlainsama/laincraft";
        meta.updateUrl = "https://github.com/zlainsama/LainCraft/releases";
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller)
    {
        return true;
    }

}
