package lain.mods.notooltips;

import java.util.Arrays;
import com.google.common.eventbus.EventBus;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;

public class NoToolTipsDummyContainer extends DummyModContainer
{

    public NoToolTipsDummyContainer()
    {
        super(new ModMetadata());
        ModMetadata meta = getMetadata();
        meta.modId = "NoToolTips";
        meta.name = "NoToolTips";
        meta.version = "1.8.9";
        meta.authorList = Arrays.asList("Timardo");
        meta.description = "NoToolTips makes that annoying tooltip (in tools & swords) introduced in MC 1.6 toggleable";
        meta.credits = "Huge thanks to Lain for base mod for MC 1.6";
        meta.url = "https://github.com/Timardo/LainCraft";
        meta.updateUrl = "https://github.com/Timardo/LainCraft/releases";
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller)
    {
        return true;
    }

}
