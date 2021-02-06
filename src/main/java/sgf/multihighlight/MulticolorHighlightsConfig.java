/*
 * Copyright (c) 2021, Scott Foster <scott@sgfost.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package sgf.multihighlight;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import net.runelite.client.config.Alpha;

@ConfigGroup("multicolorhighlights")
public interface MulticolorHighlightsConfig extends Config
{
	@ConfigSection(
		name = "Render style",
		description = "How to render the highlight",
		position = 0
	)
	String renderStyleSection = "renderStyleSection";

	@ConfigItem(
		position = 0,
		keyName = "highlightHullFill",
		name = "Highlight filled hull",
		description = "Whether or not to draw a filled in hull over the NPC",
		section = renderStyleSection
	)
	default boolean highlightHullFill() {
		return false;
	}

	@ConfigItem(
		position = 1,
		keyName = "highlightHullOutline",
		name = "Highlight hull outline",
		description = "Whether or not to draw hull outline on the NPC",
		section = renderStyleSection
	)
	default boolean highlightHullOutline() {
		return true;
	}

	@Range(
		max = 5,
		min = 1
	)
	@ConfigItem(
		position = 2,
		keyName = "outlineStrokeWidth",
		name = "Outline stroke width",
		description = "Width (px) of the hull outline",
		section = renderStyleSection
	)
	default int getOutlineStrokeWidth() {
		return 2;
	}

	// Group 1
	@ConfigSection(
		name = "Group 1",
		description = "Group 1 highlight list and color",
		position = 1
	)
	String group1Section = "group1";

	@Alpha
	@ConfigItem(
		position = 3,
		keyName = "group1Color",
		name = "Color 1",
		description = "Color for group 1 highlights",
		section = group1Section
	)
	default Color getGroup1Color() {
		return Color.RED;
	}

	@Range(
		max = 255,
		min = 1
	)
	@ConfigItem(
		position = 4,
		keyName = "group1FillAlpha",
		name = "Fill Alpha 1",
		description = "Alpha (transparency) for hull fill highlight color",
		section = group1Section
	)
	default int getGroup1FillAlpha() {
		return 75;
	}

	@ConfigItem(
		position = 5,
		keyName = "group1Npcs",
		name = "NPCs to highlight with Color 1",
		description = "NPCs to highlight with Color 1",
		section = group1Section
	)
	default String getNpcs1() {
		return "";
	}

	// Group 2
	@ConfigSection(
		name = "Group 2",
		description = "Group 2 highlight list and color",
		position = 2
	)
	String group2Section = "group2";

	@Alpha
	@ConfigItem(
		position = 6,
		keyName = "group2Color",
		name = "Color 2",
		description = "Color for group 2 highlights",
		section = group2Section
	)
	default Color getGroup2Color() {
		return Color.GREEN;
	}

	@Range(
		max = 255
	)
	@ConfigItem(
		position = 7,
		keyName = "group2FillAlpha",
		name = "Fill Alpha 2",
		description = "Alpha (transparency) for hull fill highlight color",
		section = group2Section
	)
	default int getGroup2FillAlpha() {
		return 75;
	}

	@ConfigItem(
		position = 8,
		keyName = "group2Npcs",
		name = "NPCs to highlight with Color 2",
		description = "NPCs to highlight with Color 2",
		section = group2Section
	)
	default String getNpcs2() {
		return "";
	}

	// Group 3
	@ConfigSection(
		name = "Group 3",
		description = "Group 3 highlight list and color",
		position = 3
	)
	String group3Section = "group3";

	@Alpha
	@ConfigItem(
		position = 9,
		keyName = "group3Color",
		name = "Color 3",
		description = "Color for group 3 highlights",
		section = group3Section
	)
	default Color getGroup3Color() {
		return Color.CYAN;
	}

	@Range(
		max = 255
	)
	@ConfigItem(
		position = 10,
		keyName = "group3FillAlpha",
		name = "Fill Alpha 3",
		description = "Alpha (transparency) for hull fill highlight color",
		section = group3Section
	)
	default int getGroup3FillAlpha() {
		return 75;
	}

	@ConfigItem(
		position = 10,
		keyName = "group3Npcs",
		name = "NPCs to highlight with Color 3",
		description = "NPCs to highlight with Color 3",
		section = group3Section
	)
	default String getNpcs3() {
		return "";
	}

	// Group 4
	@ConfigSection(
		name = "Group 4",
		description = "Group 4 highlight list and color",
		position = 4
	)
	String group4Section = "group4";

	@Alpha
	@ConfigItem(
		position = 12,
		keyName = "group4Color",
		name = "Color 4",
		description = "Color for group 4 highlights",
		section = group4Section
	)
	default Color getGroup4Color() {
		return Color.YELLOW;
	}

	@Range(
		max = 255
	)
	@ConfigItem(
		position = 13,
		keyName = "group4FillAlpha",
		name = "Fill Alpha 4",
		description = "Alpha (transparency) for hull fill highlight color",
		section = group4Section
	)
	default int getGroup4FillAlpha() {
		return 75;
	}

	@ConfigItem(
		position = 14,
		keyName = "group4Npcs",
		name = "NPCs to highlight with Color 4",
		description = "NPCs to highlight with Color 4",
		section = group4Section
	)
	default String getNpcs4() {
		return "";
	}

	// Group 5
	@ConfigSection(
		name = "Group 5",
		description = "Group 5 highlight list and color",
		position = 5
	)
	String group5Section = "group5";

	@Alpha
	@ConfigItem(
		position = 15,
		keyName = "group5Color",
		name = "Color 5",
		description = "Color for group 5 highlights",
		section = group5Section
	)
	default Color getGroup5Color() {
		return Color.MAGENTA;
	}

	@Range(
		max = 255
	)
	@ConfigItem(
		position = 16,
		keyName = "group5FillAlpha",
		name = "Fill Alpha 5",
		description = "Alpha (transparency) for hull fill highlight color",
		section = group5Section
	)
	default int getGroup5FillAlpha() {
		return 75;
	}

	@ConfigItem(
		position = 17,
		keyName = "group5Npcs",
		name = "NPCs to highlight with Color 5",
		description = "NPCs to highlight with Color 5",
		section = group5Section
	)
	default String getNpcs5() {
		return "";
	}
}
