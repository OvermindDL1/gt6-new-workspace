package ic2.api.item;

// No, I don't know why GT6 is binding to an item stack thing that does not exist in IC2...
// Just don't touch this file, it does not get included with the mod in any case.

import net.minecraft.item.ItemStack;

public abstract interface IItemReactorPlanStorage
{
  public abstract boolean isPlanStorage(ItemStack paramItemStack);
  
  public abstract boolean setSetup(ItemStack paramItemStack, String paramString);
  
  public abstract void setPlanName(ItemStack paramItemStack, String paramString);
  
  public abstract boolean hasSetup(ItemStack paramItemStack);
  
  public abstract String getSetup(ItemStack paramItemStack);
}