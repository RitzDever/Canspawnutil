
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;

public class Util {
	public static boolean canSpawn(Location l) {
		for (int x = 0; x <= 1; x++) {
			for (int y = 0; y <= 1; y++) {
				for (int z = 0; z <= 1; z++) {
					Block b = l.getWorld().getBlockAt(l.getBlockX() + x,
							l.getBlockY() + y, l.getBlockZ() + z);
					if (b != null && b.getType() != Material.AIR) {
						return false;
					}
				}
			}
		}
		return true;
	}
}