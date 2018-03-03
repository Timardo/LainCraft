package lain.mods.notooltips;

import java.util.Map;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.DependsOn;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.MCVersion;

@MCVersion( NoToolTips.MC_VERSION )
@DependsOn( "forge" )
public class NoToolTips implements IFMLLoadingPlugin
{
    public static final String MC_VERSION = "1.8.9";
    public static final String MOD_ID = "NoToolTips";
    public static final String MOD_VERSION = "1.1";
    
    @Override
    public String[] getASMTransformerClass()
    {
        return new String[] {NoToolTipsTransformer.class.getName()};
    }

    @Override
	public String getAccessTransformerClass() {
		return null;
	}
    public String[] getLibraryRequestClass()
    {
        return null;
    }

    @Override
    public String getModContainerClass()
    {
        return NoToolTipsDummyContainer.class.getName();
    }

    @Override
    public String getSetupClass()
    {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data)
    {}

}
