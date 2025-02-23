package earth.terrarium.chipped.registry;

import earth.terrarium.chipped.recipe.ChippedRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;

import java.util.function.Supplier;

public class ChippedRecipeTypes {

    public static final Supplier<RecipeType<ChippedRecipe>> BOTANIST_WORKBENCH_TYPE = register("botanist_workbench");
    public static final Supplier<RecipeType<ChippedRecipe>> GLASSBLOWER_TYPE = register("glassblower");
    public static final Supplier<RecipeType<ChippedRecipe>> CARPENTERS_TABLE_TYPE = register("carpenters_table");
    public static final Supplier<RecipeType<ChippedRecipe>> LOOM_TABLE_TYPE = register("loom_table");
    public static final Supplier<RecipeType<ChippedRecipe>> MASON_TABLE_TYPE = register("mason_table");
    public static final Supplier<RecipeType<ChippedRecipe>> ALCHEMY_BENCH_TYPE = register("alchemy_bench");
    public static final Supplier<RecipeType<ChippedRecipe>> MECHANIST_WORKBENCH_TYPE = register("mechanist_workbench");

    public static void register() {
    }

    private static <T extends Recipe<?>> Supplier<RecipeType<T>> register(String identifier) {
        return register(identifier, () -> new RecipeType<T>() {
            public String toString() {
                return identifier;
            }
        });
    }

    private static <T extends RecipeType<E>, E extends Recipe<?>> Supplier<T> register(String id, Supplier<T> type) {
        return RegistryHelpers.register(Registry.RECIPE_TYPE, id, type);
    }
}
