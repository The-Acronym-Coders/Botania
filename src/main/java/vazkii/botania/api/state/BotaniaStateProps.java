package vazkii.botania.api.state;

import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.EnumFacing;
import vazkii.botania.api.state.enums.*;

/**
 * Holds all Botania block state properties. Use these to set botania blockstates
 */
public class BotaniaStateProps {

    /** Common properties to all blocks to use **/

    // The 16 Minecraft colors
    public static final PropertyEnum COLOR = PropertyEnum.create("color", EnumDyeColor.class);

    // The four cardinal directions
    public static final PropertyEnum CARDINALS = PropertyEnum.create("facing", EnumFacing.class, EnumFacing.Plane.HORIZONTAL);

    // All 6 directions
    public static final PropertyEnum FACING = PropertyEnum.create("facing", EnumFacing.class);

    // Redstone power - boolean
    // Also for any other simple boolean "on/off" state
    public static final PropertyBool POWERED = PropertyBool.create("powered");

    // Redstone power - int
    public static final PropertyInteger POWER = PropertyInteger.create("power", 0, 15);

    /** Properties for individual blocks **/

    // BlockAltGrass
    public static final PropertyEnum ALTGRASS_VARIANT = PropertyEnum.create("variant", AltGrassVariant.class);

    // BlockDreamWood, BlockLivingWood
    public static final PropertyEnum LIVINGWOOD_VARIANT = PropertyEnum.create("variant", LivingWoodVariant.class);

    // BlockLivingRock
    public static final PropertyEnum LIVINGROCK_VARIANT = PropertyEnum.create("variant", LivingRockVariant.class);

    // BlockOpenCrate
    public static final PropertyEnum CRATE_VARIANT = PropertyEnum.create("variant", CrateVariant.class);

    // BlockPlatform
    public static final PropertyEnum PLATFORM_VARIANT = PropertyEnum.create("variant", PlatformVariant.class);

    // BlockPylon
    public static final PropertyEnum PYLON_VARIANT = PropertyEnum.create("variant", PylonVariant.class);

    private BotaniaStateProps() {}
}
