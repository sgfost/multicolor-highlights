package sgf.multihighlight;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class MulticolorHighlightsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(MulticolorHighlightsPlugin.class);
		RuneLite.main(args);
	}
}