package lain.mods.notooltips;

import java.util.Map;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.DependsOn;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;

@MCVersion( NoToolTips.MC_VERSION )
@DependsOn( "forge" )
public class NoToolTips implements IFMLLoadingPlugin
{
    public static final String MC_VERSION = "1.7.10";
    public static final String MOD_ID = "NoToolTips";
    public static final String MOD_VERSION = "1.0";
    
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
