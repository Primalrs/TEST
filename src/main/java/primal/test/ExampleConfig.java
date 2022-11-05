package primal.test;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("test")
public interface ExampleConfig extends Config
{
	@ConfigItem(
		keyName = "name of the button",
		name = "header",
		description = "description of the button"
	)
	default String greeting()
	{
		return "content";
	}
}
