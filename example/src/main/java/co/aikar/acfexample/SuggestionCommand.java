package co.aikar.acfexample;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.Flags;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.World;
import org.bukkit.entity.Player;

@CommandAlias("suggest")
public class SuggestionCommand extends BaseCommand {


    @Subcommand("world")
    public class WorldSubCommand extends BaseCommand {

        @Subcommand("default")
        public void testSuggested(Player sender, World world1, World world2) {

        }

        @Subcommand("stars")
        @CommandCompletion("* *")
        public void testSuggested2(Player sender, World world1, World world2) {

        }

        @Subcommand("annoted")
        @CommandCompletion("@worlds @worlds")
        public void testSuggested3(Player sender, World world1, World world2) {

        }
    }

    @Subcommand("player")
    public class PlayerSubCommand extends BaseCommand {

        @Subcommand("default")
        public void testSuggested(Player sender, Player a) {

        }

        @Subcommand("stars")
        @CommandCompletion("*")
        public void testSuggested2(Player sender, Player a) {

        }

        @Subcommand("annoted")
        @CommandCompletion("@players")
        public void testSuggested3(Player sender, Player a) {

        }

        @Subcommand("flagged")
        @CommandCompletion("@players")
        public void testFlag(Player sender, @Flags("other") Player a) {

        }
    }
}
