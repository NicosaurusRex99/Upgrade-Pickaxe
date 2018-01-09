package naturix.UP.items;

import naturix.UP.UpgradedPickaxe;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DoubleEndedStick extends Item {

	public DoubleEndedStick() {
		super();
		this.setCreativeTab(UpgradedPickaxe.UpgradedPickTab);
		this.setRegistryName("stick");
        this.setUnlocalizedName(UpgradedPickaxe.MODID + ".stick");
        setMaxStackSize(16);
	}
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
