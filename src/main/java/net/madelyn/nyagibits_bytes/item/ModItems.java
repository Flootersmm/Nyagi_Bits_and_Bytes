package net.madelyn.nyagibits_bytes.item;

import net.madelyn.nyagibits_bytes.NyagiBits_Bytes;
import net.madelyn.nyagibits_bytes.fluid.ModFluids;
import net.madelyn.nyagibits_bytes.item.custom.*;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, NyagiBits_Bytes.MOD_ID);

  /*--------------------------------------------------------------------------------------
  Item authors:
  Nyagi: [Livisite_Alloy, Livisite Slate, Crude Abrasive, Pile of Cogs, Pile of
  Crude Mechanical Parts, crude/static/entropy science, Soil Sample, Sturdy Box
          Sealed Pouch, Lab Notebook, Lab Notebook with Crude/Static/Entropy
  Data, Ae2 Schematic, Pen, Pen Assembly, Ball Bearing, Thin Casing, Tiny
  Spring, Ink Cartridge, Ink] Flooter: []

  Texture authors:
  SoulRacer: [Livisite_Alloy, Crude Abrasive, Pile of Cogs, Pile of Crude
  Mechanical Parts]
  ---------------------------------------------------------------------------------------*/

  // Textures are present in the path : resources > assets > nyagibits_byte >
  // models > item Item lang is in the path : resources > assets >
  // nyagibits_byte > lang > en_us.json Adding items here

  //--------------------------------------------------------------------------------------

  /*
     GENERIC ITEMS
   */

  // Inert God Heart 10/14/24 - Nyagi
  public static final RegistryObject<Item> Inert_God_Heart =
      ITEMS.register("inert_god_heart",
                     ()
                         -> new CuriosRingItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

  // Tier 0 Strawberry added 2/21/23 - Nyagi
  public static final RegistryObject<Item> Tier_Zero_Strawberry =
      ITEMS.register("tier_zero_strawberry",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Tier 0 Golden Strawberry added 2/21/23 - Nyagi
  public static final RegistryObject<Item> Golden_Tier_Zero_Strawberry =
      ITEMS.register("golden_tier_zero_strawberry",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Tier 1 Strawberry added 2/21/23 - Nyagi
  public static final RegistryObject<Item> Tier_One_Strawberry =
      ITEMS.register("tier_one_strawberry",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Tier 1 Golden Strawberry added 2/21/23 - Nyagi
  public static final RegistryObject<Item> Golden_Tier_One_Strawberry =
      ITEMS.register("golden_tier_one_strawberry",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Tier 2 Strawberry added 5/16/23 - Nyagi
  public static final RegistryObject<Item> Tier_Two_Strawberry =
      ITEMS.register("tier_two_strawberry",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Tier 2 Golden Strawberry added 5/16/23 - Nyagi
  public static final RegistryObject<Item> Golden_Tier_Two_Strawberry =
      ITEMS.register("golden_tier_two_strawberry",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

  // Livisite Alloy added 7/11/23 - Nyagi
  public static final RegistryObject<Item> Livisite_Alloy =
      ITEMS.register("livisite_alloy",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Livisite Slate added 7/11/23 - Nyagi
  public static final RegistryObject<Item> Livisite_Slate =
      ITEMS.register("livisite_slate",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Crude Abrasive added 7/11/23 - Nyagi
  public static final RegistryObject<Item> Crude_Abrasive =
      ITEMS.register("crude_abrasive",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Pile of Cogs added 7/11/23 - Nyagi
  public static final RegistryObject<Item> Pile_of_Cogs =
      ITEMS.register("pile_of_cogs",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Pile of Crude Mechanical Parts added 7/11/23 - Nyagi
  public static final RegistryObject<Item> Pile_of_Crude_Mechanical_Parts =
      ITEMS.register("pile_of_crude_mechanical_parts",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Soil Sample added 7/25/23 - Nyagi
  public static final RegistryObject<Item> Soil_Sample =
      ITEMS.register("soil_sample",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Sturdy Box added 7/25/23 - Nyagi
  public static final RegistryObject<Item> Sturdy_Box =
      ITEMS.register("sturdy_box",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Sealed Pouch added 7/25/23 - Nyagi
  public static final RegistryObject<Item> Sealed_Pouch =
      ITEMS.register("sealed_pouch",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Salt Water added 7/25/23 - Nyagi
  public static final RegistryObject<Item> Salt_Water =
      ITEMS.register("bucket_of_salt_water",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Torn Wool Ball added 7/25/23 - Nyagi
  public static final RegistryObject<Item> Torn_Wool_Ball =
      ITEMS.register("torn_wool_ball",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Etched Redstone Plate added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Etched_Redstone_Plate =
      ITEMS.register("etched_redstone_plate",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Crude Silicon Boule added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Crude_Silicon_Boule =
      ITEMS.register("crude_silicon_boule",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Diamond Shard added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Diamond_Shard =
      ITEMS.register("diamond_shard",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Logic Dud added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Logic_Dud =
      ITEMS.register("logic_dud",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Incomplete Logic Dud added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Logic_Dud =
      ITEMS.register("incomplete_logic_dud",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Calculation Dud added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Calculation_Dud =
      ITEMS.register("calculation_dud",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Incomplete Calculation Dud added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Calculation_Dud =
      ITEMS.register("incomplete_calculation_dud",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Engineering Dud added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Engineering_Dud =
      ITEMS.register("engineering_dud",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Incomplete Calculation Dud added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Engineering_Dud =
      ITEMS.register("incomplete_engineering_dud",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Bottle of Anthocyanin added 8/27/23 - Nyagi
  public static final RegistryObject<Item> Bottle_Of_Anthocyanin =
      ITEMS.register("bottle_of_anthocyanin",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Bottle of Malic & Citric Acid added 8/27/23 - Nyagi
  public static final RegistryObject<Item> Bottle_Of_Malic_And_Citric_Acid =
      ITEMS.register("bottle_of_malic_and_citric_acid",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Chemistry Rack added 8/27/23 - Nyagi
  public static final RegistryObject<Item> Chemistry_Rack =
      ITEMS.register("chemistry_rack",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Basic Composite Material added 8/27/23 - Nyagi
  public static final RegistryObject<Item> Basic_Composite_Material =
      ITEMS.register("basic_composite_material",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Basic Composite Plate added 8/27/23 - Nyagi
  public static final RegistryObject<Item> Basic_Composite_Plate =
      ITEMS.register("basic_composite_plate",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Compacted Soil added 3/17/24 - Nyagi
  public static final RegistryObject<Item> Compacted_Soil =
      ITEMS.register("compacted_soil",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Tough Bag added 3/17/24 - Nyagi
  public static final RegistryObject<Item> Tough_Bag =
      ITEMS.register("tough_bag",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Empty Petri Dish added 3/20/24 - Nyagi
  public static final RegistryObject<Item> Petri_Dish =
      ITEMS.register("petri_dish_empty",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Agar-Gel added 3/25/24 - Nyagi
  public static final RegistryObject<Item> Agar_Gel =
      ITEMS.register("agar_gel",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Agar-Flakes added 3/25/24 - Nyagi
  public static final RegistryObject<Item> Agar_Flakes =
      ITEMS.register("agar_flakes",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Agar-Powder added 3/25/24 - Nyagi
  public static final RegistryObject<Item> Agar_Powder =
      ITEMS.register("agar_powder",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Agar-Agar added 3/20/24 - Nyagi
  public static final RegistryObject<Item> Agar_Agar =
      ITEMS.register("agar_agar",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Agar-Agar Petri Dish added 3/20/24 - Nyagi
  public static final RegistryObject<Item> Petri_Dish_Agar_Agar =
      ITEMS.register("petri_dish_agar_agar",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Sponged Steel added 3/25/24 - Nyagi
  public static final RegistryObject<Item> Sponged_Steel =
      ITEMS.register("sponged_steel",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Sodium Polyacrylate added 3/26/24 - Nyagi
  public static final RegistryObject<Item> Sodium_Polyacrylate =
      ITEMS.register("sodium_polyacrylate",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Endoflame Mush added 3/26/24 - Nyagi
  public static final RegistryObject<Item> Endoflame_Mush =
      ITEMS.register("endoflame_mush",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Hydroangeas Mush added 7/20/24 - Nyagi
  public static final RegistryObject<Item> Hydroangeas_Mush =
      ITEMS.register("hydroangeas_mush",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Gourmaryllis Mush added 7/20/24 - Nyagi
  public static final RegistryObject<Item> Gourmaryllis_Mush =
      ITEMS.register("gourmaryllis_mush",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Thermalily Mush added 7/20/24 - Nyagi
  public static final RegistryObject<Item> Thermalily_Mush =
      ITEMS.register("thermalily_mush",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Entropinnyum Mush added 7/20/24 - Nyagi
  public static final RegistryObject<Item> Entropinnyum_Mush =
      ITEMS.register("entropinnyum_mush",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Munchdew Mush added 7/20/24 - Nyagi
  public static final RegistryObject<Item> Munchdew_Mush =
      ITEMS.register("munchdew_mush",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Narslimmus Mush added 7/20/24 - Nyagi
  public static final RegistryObject<Item> Narslimmus_Mush =
      ITEMS.register("narslimmus_mush",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Rosa Arcana Mush added 7/20/24 - Nyagi
  public static final RegistryObject<Item> Rosa_Arcana_Mush =
      ITEMS.register("rosa_arcana_mush",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Manasteel Lattice added 3/26/24 - Nyagi
  public static final RegistryObject<Item> Manasteel_Lattice =
      ITEMS.register("manasteel_lattice",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Rune Binder added 3/26/24 - Nyagi
  public static final RegistryObject<Item> Rune_Binder =
      ITEMS.register("rune_binder",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Rubberized Cable added 4/10/24 - Nyagi
  public static final RegistryObject<Item> Rubberized_Cable =
      ITEMS.register("rubberized_cable",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Ceramic added 4/10/24 - Nyagi
  public static final RegistryObject<Item> Ceramic =
      ITEMS.register("ceramic",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Activated Charcoal added 4/10/24 - Nyagi
  public static final RegistryObject<Item> Activated_Charcoal =
      ITEMS.register("activated_charcoal",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Sturdy Tray added 4/10/24 - Nyagi
  public static final RegistryObject<Item> Sturdy_Tray =
      ITEMS.register("sturdy_tray",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Beaker added 4/10/24 - Nyagi
  public static final RegistryObject<Item> Beaker =
      ITEMS.register("beaker",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Round Bottom Flask added 4/10/24 - Nyagi
  public static final RegistryObject<Item> Round_Bottom_Flask =
      ITEMS.register("round_bottom_flask",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Distillation Column added 4/10/24 - Nyagi
  public static final RegistryObject<Item> Distillation_Column =
      ITEMS.register("distillation_column",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Inlet added 4/10/24 - Nyagi
  public static final RegistryObject<Item> Inlet =
      ITEMS.register("inlet",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Burette added 4/10/24 - Nyagi
  public static final RegistryObject<Item> Burette =
      ITEMS.register("burette",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Sterilized Quartz Glass added 4/10/24 - Nyagi
  public static final RegistryObject<Item> Sterilized_Quartz_Glass =
      ITEMS.register("sterilized_quartz_glass",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // pH Strip added 4/10/24 - Nyagi
  public static final RegistryObject<Item> PH_Strip =
      ITEMS.register("ph_strip",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Bottle of Vinegar added 4/10/24 - Nyagi
  public static final RegistryObject<Item> Bottle_Of_Vinegar =
      ITEMS.register("bottle_of_vinegar",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Low Grade Coke added 4/21/24 - Nyagi
  public static final RegistryObject<Item> Low_Grade_Coke =
      ITEMS.register("low_grade_coke",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Industrial Grade Coke added 4/21/24 - Nyagi
  public static final RegistryObject<Item> Industrial_Grade_Coke =
      ITEMS.register("industrial_grade_coke",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Wrought Ball Bearing added 4/21/24 - Nyagi
  public static final RegistryObject<Item> Wrought_Ball_Bearing =
      ITEMS.register("wrought_ball_bearing",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Wrought Tiny Spring added 4/21/24 - Nyagi
  public static final RegistryObject<Item> Wrought_Tiny_Spring =
      ITEMS.register("wrought_tiny_spring",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Wrought Iron Rod added 4/21/24 - Nyagi
  public static final RegistryObject<Item> Wrought_Iron_Rod =
      ITEMS.register("wrought_iron_rod",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Mixed Seeds added 4/21/24 - Nyagi
  public static final RegistryObject<Item> Mixed_Seeds =
      ITEMS.register("mixed_seeds",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Hard Hat added 4/21/24 - Nyagi
  public static final RegistryObject<Item> Hard_Hat =
      ITEMS.register("hard_hat",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Protective Eye-wear added 5/1/24 - Nyagi
  public static final RegistryObject<Item> Protective_Eye_Wear =
      ITEMS.register("protective_eye_wear",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Fire Extinguisher added 5/1/24 - Nyagi
  public static final RegistryObject<Item> Fire_Extinguisher =
      ITEMS.register("fire_extinguisher",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Organic Vapor Respirator added 5/1/24 - Nyagi
  public static final RegistryObject<Item> Organic_Vapor_Respirator =
      ITEMS.register("organic_vapor_respirator",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Hardened Mechanical Bearing added 5/1/24 - Nyagi
  public static final RegistryObject<Item> Hardened_Mechanical_Bearing =
      ITEMS.register("hardened_mechanical_bearing",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Fasteners added 5/1/24 - Nyagi
  public static final RegistryObject<Item> Fasteners =
      ITEMS.register("fasteners",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Synchronous Electric Motor added 5/1/24 - Nyagi
  public static final RegistryObject<Item> Synchronous_Electric_Motor =
      ITEMS.register("synchronous_electric_motor",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Industrial Gear added 5/1/24 - Nyagi
  public static final RegistryObject<Item> Industrial_Gear =
      ITEMS.register("industrial_gear",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Dampener added 5/1/24 - Nyagi
  public static final RegistryObject<Item> Dampener =
      ITEMS.register("dampener",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Reinforced Gearbox added 5/1/24 - Nyagi
  public static final RegistryObject<Item> Reinforced_Gearbox =
      ITEMS.register("reinforced_gearbox",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // V-Belt added 5/1/24 - Nyagi
  public static final RegistryObject<Item> V_Belt =
      ITEMS.register("v_belt",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Solenoid Component added 5/1/24 - Nyagi
  public static final RegistryObject<Item> Solenoid_Component =
      ITEMS.register("solenoid_component",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Flux Mixture added 5/8/24- Nyagi
  public static final RegistryObject<Item> Flux_Mixture =
      ITEMS.register("flux_mixture",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Damascus Steel added 5/13/24- Nyagi
  public static final RegistryObject<Item> Steel_Damascus =
      ITEMS.register("steel_damascus",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // High Carbon Steel - 1080 added 5/13/24- Nyagi
  public static final RegistryObject<Item> Steel_High_Carbon_1080 =
      ITEMS.register("steel_high_carbon_1080",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // High Carbon Steel - 15N20 added 5/13/24- Nyagi
  public static final RegistryObject<Item> Steel_High_Carbon_15N20 =
      ITEMS.register("steel_high_carbon_15n20",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Stainless Steel added 5/13/24- Nyagi
  public static final RegistryObject<Item> Steel_Stainless =
      ITEMS.register("steel_stainless",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Aluminum Trichloride added 5/16/24- Nyagi
  public static final RegistryObject<Item> Aluminum_Trichloride =
      ITEMS.register("aluminum_trichloride",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Toluene added 5/16/24- Nyagi
  public static final RegistryObject<Item> Toluene =
      ITEMS.register("toluene",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Mononitrotoluene added 5/16/24- Nyagi
  public static final RegistryObject<Item> Mononitrotoluene =
      ITEMS.register("mononitrotoluene",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Dinitrotoluene added 5/16/24- Nyagi
  public static final RegistryObject<Item> Dinitrotoluene =
      ITEMS.register("dinitrotoluene",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // 2-4-6 Trinitrotoluene added 5/16/24- Nyagi
  public static final RegistryObject<Item> Trinitrotoluene =
      ITEMS.register("trinitrotoluene",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Methyl Chloride added 5/16/24- Nyagi
  public static final RegistryObject<Item> Methyl_Chloride =
      ITEMS.register("methyl_chloride",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Oleum added 5/16/24- Nyagi
  public static final RegistryObject<Item> Oleum =
      ITEMS.register("oleum",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Chromium Trioxide added 5/22/24- Nyagi
  public static final RegistryObject<Item> Chromium_Trioxide =
      ITEMS.register("chromium_trioxide",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Ethylene Oxide added 5/22/24- Nyagi
  public static final RegistryObject<Item> Ethylene_Oxide =
      ITEMS.register("ethylene_oxide",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Benzyl Alcohol added 5/22/24- Nyagi
  public static final RegistryObject<Item> Benzyl_Alcohol =
      ITEMS.register("benzyl_alcohol",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // 2-Phenoxyethanol added 5/22/24- Nyagi
  public static final RegistryObject<Item> Two_Phenoxyethanol =
      ITEMS.register("2_phenoxyethanol",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Low Voltage Capacitor added 6/5/24- Nyagi
  public static final RegistryObject<Item> Low_Voltage_Capacitor =
      ITEMS.register("low_voltage_capacitor",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Threaded Composite Leather added 6/5/24- Nyagi
  public static final RegistryObject<Item> Threaded_Composite_Leather =
      ITEMS.register("threaded_composite_leather",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Industrial Composite Plate added 6/5/24- Nyagi
  public static final RegistryObject<Item> Industrial_Composite_Plate =
      ITEMS.register("industrial_composite_plate",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Lead-Acid Cell added 6/5/24- Nyagi
  public static final RegistryObject<Item> Lead_Acid_Cell =
      ITEMS.register("lead_acid_cell",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Heavy Plating added 6/5/24- Nyagi
  public static final RegistryObject<Item> Heavy_Plating =
      ITEMS.register("heavy_plating",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Soldering Iron added 6/5/24- Nyagi
  public static final RegistryObject<Item> Soldering_Iron =
      ITEMS.register("soldering_iron",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Low Temperature Solder added 6/5/24- Nyagi
  public static final RegistryObject<Item> Low_Temperature_Solder =
      ITEMS.register("low_temperature_solder",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Ceramic Encased Copper added 6/5/24- Nyagi
  public static final RegistryObject<Item> Ceramic_Encased_Copper =
      ITEMS.register("ceramic_encased_copper",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Hydraulic Hammer added 6/5/24- Nyagi
  public static final RegistryObject<Item> Hydraulic_Hammer =
      ITEMS.register("hydraulic_hammer",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Tempered Glass added 6/5/24- Nyagi
  public static final RegistryObject<Item> Tempered_Glass =
      ITEMS.register("tempered_glass",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Annealed Glass added 6/5/24- Nyagi
  public static final RegistryObject<Item> Annealed_Glass =
      ITEMS.register("annealed_glass",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Tungsten Wire added 6/5/24- Nyagi
  public static final RegistryObject<Item> Tungsten_Wire =
      ITEMS.register("tungsten_wire",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Woven Cloth added 6/5/24- Nyagi
  public static final RegistryObject<Item> Woven_Cloth =
      ITEMS.register("woven_cloth",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Solder Wire added 6/8/24- Nyagi
  public static final RegistryObject<Item> Solder_Wire =
      ITEMS.register("solder_wire",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Fluorophlogopite added 6/28/24- Nyagi
  public static final RegistryObject<Item> Fluorophlogopite =
      ITEMS.register("fluorophlogopite",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Synthetic Mica added 6/28/24- Nyagi
  public static final RegistryObject<Item> Synthetic_Mica =
      ITEMS.register("synthetic_mica",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // TPV Cell added 6/28/24- Nyagi
  public static final RegistryObject<Item> TPV_Cell =
      ITEMS.register("tpv_cell",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Polycrystalline Silicon Carbide added 6/28/24- Nyagi
  public static final RegistryObject<Item> Polycrystalline_Silicon_Carbide =
      ITEMS.register("polycrystalline_silicon_carbide",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Zinc-Gallium-Antimony Alloy added 6/28/24- Nyagi
  public static final RegistryObject<Item> Zinc_Gallium_Antimony_Alloy =
      ITEMS.register("zinc_gallium_antimony_alloy",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Ash  added 7/15/24- Nyagi
  public static final RegistryObject<Item> Ash =
      ITEMS.register("ash",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Potash  added 7/15/24- Nyagi
  public static final RegistryObject<Item> Potash =
      ITEMS.register("potash",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Wood Ash  added 7/15/24- Nyagi
  public static final RegistryObject<Item> Wood_Ash =
      ITEMS.register("wood_ash",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Metamorphic Alloy  added 7/15/24- Nyagi
  public static final RegistryObject<Item> Metamorphic_Alloy =
      ITEMS.register("metamorphic_alloy",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Ore Extraction Plate  added 7/15/24- Nyagi
  public static final RegistryObject<Item> Ore_Extraction_Plate =
      ITEMS.register("ore_extraction_plate",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Chromatic Compound  added 8/3/24- Barza
  public static final RegistryObject<Item> Chromatic_Compound =
      ITEMS.register("chromatic_compound",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Refined Radiance  added 8/3/24- Barza
  public static final RegistryObject<Item> Refined_Radiance =
      ITEMS.register("refined_radiance",
                     ()
                         -> new LevitatingItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Shadow Steel  added 8/3/24- Barza
  public static final RegistryObject<Item> Shadow_Steel =
      ITEMS.register("shadow_steel",
                     ()
                         -> new LevitatingItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

  // Ae2 Assembly added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Ae2_Assembly =
      ITEMS.register("ae2_assembly",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Crystal_Harmonizer added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Crystal_Harmonizer =
      ITEMS.register("crystal_harmonizer",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Processor_Stack added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Processor_Stack =
      ITEMS.register("processor_stack",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Energized_Frame added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Energized_Frame =
      ITEMS.register("energized_frame",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Energized_Wires added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Energized_Wires =
      ITEMS.register("energized_wires",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Skystone Shielding added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Skystone_Shielding =
      ITEMS.register("skystone_shielding",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Matter Converters added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Matter_Converters =
      ITEMS.register("matter_converters",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Decorative Paneling added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Decorative_Paneling =
      ITEMS.register("decorative_paneling",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // MicroTools added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Micro_Tools =
      ITEMS.register("micro_tools",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Incomplete Controller added 2/20/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Controller =
      ITEMS.register("incomplete_controller",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Cell Workbench added 2/20/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Cell_Workbench =
      ITEMS.register("incomplete_cell_workbench",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Item Cell Housing added 2/20/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Item_Cell_Housing =
      ITEMS.register("incomplete_me_item_cell_housing",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Charged Quartz Fixture added 2/20/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Charged_Quartz_Fixture =
      ITEMS.register("incomplete_charged_quartz_fixture",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Skystone Tank added 2/20/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Skystone_Tank =
      ITEMS.register("incomplete_skystone_tank",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Interface added 2/20/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Interface =
      ITEMS.register("incomplete_me_interface",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Charger added 2/20/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Charger = ITEMS.register(
      "incomplete_charger",
      ()
          -> new Item(new Item.Properties().tab(
              ModCreativeModeTab.NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete 1k ME Storage Component added 2/20/24 - Nyagi
  public static final RegistryObject<Item>
      Incomplete_OneK_ME_Storage_Component = ITEMS.register(
          "incomplete_onek_me_storage_component",
          ()
              -> new Item(new Item.Properties().tab(
                  ModCreativeModeTab
                      .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Inscriber added 2/20/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Inscriber =
      ITEMS.register("incomplete_inscriber",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Fluix ME Glass Cable added 2/20/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Fluix_ME_Glass_Cable =
      ITEMS.register("incomplete_fluix_me_glass_cable",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Fluix ME Smart Cable added 2/20/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Fluix_ME_Smart_Cable =
      ITEMS.register("incomplete_fluix_me_smart_cable",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Fluix ME Dense Smart Cable added 2/20/24 - Nyagi
  public static final RegistryObject<Item>
      Incomplete_Fluix_ME_Dense_Smart_Cable = ITEMS.register(
          "incomplete_fluix_me_dense_smart_cable",
          ()
              -> new Item(new Item.Properties().tab(
                  ModCreativeModeTab
                      .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Drive added 2/20/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Drive = ITEMS.register(
      "incomplete_me_drive",
      ()
          -> new Item(new Item.Properties().tab(
              ModCreativeModeTab.NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Chest added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Chest = ITEMS.register(
      "incomplete_me_chest",
      ()
          -> new Item(new Item.Properties().tab(
              ModCreativeModeTab.NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Vibration Chamber added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Vibration_Chamber =
      ITEMS.register("incomplete_vibration_chamber",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Light Detecting Fixture added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Light_Detecting_Fixture =
      ITEMS.register("incomplete_light_detecting_fixture",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Illuminated Panel added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Illuminated_Panel =
      ITEMS.register("incomplete_illuminated_panel",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Storage Bus added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Storage_Bus =
      ITEMS.register("incomplete_me_storage_bus",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Import Bus added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Import_Bus =
      ITEMS.register("incomplete_me_import_bus",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Export Bus added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Export_Bus =
      ITEMS.register("incomplete_me_export_bus",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Level Emitter added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Level_Emitter =
      ITEMS.register("incomplete_me_level_emitter",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Energy Level Emitter added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Energy_Level_Emitter =
      ITEMS.register("incomplete_me_energy_level_emitter",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Annihilation Plane added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Annihilation_Plane =
      ITEMS.register("incomplete_me_annihilation_plane",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Formation Plane added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Formation_Plane =
      ITEMS.register("incomplete_me_formation_plane",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Terminal added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Terminal =
      ITEMS.register("incomplete_me_terminal",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Crafting Terminal added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Crafting =
      ITEMS.register("incomplete_me_crafting_terminal",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME p2p Tunnel added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_pTwop_Tunnel =
      ITEMS.register("incomplete_me_ptwop_tunnel",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Security Terminal added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Security_Terminal =
      ITEMS.register("incomplete_me_security_terminal",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME IO Port added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_IO_Port =
      ITEMS.register("incomplete_me_io_port",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Energy Cell added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Energy_Cell =
      ITEMS.register("incomplete_me_energy_cell",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Storage Monitor added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Storage_Monitor =
      ITEMS.register("incomplete_me_storage_monitor",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Color Applicator added 2/21/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Color_Applicator =
      ITEMS.register("incomplete_color_applicator",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Logic Processor added 2/22/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Logic_Processor =
      ITEMS.register("incomplete_logic_processor",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Calculation Processor added 2/22/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Calculation_Processor =
      ITEMS.register("incomplete_calculation_processor",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Engineering Processor added 2/22/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Engineering_Processor =
      ITEMS.register("incomplete_engineering_processor",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete ME Fluid Cell Housing added 2/22/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_ME_Fluid_Cell_Housing =
      ITEMS.register("incomplete_me_fluid_cell_housing",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));
  // Incomplete Energy Acceptor added 2/22/24 - Nyagi
  public static final RegistryObject<Item> Incomplete_Energy_Acceptor =
      ITEMS.register("incomplete_energy_acceptor",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab
                                 .NYAGIBITS_BYTES_INCOMPLETE_SEQUENCE_ITEMS)));

  // Botania Assembly added 3/17/24- Nyagi
  public static final RegistryObject<Item> Botania_Assembly =
      ITEMS.register("botania_assembly",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Semi-organic Substrate added 3/17/24- Nyagi
  public static final RegistryObject<Item> Semi_Organic_Substrate =
      ITEMS.register("semi_organic_substrate",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Soil Conditioner added 3/17/24- Nyagi
  public static final RegistryObject<Item> Soil_Conditioner =
      ITEMS.register("soil_conditioner",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Living Frame added 3/17/24- Nyagi
  public static final RegistryObject<Item> Living_Frame =
      ITEMS.register("living_frame",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Terrarium added 3/17/24- Nyagi
  public static final RegistryObject<Item> Terrarium =
      ITEMS.register("terrarium",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Organic Pseudo Logic added 3/17/24- Nyagi
  public static final RegistryObject<Item> Organic_Pseudo_Logic =
      ITEMS.register("organic_pseudo_logic",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Sealant added 3/17/24- Nyagi
  public static final RegistryObject<Item> Sealant =
      ITEMS.register("sealant",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Magnetic Hematite added 3/17/24- Nyagi
  public static final RegistryObject<Item> Magnetic_Hematite =
      ITEMS.register("magnetic_hematite",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Mystic Fertilizer added 3/17/24- Nyagi
  public static final RegistryObject<Item> Mystic_Fertilizer =
      ITEMS.register("mystic_fertilizer",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

  // Alchemistry Assembly added 4/6/24- Nyagi
  public static final RegistryObject<Item> Alchemistry_Assembly =
      ITEMS.register("alchemistry_assembly",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Electrolytic Core added 4/6/24- Nyagi
  public static final RegistryObject<Item> Electrolytic_Core =
      ITEMS.register("electrolytic_core",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Desiccation Powder added 4/6/24- Nyagi
  public static final RegistryObject<Item> Desiccation_Powder =
      ITEMS.register("desiccation_powder",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Chemical Grade Glassware added 4/6/24- Nyagi
  public static final RegistryObject<Item> Chemical_Grade_Glassware =
      ITEMS.register("chemical_grade_glassware",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Fume Fan added 4/6/24- Nyagi
  public static final RegistryObject<Item> Fume_Fan =
      ITEMS.register("fume_fan",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Chemically Inert Wood added 4/6/24- Nyagi
  public static final RegistryObject<Item> Chemically_Inert_Wood =
      ITEMS.register("chemically_inert_wood",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // pH Strips added 4/6/24- Nyagi
  public static final RegistryObject<Item> PH_Strips =
      ITEMS.register("ph_strips",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Chromatography Kit added 4/6/24- Nyagi
  public static final RegistryObject<Item> Chromatography_Kit =
      ITEMS.register("chromatography_kit",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Bunsen Burner added 4/6/24- Nyagi
  public static final RegistryObject<Item> Bunsen_Burner =
      ITEMS.register("bunsen_burner",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

  // Immersive Assembly added 4/25/24- Nyagi
  public static final RegistryObject<Item> Immersive_Assembly =
      ITEMS.register("immersive_assembly",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // High Temperature Heat Exchanger added 4/25/24- Nyagi
  public static final RegistryObject<Item> High_Temperature_Heat_Exchanger =
      ITEMS.register("high_temperature_heat_exchanger",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Duct Tape added 4/25/24- Nyagi
  public static final RegistryObject<Item> Duct_Tape =
      ITEMS.register("duct_tape",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // WD40 added 4/25/24- Nyagi
  public static final RegistryObject<Item> WD40 =
      ITEMS.register("wd_40",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // 79" x 28" TRIPLE-BAY 4s SERIES TOOLBOX added 4/25/24- Nyagi
  public static final RegistryObject<Item> Triple_Bay_4s_Series_Toolbox =
      ITEMS.register("triple_bay_4s_series_toolbox",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Acetylene Tank added 4/25/24- Nyagi
  public static final RegistryObject<Item> Acetylene_tank =
      ITEMS.register("acetylene_tank",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // OSHA Approved Gear added 4/25/24- Nyagi
  public static final RegistryObject<Item> OSHA_Approved_Gear =
      ITEMS.register("osha_approved_gear",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Crate Of Industrial Components added 4/25/24- Nyagi
  public static final RegistryObject<Item> Crate_Of_Industrial_Components =
      ITEMS.register("crate_of_industrial_components",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // High Strength Concrete added 4/25/24- Nyagi
  public static final RegistryObject<Item> High_Strength_Concrete =
      ITEMS.register("high_strength_concrete",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

  // Blank Rune added 3/8/24 - Nyagi
  public static final RegistryObject<Item> Rune_Blank =
      ITEMS.register("rune_blank",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Optical Rune added 3/8/24 - Nyagi
  public static final RegistryObject<Item> Rune_Optical =
      ITEMS.register("rune_optical",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Velocity Rune added 3/8/24 - Nyagi
  public static final RegistryObject<Item> Rune_Velocity =
      ITEMS.register("rune_velocity",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Inertia Rune added 3/8/24 - Nyagi
  public static final RegistryObject<Item> Rune_Inertia =
      ITEMS.register("rune_inertia",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Thermodynamic Rune added 3/8/24 - Nyagi
  public static final RegistryObject<Item> Rune_Thermodynamic =
      ITEMS.register("rune_thermodynamic",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Magnetic Rune added 3/8/24 - Nyagi
  public static final RegistryObject<Item> Rune_Magnetic =
      ITEMS.register("rune_magnetic",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Catalytic Rune added 3/8/24 - Nyagi
  public static final RegistryObject<Item> Rune_Catalytic =
      ITEMS.register("rune_catalytic",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  // Computational Rune added 3/8/24 - Nyagi
  public static final RegistryObject<Item> Rune_Computational =
      ITEMS.register("rune_computational",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  /*
  //Geology Rune added 3/8/24 - Nyagi
  public static final RegistryObject<Item>
          Rune_Geology = ITEMS.register("rune_geology", () -> new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  //Lithography Rune added 3/8/24 - Nyagi
  public static final RegistryObject<Item>
          Rune_Lithography = ITEMS.register("rune_lithography", () -> new
  Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  //Molecular Rune added 3/8/24 - Nyagi
  public static final RegistryObject<Item>
          Rune_Molecular = ITEMS.register("rune_molecular", () -> new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  //Flake Blank Rune added 3/8/24 - Nyagi
  public static final RegistryObject<Item>
          Rune_Flake_Blank = ITEMS.register("rune_flake_blank", () -> new
  Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Electromagnetic Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Electromagnetic = ITEMS.register("rune_electromagnetic", ()
  -> new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Weak Nuclear Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Weak_Nuclear = ITEMS.register("rune_weak_nuclear", () -> new
  Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Strong Nuclear Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Strong_Nuclear = ITEMS.register("rune_strong_nuclear", () ->
  new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Gravity Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Gravity = ITEMS.register("rune_gravity", () -> new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Time Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Time = ITEMS.register("rune_time", () -> new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Dilation Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Dilation = ITEMS.register("rune_dilation", () -> new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Entanglement Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Entanglement = ITEMS.register("rune_entanglement", () -> new
  Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Tunneling Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Tunneling = ITEMS.register("rune_tunneling", () -> new
  Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Baryonic Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Baryonic = ITEMS.register("rune_baryonic", () -> new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Non-Euclidean Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Non_Euclidean = ITEMS.register("rune_non_euclidean", () ->
  new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Singularity Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Singularity = ITEMS.register("rune_singularity", () -> new
  Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Higgs Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Higgs = ITEMS.register("rune_higgs", () -> new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Planck Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Planck = ITEMS.register("rune_planck", () -> new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Void Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Void = ITEMS.register("rune_void", () -> new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Eternity Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Eternity = ITEMS.register("rune_eternity", () -> new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Hatred Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Hatred = ITEMS.register("rune_hatred", () -> new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Aethereal Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Aethereal = ITEMS.register("rune_aethereal", () -> new
  Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Quintessence Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Quintessence = ITEMS.register("rune_quintessence", () -> new
  Item(new Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Corpse Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Corpse = ITEMS.register("rune_corpse", () -> new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
      //Inflaton Rune added 3/8/24 - Nyagi
      public static final RegistryObject<Item>
              Rune_Inflaton = ITEMS.register("rune_inflaton", () -> new Item(new
  Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
              */

  /*
     SCIENCE ITEMS REGISTRATION
   */
  // Used/Crude Compression Test added 7/18/23 - Nyagi
  public static final RegistryObject<Item> Crude_Compression_Test =
      ITEMS.register("crude_compression_test",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
  public static final RegistryObject<Item> Used_Crude_Compression_Test =
      ITEMS.register(
          "used_crude_compression_test",
          ()
              -> new CustomTooltipItem(new Item.Properties().tab(
                  ModCreativeModeTab
                      .NYAGIBITS_BYTES_SCIENCE))); // Used/Crude Compression
                                                   // Test added 7/18/23 - Nyagi
  // Used/Crude Statics Test added 7/18/23 - Nyagi
  public static final RegistryObject<Item> Crude_Statics_Test =
      ITEMS.register("crude_statics_test",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
  public static final RegistryObject<Item> Used_Crude_Statics_Test =
      ITEMS.register(
          "used_crude_statics_test",
          ()
              -> new CustomTooltipItem(new Item.Properties().tab(
                  ModCreativeModeTab
                      .NYAGIBITS_BYTES_SCIENCE))); // Used/Crude Compression
                                                   // Test added 7/18/23 - Nyagi
  // Used/Crude Entropy Test added 7/18/23 - Nyagi
  public static final RegistryObject<Item> Crude_Entropy_Test =
      ITEMS.register("crude_entropy_test",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
  public static final RegistryObject<Item> Used_Crude_Entropy_Test =
      ITEMS.register(
          "used_crude_entropy_test",
          ()
              -> new CustomTooltipItem(new Item.Properties().tab(
                  ModCreativeModeTab
                      .NYAGIBITS_BYTES_SCIENCE))); // Used/Crude Compression
                                                   // Test added 7/18/23 - Nyagi
  // Used/Crude Acidics Test added 8/27/23 - Nyagi
  public static final RegistryObject<Item> Crude_Acidics_Test =
      ITEMS.register("crude_acidics_test",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
  public static final RegistryObject<Item> Used_Crude_Acidics_Test =
      ITEMS.register(
          "used_crude_acidics_test",
          ()
              -> new CustomTooltipItem(new Item.Properties().tab(
                  ModCreativeModeTab
                      .NYAGIBITS_BYTES_SCIENCE))); // Used/Crude Compression
                                                   // Test added 7/18/23 - Nyagi
  // Used/Crude Natural Arcana Test added 8/27/23 - Nyagi
  public static final RegistryObject<Item> Crude_Natural_Arcana_Test =
      ITEMS.register("crude_natural_arcana_test",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
  public static final RegistryObject<Item> Used_Crude_Natural_Arcana_Test =
      ITEMS.register(
          "used_crude_natural_arcana_test",
          ()
              -> new CustomTooltipItem(new Item.Properties().tab(
                  ModCreativeModeTab
                      .NYAGIBITS_BYTES_SCIENCE))); // Used/Crude Compression
                                                   // Test added 7/18/23 - Nyagi
  // Used/Crude Material Properties Test added 8/27/23 - Nyagi
  public static final RegistryObject<Item> Crude_Material_Properties_Test =
      ITEMS.register("crude_material_properties_test",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
  public static final RegistryObject<Item> Used_Crude_Material_Properties_Test =
      ITEMS.register("used_crude_material_properties_test",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
  /*
     SCIENCE DATA STORAGE
   */
  // added 8/10/23 - Nyagi
  public static final RegistryObject<Item> Lab_Notebook =
      ITEMS.register("lab_notebook",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
  public static final RegistryObject<Item>
      Lab_Notebook_With_Crude_Compression_Data =
          ITEMS.register("lab_notebook_with_crude_compression_data",
                         ()
                             -> new CustomTooltipItem(new Item.Properties().tab(
                                 ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
  public static final RegistryObject<Item>
      Lab_Notebook_With_Crude_Statics_Data =
          ITEMS.register("lab_notebook_with_crude_statics_data",
                         ()
                             -> new CustomTooltipItem(new Item.Properties().tab(
                                 ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
  public static final RegistryObject<Item>
      Lab_Notebook_With_Crude_Entropy_Data =
          ITEMS.register("lab_notebook_with_crude_entropy_data",
                         ()
                             -> new CustomTooltipItem(new Item.Properties().tab(
                                 ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
  // added 8/27/23 - Nyagi
  public static final RegistryObject<Item>
      Lab_Notebook_With_Crude_Acidics_Data =
          ITEMS.register("lab_notebook_with_crude_acidics_data",
                         ()
                             -> new CustomTooltipItem(new Item.Properties().tab(
                                 ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
  public static final RegistryObject<Item>
      Lab_Notebook_With_Crude_Natural_Arcana_Data =
          ITEMS.register("lab_notebook_with_crude_natural_arcana_data",
                         ()
                             -> new CustomTooltipItem(new Item.Properties().tab(
                                 ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
  public static final RegistryObject<Item>
      Lab_Notebook_With_Crude_Material_Properties_Data =
          ITEMS.register("lab_notebook_with_crude_material_properties_data",
                         ()
                             -> new CustomTooltipItem(new Item.Properties().tab(
                                 ModCreativeModeTab.NYAGIBITS_BYTES_SCIENCE)));
  public static final RegistryObject<Item> Pen =
      ITEMS.register("pen",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  public static final RegistryObject<Item> Pen_Assembly =
      ITEMS.register("pen_assembly",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  public static final RegistryObject<Item> Ball_Bearing =
      ITEMS.register("ball_bearing",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  public static final RegistryObject<Item> Thin_Casing =
      ITEMS.register("thin_casing",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  public static final RegistryObject<Item> Tiny_Spring =
      ITEMS.register("tiny_spring",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  public static final RegistryObject<Item> Ink_Cartridge =
      ITEMS.register("ink_cartridge",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));
  public static final RegistryObject<Item> Ink =
      ITEMS.register("ink",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

  /*
     SCHEMATICS
   */
  // Blank Blueprint added 8/27/23 - Nyagi
  public static final RegistryObject<Item> Blank_Blueprint =
      ITEMS.register("blank_blueprint",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_SCHEMATICS)));
  public static final RegistryObject<Item> Ae2_Schematic =
      ITEMS.register("ae2_schematic",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_SCHEMATICS)));
  public static final RegistryObject<Item> Botania_Schematic =
      ITEMS.register("botania_schematic",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_SCHEMATICS)));
  public static final RegistryObject<Item> Immersive_Engineering_Schematic =
      ITEMS.register("immersive_engineering_schematic",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_SCHEMATICS)));
  public static final RegistryObject<Item> Alchemistry_Schematic =
      ITEMS.register("alchemistry_schematic",
                     ()
                         -> new CustomTooltipItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_SCHEMATICS)));

  /*
    Ore items
  */
  // Iron-related added 9/29/23 - Nyagi
  // Limonite
  public static final RegistryObject<Item> Raw_Limonite =
      ITEMS.register("raw_limonite",
                     ()
                         -> new CustomOreItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Hematite
  public static final RegistryObject<Item> Raw_Hematite =
      ITEMS.register("raw_hematite",
                     ()
                         -> new CustomOreItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Magnetite
  public static final RegistryObject<Item> Raw_Magnetite =
      ITEMS.register("raw_magnetite",
                     ()
                         -> new CustomOreItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Pyrite
  public static final RegistryObject<Item> Raw_Pyrite =
      ITEMS.register("raw_pyrite",
                     ()
                         -> new CustomOreItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Siderite
  public static final RegistryObject<Item> Raw_Siderite =
      ITEMS.register("raw_siderite",
                     ()
                         -> new CustomOreItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Banded Iron
  public static final RegistryObject<Item> Raw_Banded_Iron =
      ITEMS.register("raw_banded_iron",
                     ()
                         -> new CustomOreItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Bog Iron
  public static final RegistryObject<Item> Raw_Bog_Iron =
      ITEMS.register("raw_bog_iron",
                     ()
                         -> new CustomOreItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Meteoric
  public static final RegistryObject<Item> Raw_Meteoric_Iron =
      ITEMS.register("raw_meteoric_iron",
                     ()
                         -> new CustomOreItem(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Copper-related added 10/1/23 - Nyagi
  // Chalcopyrite
  public static final RegistryObject<Item> Raw_Chalcopyrite =
      ITEMS.register("raw_chalcopyrite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Malachite
  public static final RegistryObject<Item> Raw_Malachite =
      ITEMS.register("raw_malachite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Azurite
  public static final RegistryObject<Item> Raw_Azurite =
      ITEMS.register("raw_azurite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Tetrahedrite
  public static final RegistryObject<Item> Raw_Tetrahedrite =
      ITEMS.register("raw_tetrahedrite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Enargite
  public static final RegistryObject<Item> Raw_Enargite =
      ITEMS.register("raw_enargite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Chrysocolla
  public static final RegistryObject<Item> Raw_Chrysocolla =
      ITEMS.register("raw_chrysocolla",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Tennanite
  public static final RegistryObject<Item> Raw_Tennanite =
      ITEMS.register("raw_tennanite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Dioptase
  public static final RegistryObject<Item> Raw_Dioptase =
      ITEMS.register("raw_dioptase",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Coal-related added 10/1/23 - Nyagi
  // Lignite
  public static final RegistryObject<Item> Raw_Lignite =
      ITEMS.register("raw_lignite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Bituminous
  public static final RegistryObject<Item> Raw_Bituminous =
      ITEMS.register("raw_bituminous",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Subbituminous
  public static final RegistryObject<Item> Raw_Subbituminous =
      ITEMS.register("raw_subbituminous",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Anthracite
  public static final RegistryObject<Item> Raw_Anthracite =
      ITEMS.register("raw_anthracite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Cannel Coal
  public static final RegistryObject<Item> Raw_Cannel_Coal =
      ITEMS.register("raw_cannel_coal",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Jet
  public static final RegistryObject<Item> Raw_Jet =
      ITEMS.register("raw_jet",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Peat
  public static final RegistryObject<Item> Raw_Peat =
      ITEMS.register("raw_peat",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Graphite
  public static final RegistryObject<Item> Raw_Graphite =
      ITEMS.register("raw_graphite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Gold&Silver-related added 10/1/23 - Nyagi
  // Alluvial Slush
  public static final RegistryObject<Item> Alluvial_Slush =
      ITEMS.register("alluvial_slush",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Native Cluster (Gold, Silver, Electrum)
  public static final RegistryObject<Item> Native_Cluster =
      ITEMS.register("native_cluster",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Argentite
  public static final RegistryObject<Item> Raw_Argentite =
      ITEMS.register("raw_argentite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Chlorargyrite
  public static final RegistryObject<Item> Raw_Chlorargyrite =
      ITEMS.register("raw_chlorargyrite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Polybasite
  public static final RegistryObject<Item> Raw_Polybasite =
      ITEMS.register("raw_polybasite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Proustite
  public static final RegistryObject<Item> Raw_Proustite =
      ITEMS.register("raw_proustite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Electrum
  public static final RegistryObject<Item> Raw_Electrum =
      ITEMS.register("raw_electrum",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Kustelite Electrum
  public static final RegistryObject<Item> Raw_Kustelite_Electrum =
      ITEMS.register("raw_kustelite_electrum",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Redstone&Mercury-related added 10/9/23 - Nyagi
  // Cinnabar
  public static final RegistryObject<Item> Raw_Cinnabar =
      ITEMS.register("raw_cinnabar",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Metacinnabar
  public static final RegistryObject<Item> Raw_Metacinnabar =
      ITEMS.register("raw_metacinnabar",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Corderoite
  public static final RegistryObject<Item> Raw_Corderoite =
      ITEMS.register("raw_corderoite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Basaltic Powder
  public static final RegistryObject<Item> Raw_Basaltic_Powder =
      ITEMS.register("raw_basaltic_powder",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Calomel
  public static final RegistryObject<Item> Raw_Calomel =
      ITEMS.register("raw_calomel",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Native Mercury Spherules
  public static final RegistryObject<Item> Raw_Native_Mercury_Spherules =
      ITEMS.register("raw_native_mercury_spherules",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Montroydite
  public static final RegistryObject<Item> Raw_Montroydite =
      ITEMS.register("raw_montroydite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Granulated Obsidian
  public static final RegistryObject<Item> Raw_Granulated_Obsidian =
      ITEMS.register("raw_granulated_obsidian",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Crystals & Minerals Related added 10/9/23 - Nyagi
  // Kimberlite
  public static final RegistryObject<Item> Raw_Kimberlite =
      ITEMS.register("raw_kimberlite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Lamproite
  public static final RegistryObject<Item> Raw_Lamproite =
      ITEMS.register("raw_lamproite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Lazurite
  public static final RegistryObject<Item> Raw_Lazurite =
      ITEMS.register("raw_lazurite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Lapis Lazuli
  public static final RegistryObject<Item> Raw_Lapis_Lazuli =
      ITEMS.register("raw_lapis_lazuli",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Prime Beryllic Cluster (Emerald, Sapphire, Ruby)
  public static final RegistryObject<Item> Raw_Prime_Beryllic_Cluster =
      ITEMS.register("raw_prime_beryllic_cluster",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Fluorite
  public static final RegistryObject<Item> Raw_Fluorite =
      ITEMS.register("raw_fluorite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Chalcogenide Crystal Cluster (Hawleyite, Selenite, Calaverite)
  public static final RegistryObject<Item> Raw_Chalcogenide_Crystal_Cluster =
      ITEMS.register("raw_chalcogenide_crystal_cluster",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Salt Cluster (Sodium Chloride, Salt Peter, Rock Salt)
  public static final RegistryObject<Item> Raw_Salt_Cluster =
      ITEMS.register("raw_salt_cluster",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

  // Quartz Related added 10/13/23 - Nyagi
  // Herkimer Diamond (Water/Petroleum Inclusions)
  public static final RegistryObject<Item> Raw_Herkimer_Diamond =
      ITEMS.register("raw_herkimer_diamond",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Dendritic Agate
  public static final RegistryObject<Item> Raw_Dendritic_Agate =
      ITEMS.register("raw_dendritic_agate",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Chalcedony
  public static final RegistryObject<Item> Raw_Chalcedony =
      ITEMS.register("raw_chalcedony",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Rutilated quartz
  public static final RegistryObject<Item> Raw_Rutilated_Quartz =
      ITEMS.register("raw_rutilated_quartz",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Ametrine
  public static final RegistryObject<Item> Raw_Ametrine =
      ITEMS.register("raw_ametrine",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Rose Quartz
  public static final RegistryObject<Item> Raw_Rose_Quartz =
      ITEMS.register("raw_rose_quartz",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Prasiolite
  public static final RegistryObject<Item> Raw_Prasiolite =
      ITEMS.register("raw_prasiolite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Meteoric Certus
  public static final RegistryObject<Item> Raw_Meteoric_Certus =
      ITEMS.register("raw_meteoric_certus",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

  // Zinc Related added 10/13/23 - Nyagi
  // Zinc Carbonate
  public static final RegistryObject<Item> Raw_Zinc_Carbonate =
      ITEMS.register("raw_zinc_carbonate",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Sphalerite
  public static final RegistryObject<Item> Raw_Sphalerite =
      ITEMS.register("raw_sphalerite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Smithsonite
  public static final RegistryObject<Item> Raw_Smithsonite =
      ITEMS.register("raw_smithsonite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Hemimorphite
  public static final RegistryObject<Item> Raw_Hemimorphite =
      ITEMS.register("raw_hemimorphite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Wurtzite
  public static final RegistryObject<Item> Raw_Wurtzite =
      ITEMS.register("raw_wurtzite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Hydrozincite
  public static final RegistryObject<Item> Raw_Hydrozincite =
      ITEMS.register("raw_hydrozincite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Willemite (Highly fluorescent (green))
  public static final RegistryObject<Item> Raw_Willemite =
      ITEMS.register("raw_willemite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Franklinite
  public static final RegistryObject<Item> Raw_Franklinite =
      ITEMS.register("raw_franklinite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

  // Aluminum Related added 10/13/23 - Nyagi
  // Bauxite
  public static final RegistryObject<Item> Raw_Bauxite =
      ITEMS.register("raw_bauxite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Feldspar
  public static final RegistryObject<Item> Raw_Feldspar =
      ITEMS.register("raw_feldspar",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Beryl (Clustered Beryl) (Emerald, Aquamarine, Morganite, Heliodor,
  // Goshenite, Bixbite, Pezzottaite)
  public static final RegistryObject<Item> Raw_Clustered_Beryl =
      ITEMS.register("raw_clustered_beryl",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Cryolite
  public static final RegistryObject<Item> Raw_Cryolite =
      ITEMS.register("raw_cryolite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Spinel
  public static final RegistryObject<Item> Raw_Spinel =
      ITEMS.register("raw_spinel",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Turquoise
  public static final RegistryObject<Item> Raw_Turquoise =
      ITEMS.register("raw_turquoise",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Garnet Slush
  public static final RegistryObject<Item> Raw_Garnet_Slush =
      ITEMS.register("raw_garnet_slush",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Native Aluminum (Extremely rare)
  public static final RegistryObject<Item> Raw_Native_Aluminum =
      ITEMS.register("raw_native_aluminum",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

  // Lead Related added 10/20/23 - Nyagi
  // Galena
  public static final RegistryObject<Item> Raw_Galena =
      ITEMS.register("raw_galena",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Lead Sulphide
  public static final RegistryObject<Item> Raw_Lead_Sulphide =
      ITEMS.register("raw_lead_sulphide",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Pyromorphite
  public static final RegistryObject<Item> Raw_Pyromorphite =
      ITEMS.register("raw_pyromorphite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Cerussite
  public static final RegistryObject<Item> Raw_Cerussite =
      ITEMS.register("raw_cerussite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Anglesite
  public static final RegistryObject<Item> Raw_Anglesite =
      ITEMS.register("raw_anglesite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Wulfenite
  public static final RegistryObject<Item> Raw_Wulfenite =
      ITEMS.register("raw_wulfenite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Vanadinite
  public static final RegistryObject<Item> Raw_Vanadinite =
      ITEMS.register("raw_vanadinite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Mimetite
  public static final RegistryObject<Item> Raw_Mimetite =
      ITEMS.register("raw_mimetite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

  // Nickel Related added 10/27/23 - Nyagi
  // Pentlandite
  public static final RegistryObject<Item> Raw_Pentlandite =
      ITEMS.register("raw_pentlandite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Garnierite
  public static final RegistryObject<Item> Raw_Garnierite =
      ITEMS.register("raw_garnierite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Saprolite
  public static final RegistryObject<Item> Raw_Saprolite =
      ITEMS.register("raw_saprolite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Hardened Sulfide Flow
  public static final RegistryObject<Item> Raw_Hardened_Sulfide_Flow =
      ITEMS.register("raw_hardened_sulfide_flow",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Millerite
  public static final RegistryObject<Item> Raw_Millerite =
      ITEMS.register("raw_millerite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Nickeline
  public static final RegistryObject<Item> Raw_Nickeline =
      ITEMS.register("raw_nickeline",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Meteoric Taenite
  public static final RegistryObject<Item> Raw_Meteoric_Taenite =
      ITEMS.register("raw_meteoric_taenite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Meteoric Kamacite
  public static final RegistryObject<Item> Raw_Meteoric_Kamacite =
      ITEMS.register("raw_meteoric_kamacite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

  // Uranium & Thorium Related added 10/27/23 - Nyagi
  // Pitchblende
  public static final RegistryObject<Item> Raw_Pitchblende =
      ITEMS.register("raw_pitchblende",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Carnotite
  public static final RegistryObject<Item> Raw_Carnotite =
      ITEMS.register("raw_carnotite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Tyuyamunite
  public static final RegistryObject<Item> Raw_Tyuyamunite =
      ITEMS.register("raw_tyuyamunite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Torbernite
  public static final RegistryObject<Item> Raw_Torbernite =
      ITEMS.register("raw_torbernite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Autunite
  public static final RegistryObject<Item> Raw_Autunite =
      ITEMS.register("raw_autunite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Thorite
  public static final RegistryObject<Item> Raw_Thorite =
      ITEMS.register("raw_thorite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Uranothorite
  public static final RegistryObject<Item> Raw_Uranothorite =
      ITEMS.register("raw_uranothorite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Thorianite
  public static final RegistryObject<Item> Raw_Thorianite =
      ITEMS.register("raw_thorianite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

  // Tin Related added 11/3/23 - Nyagi
  // Cassiterite
  public static final RegistryObject<Item> Raw_Cassiterite =
      ITEMS.register("raw_cassiterite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Stannite
  public static final RegistryObject<Item> Raw_Stannite =
      ITEMS.register("raw_stannite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Cylindrite
  public static final RegistryObject<Item> Raw_Cylindrite =
      ITEMS.register("raw_cylindrite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Franckeite
  public static final RegistryObject<Item> Raw_Franckeite =
      ITEMS.register("raw_franckeite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Canfieldite
  public static final RegistryObject<Item> Raw_Canfieldite =
      ITEMS.register("raw_canfieldite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Teallite
  public static final RegistryObject<Item> Raw_Teallite =
      ITEMS.register("raw_teallite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Brannerite
  public static final RegistryObject<Item> Raw_Brannerite =
      ITEMS.register("raw_brannerite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Orthoclase
  public static final RegistryObject<Item> Raw_Orthoclase =
      ITEMS.register("raw_orthoclase",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

  // Misc Processing Ores added 11/3/23 - Nyagi
  // Saltpeter
  public static final RegistryObject<Item> Raw_Saltpeter =
      ITEMS.register("raw_saltpeter",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Borax
  public static final RegistryObject<Item> Raw_Borax =
      ITEMS.register("raw_borax",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Compacted Limestone
  public static final RegistryObject<Item> Raw_Compacted_Limestone =
      ITEMS.register("raw_compacted_limestone",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Volcanic Sulfur
  public static final RegistryObject<Item> Raw_Volcanic_Sulfur =
      ITEMS.register("raw_volcanic_sulfur",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Rainbow Obsidian
  public static final RegistryObject<Item> Raw_Rainbow_Obsidian =
      ITEMS.register("raw_rainbow_obsidian",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Petrified Wood
  public static final RegistryObject<Item> Raw_Petrified_Wood =
      ITEMS.register("raw_petrified_wood",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Chalk
  public static final RegistryObject<Item> Raw_Chalk =
      ITEMS.register("raw_chalk",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Trona Ore (Baking Soda)
  public static final RegistryObject<Item> Raw_Trona =
      ITEMS.register("raw_trona",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));

  // Ore-related drops
  // Sapphire
  public static final RegistryObject<Item> Sapphire =
      ITEMS.register("sapphire",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Sapphire Dust
  public static final RegistryObject<Item> Sapphire_Dust =
      ITEMS.register("sapphire_dust",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Ruby
  public static final RegistryObject<Item> Ruby =
      ITEMS.register("ruby",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Ruby Dust
  public static final RegistryObject<Item> Ruby_Dust =
      ITEMS.register("ruby_dust",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Aquamarine
  public static final RegistryObject<Item> Aquamarine =
      ITEMS.register("aquamarine",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Aquamarine Dust
  public static final RegistryObject<Item> Aquamarine_Dust =
      ITEMS.register("aquamarine_dust",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Morganite
  public static final RegistryObject<Item> Morganite =
      ITEMS.register("morganite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Morganite Dust
  public static final RegistryObject<Item> Morganite_Dust =
      ITEMS.register("morganite_dust",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Heliodor
  public static final RegistryObject<Item> Heliodor =
      ITEMS.register("heliodor",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Heliodor Dust
  public static final RegistryObject<Item> Heliodor_Dust =
      ITEMS.register("heliodor_dust",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Goshenite
  public static final RegistryObject<Item> Goshenite =
      ITEMS.register("goshenite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Goshenite Dust
  public static final RegistryObject<Item> Goshenite_Dust =
      ITEMS.register("goshenite_dust",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Bixbite
  public static final RegistryObject<Item> Bixbite =
      ITEMS.register("bixbite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Bixbite Dust
  public static final RegistryObject<Item> Bixbite_Dust =
      ITEMS.register("bixbite_dust",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Pezzottaite
  public static final RegistryObject<Item> Pezzottaite =
      ITEMS.register("pezzottaite",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  // Pezzottaite Dust
  public static final RegistryObject<Item> Pezzottaite_Dust =
      ITEMS.register("pezzottaite_dust",
                     ()
                         -> new Item(new Item.Properties().tab(
                             ModCreativeModeTab.NYAGIBITS_BYTES_MINERALS)));
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Sintered/Polished Tier 1 Items
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // FLUID-ITEMS BELOW
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // Hydrocarbon Tar - Added 6/25/24
  public static final RegistryObject<Item> HYDROCARBON_TAR_BUCKET =
      ITEMS.register("bucket_of_hydrocarbon_tar",
                     ()
                         -> new BucketItem(
                             ModFluids.SOURCE_HYDROCARBON_TAR,
                             new Item.Properties()
                                 .tab(ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS)
                                 .craftRemainder(Items.BUCKET)
                                 .stacksTo(1)));

  // Raw Wood Vinegar - Added 6/25/24
  public static final RegistryObject<Item> RAW_WOOD_VINEGAR_BUCKET =
      ITEMS.register("bucket_of_raw_wood_vinegar",
                     ()
                         -> new BucketItem(
                             ModFluids.SOURCE_RAW_WOOD_VINEGAR,
                             new Item.Properties()
                                 .tab(ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS)
                                 .craftRemainder(Items.BUCKET)
                                 .stacksTo(1)));

  // Pyroligneous Acid - Added 6/25/24
  public static final RegistryObject<Item> PYROLIGNEOUS_ACID_BUCKET =
      ITEMS.register("bucket_of_pyroligneous_acid",
                     ()
                         -> new BucketItem(
                             ModFluids.SOURCE_PYROLIGNEOUS_ACID,
                             new Item.Properties()
                                 .tab(ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS)
                                 .craftRemainder(Items.BUCKET)
                                 .stacksTo(1)));

  // Acetone - Added 6/25/24
  public static final RegistryObject<Item> ACETONE_BUCKET = ITEMS.register(
      "bucket_of_acetone",
      ()
          -> new BucketItem(ModFluids.SOURCE_ACETONE,
                            new Item.Properties()
                                .tab(ModCreativeModeTab.NYAGIBITS_BYTES_FLUIDS)
                                .craftRemainder(Items.BUCKET)
                                .stacksTo(1)));

  //--------------------------------------------------------------------------------------

  // Area Above Uses mm/dd/yy

  // Area Below Uses dd/mm/yy

  // Plates 26/03/24 - JJ
  /*
          //Actinium
              public static final RegistryObject<Item>
                      Actinium_Plate = ITEMS.register("actinium_plate", () ->
     new CustomTooltipItem(new
     Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

          //Alfsteel
              public static final RegistryObject<Item>
                      Alfsteel_Plate = ITEMS.register("alfsteel_plate", () ->
     new CustomTooltipItem(new
     Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

          //Aluminium
              public static final RegistryObject<Item>
                      Aluminium_Plate = ITEMS.register("aluminium_plate", () ->
     new CustomTooltipItem(new
     Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

          //Barium
              public static final RegistryObject<Item>
                  Barium_Plate = ITEMS.register("barium_plate", () -> new
     CustomTooltipItem(new
     Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

          //Beryllium
              public static final RegistryObject<Item>
                      Beryllium_Plate = ITEMS.register("beryllium_plate", () ->
     new CustomTooltipItem(new
     Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

          //Bismuth
              public static final RegistryObject<Item>
                      Bismuth_Plate = ITEMS.register("bismuth_plate", () -> new
     CustomTooltipItem(new
     Item.Properties().tab(ModCreativeModeTab.NYAGIBITS_BYTES_ITEMS)));

  */
  //--------------------------------------------------------------------------------------
  public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
