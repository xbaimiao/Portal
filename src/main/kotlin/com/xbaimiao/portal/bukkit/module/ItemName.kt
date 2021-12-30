package com.xbaimiao.portal.bukkit.module

import org.bukkit.Material

@Suppress("all")
enum class ItemName(val Name: String) {

    ACACIA_BOAT("金合欢船"), ACACIA_BUTTON("金合欢按钮"), ACACIA_DOOR("金合欢木门"), ACACIA_FENCE("金合欢栅栏"), ACACIA_FENCE_GATE("金合欢栅栏门"), ACACIA_LEAVES(
        "金合欢树叶"
    ),
    ACACIA_LOG("金合欢原木"), ACACIA_PLANKS("金合欢木板"), ACACIA_PRESSURE_PLATE("金合欢木压力板"), ACACIA_SAPLING("金合欢树苗"), ACACIA_SIGN(
        "金合欢木告示牌"
    ),
    ACACIA_SLAB("金合欢台阶"), ACACIA_STAIRS("金合欢木楼梯"), ACACIA_TRAPDOOR("金合欢活板"), ACACIA_WALL_SIGN("墙上的金合欢木告示牌"), ACACIA_WOOD(
        "金合欢木"
    ),
    ACTIVATOR_RAIL("激活铁轨"), AIR("空气"), ALLIUM("绒球葱"), ANCIENT_DEBRIS("远古残骸"), ANDESITE("安山岩"), ANDESITE_SLAB("安山岩台阶"), ANDESITE_STAIRS(
        "安山岩楼梯"
    ),
    ANDESITE_WALL("安山岩墙"), ANVIL("铁砧"), APPLE("苹果"), ARMOR_STAND("盔甲架"), ARROW("箭"), ATTACHED_MELON_STEM("结果的西瓜茎"), ATTACHED_PUMPKIN_STEM(
        "结果的南瓜茎"
    ),
    AZURE_BLUET("茜草花"), BAKED_POTATO("烤马铃薯"), BAMBOO("竹子"), BAMBOO_SAPLING("竹笋"), BARREL("木桶"), BARRIER("屏障"), BASALT("玄武岩"), BAT_SPAWN_EGG(
        "蝙蝠刷怪蛋"
    ),
    BEACON("信标"), BEDROCK("基岩"), BEEF("生牛肉"), BEEHIVE("蜂窝"), BEETROOT("甜菜根"), BEETROOTS("甜菜"), BEETROOT_SEEDS("甜菜种子"), BEETROOT_SOUP(
        "甜菜汤"
    ),
    BEE_NEST("蜜蜂巢"), BEE_SPAWN_EGG("蜜蜂刷怪蛋"), BELL("钟"), BIRCH_BOAT("白桦船"), BIRCH_BUTTON("桦木按钮"), BIRCH_DOOR("白桦木门"), BIRCH_FENCE(
        "白桦木栅栏"
    ),
    BIRCH_FENCE_GATE("白桦木栅栏门"), BIRCH_LEAVES("白桦树叶"), BIRCH_LOG("白桦原木"), BIRCH_PLANKS("白桦木板"), BIRCH_PRESSURE_PLATE("白桦木压力板"), BIRCH_SAPLING(
        "白桦树苗"
    ),
    BIRCH_SIGN("白桦木告示牌"), BIRCH_SLAB("桦木台阶"), BIRCH_STAIRS("桦木楼梯"), BIRCH_TRAPDOOR("桦木活板门"), BIRCH_WALL_SIGN("墙上的白桦木告示牌"), BIRCH_WOOD(
        "白桦木"
    ),
    BLACKSTONE("黑石"), BLACKSTONE_SLAB("黑石台阶"), BLACKSTONE_STAIRS("黑石楼梯"), BLACKSTONE_WALL("黑石墙"), BLACK_BANNER("黑色旗帜"), BLACK_BED(
        "黑色床"
    ),
    BLACK_CARPET("黑色地毯"), BLACK_CONCRETE("黑色混凝土"), BLACK_CONCRETE_POWDER("黑色混凝土粉"), BLACK_DYE("黑色染料"), BLACK_GLAZED_TERRACOTTA(
        "黑色带釉陶瓦"
    ),
    BLACK_SHULKER_BOX("黑色潜影盒"), BLACK_STAINED_GLASS("黑色染色玻璃"), BLACK_STAINED_GLASS_PANE("黑色染色玻璃板"), BLACK_TERRACOTTA("黑色陶瓦"), BLACK_WALL_BANNER(
        "墙上的黑色旗帜"
    ),
    BLACK_WOOL("黑色羊毛"), BLAST_FURNACE("高炉"), BLAZE_POWDER("烈焰粉"), BLAZE_ROD("烈焰棒"), BLAZE_SPAWN_EGG("烈焰人刷怪蛋"), BLUE_BANNER(
        "蓝色旗帜"
    ),
    BLUE_BED("蓝色床"), BLUE_CARPET("蓝色地毯"), BLUE_CONCRETE("蓝色混凝土"), BLUE_CONCRETE_POWDER("蓝色混凝土粉"), BLUE_DYE("蓝色染料"), BLUE_GLAZED_TERRACOTTA(
        "蓝色带釉陶瓦"
    ),
    BLUE_ICE("蓝冰"), BLUE_ORCHID("兰花"), BLUE_SHULKER_BOX("蓝色潜影盒"), BLUE_STAINED_GLASS("蓝色染色玻璃"), BLUE_STAINED_GLASS_PANE(
        "蓝色染色玻璃板"
    ),
    BLUE_TERRACOTTA("蓝色陶瓦"), BLUE_WALL_BANNER("墙上的蓝色旗帜"), BLUE_WOOL("蓝色羊毛"), BONE("骨头"), BONE_BLOCK("骨块"), BONE_MEAL("骨粉"), BOOK(
        "书"
    ),
    BOOKSHELF("书架"), BOW("弓"), BOWL("碗"), BRAIN_CORAL("脑纹珊瑚"), BRAIN_CORAL_BLOCK("脑纹珊瑚块"), BRAIN_CORAL_FAN("脑纹珊瑚扇"), BRAIN_CORAL_WALL_FAN(
        "墙上的脑纹珊瑚扇"
    ),
    BREAD("面包"), BREWING_STAND("酿造台"), BRICK("红砖"), BRICKS("砖块"), BRICK_SLAB("石砖台阶"), BRICK_STAIRS("砖块楼梯"), BRICK_WALL("砖块墙"), BROWN_BANNER(
        "褐色旗帜"
    ),
    BROWN_BED("褐色床"), BROWN_CARPET("褐色地毯"), BROWN_CONCRETE("褐色混凝土"), BROWN_CONCRETE_POWDER("褐色混凝土粉"), BROWN_DYE("棕色染料"), BROWN_GLAZED_TERRACOTTA(
        "褐色带釉陶瓦"
    ),
    BROWN_MUSHROOM("棕色蘑菇方块"), BROWN_MUSHROOM_BLOCK("棕色巨型蘑菇"), BROWN_SHULKER_BOX("褐色潜影盒"), BROWN_STAINED_GLASS("棕色染色玻璃"), BROWN_STAINED_GLASS_PANE(
        "棕色染色玻璃板"
    ),
    BROWN_TERRACOTTA("棕色陶瓦"), BROWN_WALL_BANNER("墙上的棕色旗帜"), BROWN_WOOL("棕色羊毛"), BUBBLE_COLUMN("气泡柱"), BUBBLE_CORAL("气泡珊瑚"), BUBBLE_CORAL_BLOCK(
        "气泡珊瑚块"
    ),
    BUBBLE_CORAL_FAN("气泡珊瑚扇"), BUBBLE_CORAL_WALL_FAN("墙上的气泡珊瑚扇"), BUCKET("桶"), CACTUS("仙人掌"), CAKE("蛋糕"), CAMPFIRE("营火"), CARROT(
        "胡萝卜"
    ),
    CARROTS("胡萝卜"), CARROT_ON_A_STICK("胡萝卜钓竿"), CARTOGRAPHY_TABLE("制图台"), CARVED_PUMPKIN("雕刻过的南瓜"), CAT_SPAWN_EGG("猫刷怪蛋"), CAULDRON(
        "炼药锅"
    ),
    CAVE_AIR("洞穴空气"), CAVE_SPIDER_SPAWN_EGG("洞穴蜘蛛刷怪蛋"), CHAINMAIL_BOOTS("锁链靴子"), CHAINMAIL_CHESTPLATE("锁链胸甲"), CHAINMAIL_COMMAND_BLOCK(
        "连锁型命令方块"
    ),
    CHAINMAIL_HELMET("锁链头盔"), CHAINMAIL_LEGGINGS("锁链护腿"), CHARCOAL("木炭"), CHEST("箱子"), CHEST_MINECART("运输矿车"), CHICKEN("生鸡肉"), CHICKEN_SPAWN_EGG(
        "鸡刷怪蛋"
    ),
    CHIPPED_ANVIL("开裂的铁砧"), CHISELED_POLISHED_BLACKSTONE("錾制磨制黑石"), CHISELED_QUARTZ_BLOCK("錾制石英块"), CHISELED_RED_SANDSTONE(
        "錾制红砂岩"
    ),
    CHISELED_SANDSTONE("錾制砂岩"), CHISELED_STONE_BRICKS("錾制石砖"), CHORUS_FLOWER("紫颂花"), CHORUS_FRUIT("紫颂果"), CHORUS_PLANT("紫颂植物"), CLAY(
        "粘土"
    ),
    CLAY_BALL("黏土球"), CLOCK("钟"), COAL("煤炭"), COAL_BLOCK("煤炭块"), COAL_ORE("煤矿石"), COARSE_DIRT("砂土"), COBBLESTONE("圆石"), COBBLESTONE_SLAB(
        "圆石台阶"
    ),
    COBBLESTONE_STAIRS("圆石楼梯"), COBBLESTONE_WALL("圆石墙"), COBWEB("蜘蛛网"), COCOA("可可"), COCOA_BEANS("可可豆"), COD("生鳕鱼"), COD_BUCKET(
        "鳕鱼桶"
    ),
    COD_SPAWN_EGG("鳕鱼刷怪蛋"), COMMAND_BLOCK("命令方块"), COMMAND_BLOCK_MINECART("命令方块矿车"), COMPARATOR("红石比较器"), COMPASS("指南针"), COMPOSTER(
        "堆肥桶"
    ),
    CONDUIT("潮涌核心"), COOKED_BEEF("熟牛肉"), COOKED_CHICKEN("熟鸡肉"), COOKED_COD("熟鳕鱼"), COOKED_MUTTON("熟羊肉"), COOKED_PORKCHOP(
        "熟猪排"
    ),
    COOKED_RABBIT("熟兔肉"), COOKED_SALMON("熟鲑鱼"), COOKIE("曲奇"), CORNFLOWER("矢车菊"), COW_SPAWN_EGG("牛刷怪蛋"), CRACKED_POLISHED_BLACKSTONE_BRICKS(
        "裂纹磨制黑石砖"
    ),
    CRACKED_STONE_BRICKS("裂石砖"), CRAFTING_TABLE("工作台"), CREEPER_BANNER_PATTERN("旗帜图案(苦力怕盾徽)"), CREEPER_HEAD("苦力怕的头"), CREEPER_SPAWN_EGG(
        "苦力怕刷怪蛋"
    ),
    CREEPER_WALL_HEAD("墙上的苦力怕头颅"), CRIMSON_FUNGUS("绯红菌"), CRIMSON_HYPHAE("绯红菌核"), CRIMSON_NYLIUM("绯红菌岩"), CRIMSON_PLANKS(
        "绯红木板"
    ),
    CRIMSON_ROOTS("绯红菌索"), CRIMSON_STEM("绯红菌柄"), CROSSBOW("弩"), CRYING_OBSIDIAN("哭泣的黑曜石"), CUT_RED_SANDSTONE("切制红砂岩"), CUT_RED_SANDSTONE_SLAB(
        "切制红砂岩台阶"
    ),
    CUT_SANDSTONE("切制砂岩"), CUT_SANDSTONE_SLAB("切制砂岩台阶"), CYAN_BANNER("青色旗帜"), CYAN_BED("青色床"), CYAN_CARPET("青色地毯"), CYAN_CONCRETE(
        "青色混凝土"
    ),
    CYAN_CONCRETE_POWDER("青色混凝土粉"), CYAN_DYE("青色染料"), CYAN_GLAZED_TERRACOTTA("青色带釉陶瓦"), CYAN_SHULKER_BOX("青色潜影盒"), CYAN_STAINED_GLASS(
        "青色染色玻璃"
    ),
    CYAN_STAINED_GLASS_PANE("青色染色玻璃板"), CYAN_TERRACOTTA("青色陶瓦"), CYAN_WALL_BANNER("墙上的青色旗帜"), CYAN_WOOL("青色羊毛"), DAMAGED_ANVIL(
        "损坏的铁砧"
    ),
    DANDELION("蒲公英"), DARK_OAK_BOAT("深色橡木船"), DARK_OAK_BUTTON("深色橡木按钮"), DARK_OAK_DOOR("深色橡木门"), DARK_OAK_FENCE("深色橡木栅栏"), DARK_OAK_FENCE_GATE(
        "深色橡木栅栏门"
    ),
    DARK_OAK_LEAVES("深色橡树树叶"), DARK_OAK_LOG("深色橡树原木"), DARK_OAK_PLANKS("深色橡木木板"), DARK_OAK_PRESSURE_PLATE("深色橡木压力板"), DARK_OAK_SAPLING(
        "深色橡木树苗"
    ),
    DARK_OAK_SIGN("深色橡木告示牌"), DARK_OAK_SLAB("深色橡木台阶"), DARK_OAK_STAIRS("深色橡木楼梯"), DARK_OAK_TRAPDOOR("深色橡木活板门"), DARK_OAK_WALL_SIGN(
        "墙上的深色橡木告示牌"
    ),
    DARK_OAK_WOOD("深色橡木"), DARK_PRISMARINE("暗海晶石"), DARK_PRISMARINE_SLAB("暗海晶石台阶"), DARK_PRISMARINE_STAIRS("暗海晶石楼梯"), DAYLIGHT_DETECTOR(
        "阳光探测器"
    ),
    DEAD_BRAIN_CORAL("失活的脑纹珊瑚"), DEAD_BRAIN_CORAL_BLOCK("失活的脑纹珊瑚块"), DEAD_BRAIN_CORAL_FAN("失活的脑纹珊瑚扇"), DEAD_BRAIN_CORAL_WALL_FAN(
        "墙上的失活的脑纹珊瑚扇"
    ),
    DEAD_BUBBLE_CORAL("失活的气泡珊瑚"), DEAD_BUBBLE_CORAL_BLOCK("失活的气泡珊瑚块"), DEAD_BUBBLE_CORAL_FAN("失活的气泡珊瑚扇"), DEAD_BUBBLE_CORAL_WALL_FAN(
        "墙上的失活的气泡珊瑚扇"
    ),
    DEAD_BUSH("枯死的灌木"), DEAD_FIRE_CORAL("失活的火珊瑚"), DEAD_FIRE_CORAL_BLOCK("失活的火珊瑚块"), DEAD_FIRE_CORAL_FAN("失活的火珊瑚扇"), DEAD_FIRE_CORAL_WALL_FAN(
        "墙上的失活的火珊瑚扇"
    ),
    DEAD_HORN_CORAL("失活的鹿角珊瑚"), DEAD_HORN_CORAL_BLOCK("失活的鹿角珊瑚块"), DEAD_HORN_CORAL_FAN("失活的鹿角珊瑚扇"), DEAD_HORN_CORAL_WALL_FAN(
        "墙上的失活的鹿角珊瑚扇"
    ),
    DEAD_TUBE_CORAL("失活的管珊瑚"), DEAD_TUBE_CORAL_BLOCK("失活的管珊瑚块"), DEAD_TUBE_CORAL_FAN("失活的管珊瑚扇"), DEAD_TUBE_CORAL_WALL_FAN(
        "墙上的失活的管珊瑚扇"
    ),
    DEBUG_STICK("调试棒"), DETECTOR_RAIL("探测轨道"), DIAMOND("钻石"), DIAMOND_AXE("钻石斧"), DIAMOND_BLOCK("钻石块"), DIAMOND_BOOTS("钻石靴子"), DIAMOND_CHESTPLATE(
        "钻石胸甲"
    ),
    DIAMOND_HELMET("钻石头盔"), DIAMOND_HOE("钻石锄"), DIAMOND_HORSE_ARMOR("钻石马铠"), DIAMOND_LEGGINGS("钻石护腿"), DIAMOND_ORE("钻石矿石"), DIAMOND_PICKAXE(
        "钻石镐"
    ),
    DIAMOND_SHOVEL("钻石锹"), DIAMOND_SWORD("钻石剑"), DIORITE("闪长岩"), DIORITE_SLAB("花岗岩台阶"), DIORITE_STAIRS("闪长岩楼梯"), DIORITE_WALL(
        "闪长岩墙"
    ),
    DIRT("泥土"), DISPENSER("发射器"), DOLPHIN_SPAWN_EGG("海豚刷怪蛋"), DONKEY_SPAWN_EGG("蠢驴刷怪蛋"), DRAGON_BREATH("龙息"), DRAGON_EGG(
        "龙蛋"
    ),
    DRAGON_HEAD("龙首"), DRAGON_WALL_HEAD("墙上的龙首"), DRIED_KELP("干海带"), DRIED_KELP_BLOCK("干海带块"), DROPPER("投掷器"), DROWNED_SPAWN_EGG(
        "溺尸刷怪蛋"
    ),
    EGG("鸡蛋"), ELDER_GUARDIAN_SPAWN_EGG("远古守卫者刷怪蛋"), ELYTRA("鞘翅"), EMERALD("绿宝石"), EMERALD_BLOCK("绿宝石块"), EMERALD_ORE("绿宝石矿石"), ENCHANTED_BOOK(
        "附魔书"
    ),
    ENCHANTED_GOLDEN_APPLE("附魔金苹果"), ENCHANTING_TABLE("附魔台"), ENDERMAN_SPAWN_EGG("末影人刷怪蛋"), ENDERMITE_SPAWN_EGG("末影螨刷怪蛋"), ENDER_CHEST(
        "末影箱"
    ),
    ENDER_EYE("末影之眼"), ENDER_PEARL("末影珍珠"), END_CRYSTAL("末影水晶"), END_GATEWAY("末地折跃门方块"), END_PORTAL("末地传送门"), END_PORTAL_FRAME(
        "末地传送门框架"
    ),
    END_ROD("末地烛"), END_STONE("末地石"), END_STONE_BRICKS("末地石砖"), END_STONE_BRICK_SLAB("末地石砖台阶"), END_STONE_BRICK_STAIRS("末地石砖楼梯"), END_STONE_BRICK_WALL(
        "末地石砖墙"
    ),
    EVOKER_SPAWN_EGG("唤魔者刷怪蛋"), EXPERIENCE_BOTTLE("附魔之瓶"), FARMLAND("耕地"), FEATHER("羽毛"), FERMENTED_SPIDER_EYE("发酵蛛眼"), FERN(
        "蕨"
    ),
    FILLED_MAP("地图"), FIRE("火"), FIREWORK_ROCKET("烟花火箭"), FIREWORK_STAR("烟火之星"), FIRE_CHARGE("火焰弹"), FIRE_CORAL("火珊瑚"), FIRE_CORAL_BLOCK(
        "火珊瑚块"
    ),
    FIRE_CORAL_FAN("火珊瑚扇"), FIRE_CORAL_WALL_FAN("墙上的火珊瑚扇"), FISHING_ROD("钓鱼竿"), FLETCHING_TABLE("制箭台"), FLINT("燧石"), FLINT_AND_STEEL(
        "打火石"
    ),
    FLOWER_BANNER_PATTERN("旗帜图案(花朵盾徽)"), FLOWER_POT("花盆"), FOX_SPAWN_EGG("狐狸刷怪蛋"), FROSTED_ICE("Frosted Ice"), FURNACE("熔炉"), FURNACE_MINECART(
        "动力矿车"
    ),
    GHAST_SPAWN_EGG("恶魂刷怪蛋"), GHAST_TEAR("恶魂之泪"), GILDED_BLACKSTONE("镶金黑石"), GLASS("玻璃"), GLASS_BOTTLE("玻璃瓶"), GLASS_PANE(
        "玻璃板"
    ),
    GLISTERING_MELON_SLICE("闪烁的西瓜"), GLOBE_BANNER_PATTERN("旗帜图案(地球)"), GLOWSTONE("萤石"), GLOWSTONE_DUST("萤石粉"), GOLDEN_APPLE(
        "金苹果"
    ),
    GOLDEN_AXE("金斧"), GOLDEN_BOOTS("金靴子"), GOLDEN_CARROT("金胡萝卜"), GOLDEN_CHESTPLATE("金胸甲"), GOLDEN_HELMET("金头盔"), GOLDEN_HOE(
        "金锄"
    ),
    GOLDEN_HORSE_ARMOR("金马铠"), GOLDEN_LEGGINGS("金护腿"), GOLDEN_PICKAXE("金镐"), GOLDEN_SHOVEL("金锹"), GOLDEN_SWORD("金剑"), GOLD_BLOCK(
        "金块"
    ),
    GOLD_INGOT("金锭"), GOLD_NUGGET("金粒"), GOLD_ORE("金矿石"), GRANITE("花岗岩"), GRANITE_SLAB("花岗岩台阶"), GRANITE_STAIRS("花岗岩楼梯"), GRANITE_WALL(
        "花岗岩墙"
    ),
    GRASS("草"), GRASS_BLOCK("草方块"), GRASS_PATH("草径"), GRAVEL("砂砾"), GRAY_BANNER("灰色旗帜"), GRAY_BED("灰色床"), GRAY_CARPET("灰色地毯"), GRAY_CONCRETE(
        "灰色混凝土"
    ),
    GRAY_CONCRETE_POWDER("灰色混凝土粉"), GRAY_DYE("灰色染料"), GRAY_GLAZED_TERRACOTTA("灰色带釉陶瓦"), GRAY_SHULKER_BOX("灰色潜影盒"), GRAY_STAINED_GLASS(
        "灰色染色玻璃"
    ),
    GRAY_STAINED_GLASS_PANE("灰色染色玻璃板"), GRAY_TERRACOTTA("灰色陶瓦"), GRAY_WALL_BANNER("墙上的灰色旗帜"), GRAY_WOOL("灰色羊毛"), GREEN_BANNER(
        "绿色旗帜"
    ),
    GREEN_BED("绿色床"), GREEN_CARPET("绿色地毯"), GREEN_CONCRETE("绿色混凝土"), GREEN_CONCRETE_POWDER("绿色混凝土粉"), GREEN_DYE("绿色染料"), GREEN_GLAZED_TERRACOTTA(
        "绿色带釉陶瓦"
    ),
    GREEN_SHULKER_BOX("绿色潜影盒"), GREEN_STAINED_GLASS("绿色染色玻璃"), GREEN_STAINED_GLASS_PANE("绿色染色玻璃板"), GREEN_TERRACOTTA("绿色陶瓦"), GREEN_WALL_BANNER(
        "墙上的绿色旗帜"
    ),
    GREEN_WOOL("绿色羊毛"), GRINDSTONE("砂轮"), GUARDIAN_SPAWN_EGG("守卫者刷怪蛋"), GUNPOWDER("火药"), HAY_BLOCK("干草块"), HEART_OF_THE_SEA(
        "海洋之心"
    ),
    HEAVY_WEIGHTED_PRESSURE_PLATE("重质测重压力板"), HONEYCOMB("蜂窝"), HONEYCOMB_BLOCK("蜂窝块"), HONEY_BLOCK("蜂蜜块"), HONEY_BOTTLE(
        "蜂蜜瓶"
    ),
    HOPPER("漏斗"), HOPPER_MINECART("漏斗矿车"), HORN_CORAL("鹿角珊瑚"), HORN_CORAL_BLOCK("鹿角珊瑚块"), HORN_CORAL_FAN("鹿角珊瑚扇"), HORN_CORAL_WALL_FAN(
        "墙上的鹿角珊瑚扇"
    ),
    HORSE_SPAWN_EGG("马刷怪蛋"), HUSK_SPAWN_EGG("尸壳刷怪蛋"), ICE("冰"), INFESTED_CHISELED_STONE_BRICKS("被虫蚀的錾制石砖"), INFESTED_COBBLESTONE(
        "被虫蚀的圆石"
    ),
    INFESTED_CRACKED_STONE_BRICKS("被虫蚀的裂石砖"), INFESTED_MOSSY_STONE_BRICKS("被虫蚀的苔石砖"), INFESTED_STONE("被虫蚀的石头"), INFESTED_STONE_BRICKS(
        "被虫蚀的石砖"
    ),
    INK_SAC("墨囊"), IRON_AXE("铁斧"), IRON_BARS("铁栏杆"), IRON_BLOCK("铁块"), IRON_BOOTS("铁靴子"), IRON_CHESTPLATE("铁胸甲"), IRON_DOOR(
        "铁门"
    ),
    IRON_HELMET("铁头盔"), IRON_HOE("铁锄"), IRON_HORSE_ARMOR("铁马铠"), IRON_INGOT("铁锭"), IRON_LEGGINGS("铁护腿"), IRON_NUGGET("铁粒"), IRON_ORE(
        "铁矿石"
    ),
    IRON_PICKAXE("铁镐"), IRON_SHOVEL("铁锹"), IRON_SWORD("铁剑"), IRON_TRAPDOOR("铁活板门"), ITEM_FRAME("物品展示框"), JACK_O_LANTERN(
        "南瓜灯"
    ),
    JIGSAW("拼图方块"), JUKEBOX("唱片机"), JUNGLE_BOAT("丛林船"), JUNGLE_BUTTON("丛林按钮"), JUNGLE_DOOR("丛林木门"), JUNGLE_FENCE("丛林木栅栏"), JUNGLE_FENCE_GATE(
        "丛林木栅栏门"
    ),
    JUNGLE_LEAVES("丛林树叶"), JUNGLE_LOG("丛林原木"), JUNGLE_PLANKS("丛林木板"), JUNGLE_PRESSURE_PLATE("从林木压力板"), JUNGLE_SAPLING("丛林树苗"), JUNGLE_SIGN(
        "丛林木告示牌"
    ),
    JUNGLE_SLAB("丛林台阶"), JUNGLE_STAIRS("丛林楼梯"), JUNGLE_TRAPDOOR("丛林活板门"), JUNGLE_WALL_SIGN("墙上的丛林木告示牌"), JUNGLE_WOOD("丛林木"), KELP(
        "海带"
    ),
    KELP_PLANT("海带植物"), KNOWLEDGE_BOOK("知识之书"), LADDER("梯子"), LANTERN("灯笼"), LAPIS_BLOCK("青金石块"), LAPIS_LAZULI("青金石"), LAPIS_ORE(
        "青金石矿石"
    ),
    LARGE_FERN("大型蕨"), LAVA("岩浆"), LAVA_BUCKET("岩浆桶"), LEAD("拴绳"), LEATHER("皮革"), LEATHER_BOOTS("皮革靴子"), LEATHER_CHESTPLATE(
        "皮革外套"
    ),
    LEATHER_HELMET("皮革帽子"), LEATHER_HORSE_ARMOR("皮革马铠"), LEATHER_LEGGINGS("皮革裤子"), LECTERN("讲台"), LEVER("拉杆"), LIGHT_BLUE_BANNER(
        "淡蓝色旗帜"
    ),
    LIGHT_BLUE_BED("淡蓝色床"), LIGHT_BLUE_CARPET("淡蓝色地毯"), LIGHT_BLUE_CONCRETE("淡蓝色混凝土"), LIGHT_BLUE_CONCRETE_POWDER("淡蓝色混凝土粉"), LIGHT_BLUE_DYE(
        "淡蓝色染料"
    ),
    LIGHT_BLUE_GLAZED_TERRACOTTA("淡蓝色带釉陶瓦"), LIGHT_BLUE_SHULKER_BOX("淡蓝色潜影盒"), LIGHT_BLUE_STAINED_GLASS("淡蓝色染色玻璃"), LIGHT_BLUE_STAINED_GLASS_PANE(
        "淡蓝色染色玻璃板"
    ),
    LIGHT_BLUE_TERRACOTTA("淡蓝色陶瓦"), LIGHT_BLUE_WALL_BANNER("墙上的淡蓝色旗帜"), LIGHT_BLUE_WOOL("淡蓝色羊毛"), LIGHT_GRAY_BANNER("淡灰色旗帜"), LIGHT_GRAY_BED(
        "淡灰色床"
    ),
    LIGHT_GRAY_CARPET("淡灰色地毯"), LIGHT_GRAY_CONCRETE("淡灰色混凝土"), LIGHT_GRAY_CONCRETE_POWDER("淡灰色混凝土粉"), LIGHT_GRAY_DYE("淡灰色染料"), LIGHT_GRAY_GLAZED_TERRACOTTA(
        "淡灰色带釉陶瓦"
    ),
    LIGHT_GRAY_SHULKER_BOX("淡灰色潜影盒"), LIGHT_GRAY_STAINED_GLASS("淡灰色染色玻璃"), LIGHT_GRAY_STAINED_GLASS_PANE("淡灰色染色玻璃板"), LIGHT_GRAY_TERRACOTTA(
        "淡灰色陶瓦"
    ),
    LIGHT_GRAY_WALL_BANNER("墙上的淡灰色旗帜"), LIGHT_GRAY_WOOL("淡灰色羊毛"), LIGHT_WEIGHTED_PRESSURE_PLATE("轻质测重压力板"), LILAC("紫丁香"), LILY_OF_THE_VALLEY(
        "铃兰"
    ),
    LILY_PAD("睡莲"), LIME_BANNER("黄色旗帜"), LIME_BED("黄色床"), LIME_CARPET("黄色地毯"), LIME_CONCRETE("黄色混凝土"), LIME_CONCRETE_POWDER(
        "黄色混凝土粉"
    ),
    LIME_DYE("黄绿色染料"), LIME_GLAZED_TERRACOTTA("黄色带釉陶瓦"), LIME_SHULKER_BOX("黄色潜影盒"), LIME_STAINED_GLASS("黄绿色染色玻璃"), LIME_STAINED_GLASS_PANE(
        "黄绿色染色玻璃板"
    ),
    LIME_TERRACOTTA("黄绿色陶瓦"), LIME_WALL_BANNER("墙上的黄绿色旗帜"), LIME_WOOL("黄绿色羊毛"), LINGERING_POTION("滞留药水"), LLAMA_SPAWN_EGG(
        "羊驼刷怪蛋"
    ),
    LODESTONE("磁石"), LOOM("织布机"), MAGENTA_BANNER("品红色旗帜"), MAGENTA_BED("品红色床"), MAGENTA_CARPET("品红色地毯"), MAGENTA_CONCRETE(
        "品红色混凝土"
    ),
    MAGENTA_CONCRETE_POWDER("品红色混凝土粉"), MAGENTA_DYE("品红色染料"), MAGENTA_GLAZED_TERRACOTTA("品红色带釉陶瓦"), MAGENTA_SHULKER_BOX(
        "品红色潜影盒"
    ),
    MAGENTA_STAINED_GLASS("品红色染色玻璃"), MAGENTA_STAINED_GLASS_PANE("品红色染色玻璃板"), MAGENTA_TERRACOTTA("品红色陶瓦"), MAGENTA_WALL_BANNER(
        "墙上的品红色旗帜"
    ),
    MAGENTA_WOOL("品红色羊毛"), MAGMA_BLOCK("岩浆块"), MAGMA_CREAM("岩浆膏"), MAGMA_CUBE_SPAWN_EGG("岩浆怪刷怪蛋"), MAP("空地图"), MELON("西瓜"), MELON_SEEDS(
        "西瓜种子"
    ),
    MELON_SLICE("西瓜片"), MELON_STEM("西瓜梗"), MILK_BUCKET("牛奶桶"), MINECART("矿车"), MOJANG_BANNER_PATTERN("旗帜图案(Mojang盾徽)"), MOOSHROOM_SPAWN_EGG(
        "哞菇刷怪蛋"
    ),
    MOSSY_COBBLESTONE("苔石"), MOSSY_COBBLESTONE_SLAB("苔石台阶"), MOSSY_COBBLESTONE_STAIRS("苔石楼梯"), MOSSY_COBBLESTONE_WALL("苔石墙"), MOSSY_STONE_BRICKS(
        "苔石砖"
    ),
    MOSSY_STONE_BRICK_SLAB("苔石砖台阶"), MOSSY_STONE_BRICK_STAIRS("苔石砖楼梯"), MOSSY_STONE_BRICK_WALL("苔石墙"), MOVING_PISTON("移动中的活塞"), MULE_SPAWN_EGG(
        "骡刷怪蛋"
    ),
    MUSHROOM_STEM("蘑菇柄"), MUSHROOM_STEW("蘑菇煲"), MUSIC_DISC_11("音乐唱片11"), MUSIC_DISC_13("音乐唱片13"), MUSIC_DISC_BLOCKS("音乐唱片Blocks"), MUSIC_DISC_CAT(
        "音乐唱片Cat"
    ),
    MUSIC_DISC_CHIRP("音乐唱片Chirp"), MUSIC_DISC_FAR("音乐唱片Far"), MUSIC_DISC_MALL("音乐唱片Mall"), MUSIC_DISC_MELLOHI("音乐唱片Mellohi"), MUSIC_DISC_STAL(
        "音乐唱片Stal"
    ),
    MUSIC_DISC_STRAD("音乐唱片Strad"), MUSIC_DISC_WAIT("音乐唱片Wait"), MUSIC_DISC_WARD("音乐唱片Ward"), MUTTON("生羊肉"), MYCELIUM("菌丝"), NAME_TAG(
        "命名牌"
    ),
    NAUTILUS_SHELL("鹦鹉螺壳"), NETHERITE_AXE("下界合金斧"), NETHERITE_BLOCK("下界合金块"), NETHERITE_BOOTS("下界合金靴子"), NETHERITE_CHESTPLATE(
        "下界合金胸甲"
    ),
    NETHERITE_HELMET("下界合金头盔"), NETHERITE_HOT("下界合金锄"), NETHERITE_INGOT("下界合金锭"), NETHERITE_LEGGINGS("下界合金护腿"), NETHERITE_PICKAXE(
        "下界合金镐"
    ),
    NETHERITE_SCRAP("下界合金碎片"), NETHERITE_SHOVEL("下界合金锹"), NETHERITE_SWORD("下界合金剑"), NETHERRACK("地狱岩"), NETHER_BRICK("地狱砖"), NETHER_BRICKS(
        "地狱砖块"
    ),
    NETHER_BRICK_FENCE("地狱砖栅栏"), NETHER_BRICK_SLAB("地狱砖台阶"), NETHER_BRICK_STAIRS("地狱砖楼梯"), NETHER_BRICK_WALL("地狱砖墙"), NETHER_GOLD_ORE(
        "下界金矿石"
    ),
    NETHER_PORTAL("下界传送门"), NETHER_QUARTZ_ORE("下界石英矿石"), NETHER_STAR("下界之星"), NETHER_WART("地狱疣"), NETHER_WART_BLOCK("地狱疣块"), NOTE_BLOCK(
        "音符盒"
    ),
    OAK_BOAT("橡木船"), OAK_BUTTON("橡木按钮"), OAK_DOOR("木门"), OAK_FENCE("橡木栅栏"), OAK_FENCE_GATE("橡木栅栏门"), OAK_LEAVES("橡树树叶"), OAK_LOG(
        "橡木原木"
    ),
    OAK_PLANKS("橡木木板"), OAK_PRESSURE_PLATE("橡木压力板"), OAK_SAPLING("橡木树苗"), OAK_SIGN("橡木告示牌"), OAK_SLAB("橡木台阶"), OAK_STAIRS(
        "橡木楼梯"
    ),
    OAK_TRAPDOOR("橡木活板门"), OAK_WALL_SIGN("墙上的橡木告示牌"), OAK_WOOD("橡木"), OBSERVER("侦测器"), OBSIDIAN("黑曜石"), OCELOT_SPAWN_EGG(
        "豹猫刷怪蛋"
    ),
    ORANGE_BANNER("橙色旗帜"), ORANGE_BED("橙色床"), ORANGE_CARPET("橙色地毯"), ORANGE_CONCRETE("橙色混凝土"), ORANGE_CONCRETE_POWDER("橙色混凝土粉"), ORANGE_DYE(
        "橙色染料"
    ),
    ORANGE_GLAZED_TERRACOTTA("橙色带釉陶瓦"), ORANGE_SHULKER_BOX("橙色潜影盒"), ORANGE_STAINED_GLASS("橙色染色玻璃"), ORANGE_STAINED_GLASS_PANE(
        "橙色染色玻璃板"
    ),
    ORANGE_TERRACOTTA("橙色陶瓦"), ORANGE_TULIP("橙色郁金香"), ORANGE_WALL_BANNER("墙上的白色旗帜"), ORANGE_WOOL("橙色羊毛"), OXEYE_DAISY("滨菊"), PACKED_ICE(
        "浮冰"
    ),
    PAINTING("画"), PANDA_SPAWN_EGG("熊猫刷怪蛋"), PAPER("纸"), PARROT_SPAWN_EGG("鹦鹉刷怪蛋"), PEONY("牡丹"), PETRIFIED_OAK_SLAB("石化橡木台阶"), PHANTOM_MEMBRANE(
        "幻翼膜"
    ),
    PHANTOM_SPAWN_EGG("幻翼刷怪蛋"), PIG_SPAWN_EGG("猪刷怪蛋"), PILLAGER_SPAWN_EGG("掠夺者刷怪蛋"), PINK_BANNER("粉红色旗帜"), PINK_BED("粉红色床"), PINK_CARPET(
        "粉红色地毯"
    ),
    PINK_CONCRETE("粉红色混凝土"), PINK_CONCRETE_POWDER("粉红色混凝土粉"), PINK_DYE("粉红色染料"), PINK_GLAZED_TERRACOTTA("粉红色带釉陶瓦"), PINK_SHULKER_BOX(
        "粉红色潜影盒"
    ),
    PINK_STAINED_GLASS("粉红色染色玻璃"), PINK_STAINED_GLASS_PANE("粉红色染色玻璃板"), PINK_TERRACOTTA("粉红色陶瓦"), PINK_TULIP("粉红色郁金香"), PINK_WALL_BANNER(
        "墙上的粉红色旗帜"
    ),
    PINK_WOOL("粉红色羊毛"), PISTON("活塞"), PISTON_HEAD("活塞头"), PLAYER_HEAD("玩家的头"), PLAYER_WALL_HEAD("墙上的玩家头颅"), PODZOL("灰化土"), POISONOUS_POTATO(
        "毒马铃薯"
    ),
    POLAR_BEAR_SPAWN_EGG("北极熊刷怪蛋"), POLISHED_ANDESITE("磨制安山岩"), POLISHED_ANDESITE_SLAB("錾制安山岩台阶"), POLISHED_ANDESITE_STAIRS(
        "錾制安山岩楼梯"
    ),
    POLISHED_BASALT("磨制玄武岩"), POLISHED_BLACKSTONE("磨制黑石"), POLISHED_BLACKSTONE_BRICKS("磨制黑石砖"), POLISHED_BLACKSTONE_BRICKS_SLAB(
        "磨制黑石砖台阶"
    ),
    POLISHED_BLACKSTONE_BRICKS_STAIRS("磨制黑石砖楼梯"), POLISHED_BLACKSTONE_BRICK_WALL("磨制黑石砖墙"), POLISHED_BLACKSTONE_BUTTON("磨制黑石按钮"), POLISHED_BLACKSTONE_PRESSURE_PLATE(
        "磨制黑石压力板"
    ),
    POLISHED_BLACKSTONE_SLAB("磨制黑石台阶"), POLISHED_BLACKSTONE_STAIRS("磨制黑石楼梯"), POLISHED_BLACKSTONE_WALL("磨制黑石墙"), POLISHED_DIORITE(
        "磨制闪长岩"
    ),
    POLISHED_DIORITE_SLAB("錾制闪长岩台阶"), POLISHED_DIORITE_STAIRS("錾制闪长岩楼梯"), POLISHED_GRANITE("磨制花岗岩"), POLISHED_GRANITE_SLAB(
        "錾制花岗岩台阶"
    ),
    POLISHED_GRANITE_STAIRS("錾制花岗岩楼梯"), POPPED_CHORUS_FRUIT("爆裂紫颂果"), POPPY("虞美人"), PORKCHOP("生猪排"), POTATO("马铃薯"), POTATOES(
        "马铃薯"
    ),
    POTION("药水"), POTTED_ACACIA_SAPLING("金合欢树苗盆栽"), POTTED_ALLIUM("绒球葱盆栽"), POTTED_AZURE_BLUET("茜草花盆栽"), POTTED_BAMBOO("竹子盆栽"), POTTED_BIRCH_SAPLING(
        "白桦树苗盆栽"
    ),
    POTTED_BLUE_ORCHID("兰花盆栽"), POTTED_BROWN_MUSHROOM("棕色蘑菇盆栽"), POTTED_CACTUS("仙人掌盆栽"), POTTED_CORNFLOWER("矢车菊盆栽"), POTTED_DANDELION(
        "蒲公英盆栽"
    ),
    POTTED_DARK_OAK_SAPLING("深色橡树树苗盆栽"), POTTED_DEAD_BUSH("枯萎的灌木盆栽"), POTTED_FERN("蕨盆栽"), POTTED_JUNGLE_SAPLING("丛林树苗盆栽"), POTTED_LILY_OF_THE_VALLEY(
        "铃兰盆栽"
    ),
    POTTED_OAK_SAPLING("橡树树苗盆栽"), POTTED_ORANGE_TULIP("橙色郁金香盆栽"), POTTED_OXEYE_DAISY("滨菊盆栽"), POTTED_PINK_TULIP("粉红色郁金香盆栽"), POTTED_POPPY(
        "虞美人盆栽"
    ),
    POTTED_RED_MUSHROOM("红色蘑菇盆栽"), POTTED_RED_TULIP("红色郁金香盆栽"), POTTED_SPRUCE_SAPLING("云杉树苗盆栽"), POTTED_WHITE_TULIP("白色郁金香盆栽"), POTTED_WITHER_ROSE(
        "凋灵玫瑰盆栽"
    ),
    POWERED_RAIL("充能铁轨"), PRISMARINE("海晶石"), PRISMARINE_BRICKS("海晶石砖"), PRISMARINE_BRICK_SLAB("海晶石砖台阶"), PRISMARINE_BRICK_STAIRS(
        "海晶石砖楼梯"
    ),
    PRISMARINE_CRYSTALS("海晶砂粒"), PRISMARINE_SHARD("海晶碎片"), PRISMARINE_SLAB("海晶石台阶"), PRISMARINE_STAIRS("海晶石楼梯"), PRISMARINE_WALL(
        "海晶石砖墙"
    ),
    PUFFERFISH("河豚"), PUFFERFISH_BUCKET("河豚桶"), PUFFERFISH_SPAWN_EGG("河豚刷怪蛋"), PUMPKIN("南瓜"), PUMPKIN_PIE("南瓜派"), PUMPKIN_SEEDS(
        "南瓜种子"
    ),
    PUMPKIN_STEM("南瓜梗"), PURPLE_BANNER("紫色旗帜"), PURPLE_BED("紫色床"), PURPLE_CARPET("紫色地毯"), PURPLE_CONCRETE("紫色混凝土"), PURPLE_CONCRETE_POWDER(
        "紫色混凝土粉"
    ),
    PURPLE_DYE("紫色染料"), PURPLE_GLAZED_TERRACOTTA("紫色带釉陶瓦"), PURPLE_SHULKER_BOX("紫色潜影盒"), PURPLE_STAINED_GLASS("紫色染色玻璃"), PURPLE_STAINED_GLASS_PANE(
        "紫色染色玻璃板"
    ),
    PURPLE_TERRACOTTA("紫色陶瓦"), PURPLE_WALL_BANNER("墙上的紫色旗帜"), PURPLE_WOOL("紫色羊毛"), PURPUR_BLOCK("紫珀块"), PURPUR_PILLAR("竖纹紫珀块"), PURPUR_SLAB(
        "紫珀台阶"
    ),
    PURPUR_STAIRS("紫珀块楼梯"), QUARTZ("下界石英"), QUARTZ_BLOCK("石英块"), QUARTZ_PILLAR("竖纹石英块"), QUARTZ_SLAB("石英台阶"), QUARTZ_STAIRS(
        "石英楼梯"
    ),
    RABBIT("生兔肉"), RABBIT_FOOT("兔子脚"), RABBIT_HIDE("兔子皮"), RABBIT_SPAWN_EGG("兔子刷怪蛋"), RABBIT_STEW("兔肉煲"), RAIL("铁轨"), RAVAGER_SPAWN_EGG(
        "劫掠兽刷怪蛋"
    ),
    REDSTONE("红石粉"), REDSTONE_BLOCK("红石块"), REDSTONE_LAMP("红石灯"), REDSTONE_ORE("红石矿石"), REDSTONE_TORCH("红石火把"), REDSTONE_WALL_TORCH(
        "墙上的红石火把"
    ),
    REDSTONE_WIRE("红石"), RED_BANNER("红色旗帜"), RED_BED("红色床"), RED_CARPET("红色地毯"), RED_CONCRETE("红色混凝土"), RED_CONCRETE_POWDER(
        "红色混凝土粉"
    ),
    RED_DYE("红色染料"), RED_GLAZED_TERRACOTTA("红色带釉陶瓦"), RED_MUSHROOM("红色蘑菇方块"), RED_MUSHROOM_BLOCK("红色巨型蘑菇"), RED_NETHER_BRICKS(
        "红色地狱砖"
    ),
    RED_NETHER_BRICK_SLAB("红色地狱砖台阶"), RED_NETHER_BRICK_STAIRS("红色地狱砖楼梯"), RED_NETHER_BRICK_WALL("红色地狱砖墙"), RED_SAND("红沙"), RED_SANDSTONE(
        "红砂岩"
    ),
    RED_SANDSTONE_SLAB("红砂岩台阶"), RED_SANDSTONE_STAIRS("红砂岩楼梯"), RED_SANDSTONE_WALL("红砂岩墙"), RED_SHULKER_BOX("红色潜影盒"), RED_STAINED_GLASS(
        "红色染色玻璃"
    ),
    RED_STAINED_GLASS_PANE("红色染色玻璃板"), RED_TERRACOTTA("红色陶瓦"), RED_TULIP("红色郁金香"), RED_WALL_BANNER("墙上的红色旗帜"), RED_WOOL(
        "红色羊毛"
    ),
    REPEATER("红石中继器"), REPEATING_COMMAND_BLOCK("循环型命令方块"), RESPAWN_ANCHOR("重生锚"), ROSE_BUSH("玫瑰丛"), ROTTEN_FLESH("腐肉"), SADDLE(
        "鞍"
    ),
    SALMON("生鲑鱼"), SALMON_BUCKET("鲑鱼桶"), SALMON_SPAWN_EGG("鲑鱼刷怪蛋"), SAND("沙子"), SANDSTONE("砂岩"), SANDSTONE_SLAB("砂岩台阶"), SANDSTONE_STAIRS(
        "砂岩楼梯"
    ),
    SANDSTONE_WALL("砂岩墙"), SCAFFOLDING("脚手架"), SCUTE("鳞甲"), SEAGRASS("海草"), SEA_LANTERN("海晶灯"), SEA_PICKLE("海泡菜"), SHEARS(
        "剪刀"
    ),
    SHEEP_SPAWN_EGG("羊刷怪蛋"), SHIELD("盾牌"), SHROOMLIGHT("菌光体"), SHULKER_BOX("潜影盒"), SHULKER_SHELL("潜影壳"), SHULKER_SPAWN_EGG(
        "潜影贝刷怪蛋"
    ),
    SILVERFISH_SPAWN_EGG("蠹虫刷怪蛋"), SKELETON_HORSE_SPAWN_EGG("骷髅马刷怪蛋"), SKELETON_SKULL("骷髅头颅"), SKELETON_SPAWN_EGG("骷髅刷怪蛋"), SKELETON_WALL_SKULL(
        "墙上的骷髅头颅"
    ),
    SKULL_BANNER_PATTERN("旗帜图案(头颅盾徽)"), SLIME_BALL("粘液球"), SLIME_BLOCK("粘液块"), SLIME_SPAWN_EGG("史莱姆刷怪蛋"), SMITHING_TABLE(
        "锻造台"
    ),
    SMOKER("烟熏炉"), SMOOTH_QUARTZ("平滑石英"), SMOOTH_QUARTZ_SLAB("平滑石英台阶"), SMOOTH_QUARTZ_STAIRS("平滑石英楼梯"), SMOOTH_RED_SANDSTONE(
        "平滑红砂岩"
    ),
    SMOOTH_RED_SANDSTONE_SLAB("平滑红砂岩台阶"), SMOOTH_RED_SANDSTONE_STAIRS("平滑红砂岩台阶"), SMOOTH_SANDSTONE("平滑砂岩"), SMOOTH_SANDSTONE_SLAB(
        "平滑砂岩台阶"
    ),
    SMOOTH_SANDSTONE_STAIRS("平滑砂岩楼梯"), SMOOTH_STONE("平滑石头"), SMOOTH_STONE_SLAB("平滑石台阶"), SNOW("雪"), SNOWBALL("雪球"), SNOW_BLOCK(
        "雪块"
    ),
    SOUL_CAMPFIRE("灵魂营火"), SOUL_LANTERR("灵魂灯笼"), SOUL_SAND("灵魂砂"), SOUL_SOIL("灵魂土"), SOUL_TORCH("灵魂火把"), SPAWNER("刷怪箱"), SPECTRAL_ARROW(
        "光灵箭"
    ),
    SPIDER_EYE("蜘蛛眼"), SPIDER_SPAWN_EGG("蜘蛛刷怪蛋"), SPLASH_POTION("喷溅药水"), SPONGE("海绵"), SPRUCE_BOAT("云杉船"), SPRUCE_BUTTON(
        "云杉按钮"
    ),
    SPRUCE_DOOR("云杉木门"), SPRUCE_FENCE("云杉木栅栏"), SPRUCE_FENCE_GATE("云杉木栅栏门"), SPRUCE_LEAVES("云杉树叶"), SPRUCE_LOG("云杉原木"), SPRUCE_PLANKS(
        "云杉木板"
    ),
    SPRUCE_PRESSURE_PLATE("云杉木压力板"), SPRUCE_SAPLING("云杉树苗"), SPRUCE_SIGN("云杉木告示牌"), SPRUCE_SLAB("云杉台阶"), SPRUCE_STAIRS("云杉楼梯"), SPRUCE_TRAPDOOR(
        "云杉活板门"
    ),
    SPRUCE_WALL_SIGN("墙上的云杉木告示牌"), SPRUCE_WOOD("云杉木"), SQUID_SPAWN_EGG("鱿鱼刷怪蛋"), STICK("木棍"), STICKY_PISTON("粘性活塞"), STONE(
        "石头"
    ),
    STONECUTTER("切石机"), STONE_AXE("石斧"), STONE_BRICKS("石砖"), STONE_BRICK_SLAB("砖块台阶"), STONE_BRICK_STAIRS("石砖楼梯"), STONE_BRICK_WALL(
        "石砖墙"
    ),
    STONE_BUTTON("石质按钮"), STONE_HOE("石锄"), STONE_PICKAXE("石镐"), STONE_PRESSURE_PLATE("石质压力板"), STONE_SHOVEL("石锹"), STONE_SLAB(
        "石台阶"
    ),
    STONE_STAIRS("石头楼梯"), STONE_SWORD("石剑"), STRAY_SPAWN_EGG("流浪者刷怪蛋"), STRING("线"), STRIPPED_ACACIA_LOG("去皮金合欢原木"), STRIPPED_ACACIA_WOOD(
        "去皮金合欢木"
    ),
    STRIPPED_BIRCH_LOG("去皮白桦原木"), STRIPPED_BIRCH_WOOD("去皮白桦木"), STRIPPED_CRIMSON_HYPHAE("去皮绯红菌核"), STRIPPED_CRIMSON_STEM(
        "去皮绯红菌柄"
    ),
    STRIPPED_DARK_OAK_LOG("去皮深色橡树原木"), STRIPPED_DARK_OAK_WOOD("去皮深色橡木"), STRIPPED_JUNGLE_LOG("去皮丛林原木"), STRIPPED_JUNGLE_WOOD(
        "去皮丛林木"
    ),
    STRIPPED_OAK_LOG("去皮橡木原木"), STRIPPED_OAK_WOOD("去皮橡木"), STRIPPED_SPRUCE_LOG("去皮云杉原木"), STRIPPED_SPRUCE_WOOD("去皮云杉木"), STRIPPED_WARPED_HYPHAE(
        "去皮诡异菌核"
    ),
    STRIPPED_WARPED_STEM("去皮诡异菌柄"), STRUCTURE_BLOCK("结构方块"), STRUCTURE_VOID("结构空位"), SUGAR("糖"), SUGAR_CANE("甘蔗"), SUNFLOWER(
        "向日葵"
    ),
    SUSPICIOUS_STEW("迷之炖菜"), SWEET_BERRIES("甜浆果"), SWEET_BERRY_BUSH("甜浆果丛"), TALL_GRASS("高草丛"), TALL_SEAGRASS("高海草"), TARGET(
        "标靶"
    ),
    TERRACOTTA("陶瓦"), TIPPED_ARROW("药箭"), TNT("TNT"), TNT_MINECART("TNT矿车"), TORCH("火把"), TOTEM_OF_UNDYING("不死图腾"), TRADER_LLAMA_SPAWN_EGG(
        "行商羊驼刷怪蛋"
    ),
    TRAPPED_CHEST("陷阱箱"), TRIDENT("三叉戟"), TRIPWIRE("绊线"), TRIPWIRE_HOOK("绊线钩"), TROPICAL_FISH("热带鱼"), TROPICAL_FISH_BUCKET(
        "热带鱼桶"
    ),
    TROPICAL_FISH_SPAWN_EGG("热带鱼刷怪蛋"), TUBE_CORAL("管珊瑚"), TUBE_CORAL_BLOCK("管珊瑚块"), TUBE_CORAL_FAN("管珊瑚扇"), TUBE_CORAL_WALL_FAN(
        "墙上的管珊瑚扇"
    ),
    TURTLE_EGG("海龟蛋"), TURTLE_HELMET("海龟壳"), TURTLE_SPAWN_EGG("海龟刷怪蛋"), TWISTING_VINES("缠怨藤"), VEX_SPAWN_EGG("恼鬼刷怪蛋"), VILLAGER_SPAWN_EGG(
        "村民刷怪蛋"
    ),
    VINDICATOR_SPAWN_EGG("卫道士刷怪蛋"), VINE("藤蔓"), VOID_AIR("虚空空气"), WALL_TORCH("墙上的火把"), WANDERING_TRADER_SPAWN_EGG("流浪商人刷怪蛋"), WARPED_FUNGUS(
        "诡异菌"
    ),
    WARPED_FUNGUS_ON_A_STICK("诡异菌钓竿"), WARPED_HYPHAE("诡异菌核"), WARPED_NYLIUM("诡异菌岩"), WARPED_PLANKS("诡异木板"), WARPED_ROOTS(
        "诡异菌索"
    ),
    WARPED_STEM("诡异菌柄"), WARPED_WART_BLOCK("诡异疣块"), WATER("水"), WATER_BUCKET("水桶"), WEEPING_VINES("垂泪藤"), WET_SPONGE("湿海绵"), WHEAT(
        "小麦"
    ),
    WHEAT_SEEDS("小麦种子"), WHITE_BANNER("白色旗帜"), WHITE_BED("白色床"), WHITE_CARPET("白色地毯"), WHITE_CONCRETE("白色混凝土"), WHITE_CONCRETE_POWDER(
        "白色混凝土粉"
    ),
    WHITE_DYE("白色染料"), WHITE_GLAZED_TERRACOTTA("白色带釉陶瓦"), WHITE_SHULKER_BOX("白色潜影盒"), WHITE_STAINED_GLASS("白色染色玻璃"), WHITE_STAINED_GLASS_PANE(
        "白色染色玻璃板"
    ),
    WHITE_TERRACOTTA("白色陶瓦"), WHITE_TULIP("白色郁金香"), WHITE_WALL_BANNER("墙上的白色旗帜"), WHITE_WOOL("白色羊毛"), WITCH_SPAWN_EGG("女巫刷怪蛋"), WITHER_ROSE(
        "凋零玫瑰"
    ),
    WITHER_SKELETON_SKULL("凋零骷髅头颅"), WITHER_SKELETON_SPAWN_EGG("凋零骷髅刷怪蛋"), WITHER_SKELETON_WALL_SKULL("墙上的凋灵骷髅头颅"), WOLF_SPAWN_EGG(
        "狼刷怪蛋"
    ),
    WOODEN_AXE("木斧"), WOODEN_HOE("木锄"), WOODEN_PICKAXE("木镐"), WOODEN_SHOVEL("木锹"), WOODEN_SWORD("木剑"), WRITABLE_BOOK("书与笔"), WRITTEN_BOOK(
        "成书"
    ),
    YELLOW_BANNER("黄色旗帜"), YELLOW_BED("黄色床"), YELLOW_CARPET("黄色地毯"), YELLOW_CONCRETE("黄色混凝土"), YELLOW_CONCRETE_POWDER("黄色混凝土粉"), YELLOW_DYE(
        "黄色染料"
    ),
    YELLOW_GLAZED_TERRACOTTA("黄色带釉陶瓦"), YELLOW_SHULKER_BOX("黄色潜影盒"), YELLOW_STAINED_GLASS("黄色染色玻璃"), YELLOW_STAINED_GLASS_PANE(
        "黄色染色玻璃板"
    ),
    YELLOW_TERRACOTTA("黄色陶瓦"), YELLOW_WALL_BANNER("墙上的黄色旗帜"), YELLOW_WOOL("黄色羊毛"), ZOMBIE_HEAD("僵尸的头"), ZOMBIE_HORSE_SPAWN_EGG(
        "僵尸马刷怪蛋"
    ),
    ZOMBIE_PIGMAN_SPAWN_EGG("僵尸猪人刷怪蛋"), ZOMBIE_SPAWN_EGG("僵尸刷怪蛋"), ZOMBIE_VILLAGER_SPAWN_EGG("僵尸村民刷怪蛋"), ZOMBIE_WALL_HEAD(
        "墙上的僵尸头颅"
    );

    companion object {
        fun Material.getChineseName(): String? {
            return try {
                valueOf(this.name).Name
            } catch (exception: IllegalArgumentException) {
                null
            }
        }
    }

}