package testing;

import com.game.Player;
import com.game.level.Level;
import com.game.level.Map;
import com.game.mode.Game;
import com.game.mode.GameMode;
import com.game.pointing.Leaderboard;
import com.game.pointing.PointingSystem;
import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterTest {
    @Test
    public void testGetNickName() {
        Player player = new Player("NickName", 1);
        assertEquals("NickName", player.getNickName());
    }

    @Test
    public void testSetNickName() {
        Player player = new Player("NickName", 1);
        player.setNickName("NewNickName");
        assertEquals("NewNickName", player.getNickName());
    }

    @Test
    public void testGetLVL_For_Game() {
        Player player = new Player("TestNickName", 1);
        assertEquals(1, player.getLVL_For_Game());
    }

    @Test
    public void testSetLVL_For_Game() {
        Player player = new Player("TestNickName", 1);
        player.setLVL_For_Game(2);
        assertEquals(2, player.getLVL_For_Game());
    }
}

public class GameTest {
    @Test
    public void testGetDescription() {
        Game game = new Game("TestDescription");
        assertEquals("TestDescription", game.getDescription());
    }

    @Test
    public void testSetDescription() {
        Game game = new Game("TestDescription");
        game.setDescription("NewDescription");
        assertEquals("NewDescription", game.getDescription());
    }
}

public class GameModeTest {
    @Test
    public void testGetMode() {
        GameMode gameMode = new GameMode("Beginner");
        assertEquals("Beginner", gameMode.getMode());
    }

    @Test
    public void testSetMode() {
        GameMode gameMode = new GameMode("Beginner");
        gameMode.setMode("Intermediate");
        assertEquals("Intermediate", gameMode.getMode());
    }
}

public class PointingSystemTest {
    @Test
    public void testCalculatePoints() {
        PointingSystem pointingSystem = new PointingSystem();
        // Add code to test the implementation of the CalculatePoints method
    }
}

public class LeaderboardTest {
    @Test
    public void testGetNumberOfPlayers() {
        Leaderboard leaderboard = new Leaderboard(10);
        assertEquals(10, leaderboard.getNumberOfPlayers());
    }

    @Test
    public void testSetNumberOfPlayers() {
        Leaderboard leaderboard = new Leaderboard(10);
        leaderboard.setNumberOfPlayers(5);
        assertEquals(5, leaderboard.getNumberOfPlayers());
    }
}

public class LevelTest {
    @Test
    public void testGenerateLevel() {
        Level level = new Level();
        // Add code to test the implementation of the GenerateLevel method
    }
}


public class MapTest {

    @Test
    public void testSetLocation() {
        Map map = new Map();
        map.setLocation("Test Location");
        assertEquals("Test Location", map.getLocation());
    }

    @Test
    public void testSetArea() {
        Map map = new Map();
        map.setArea(100);
        assertEquals(100, map.getArea());
    }

    @Test
    public void testGenerateArea() {
        Map map = new Map();
        map.GenerateArea();
        // add any additional assertions to verify GenerateArea method implementation
    }
}
