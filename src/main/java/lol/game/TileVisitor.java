package lol.game;

public interface TileVisitor {
  default void visitGrass(int x, int y) {}
  default void visitRock(int x, int y) {}

  default void visitGround(Battlefield.GroundTile groundTile, int x, int y) {
    switch(groundTile) {
      case GRASS: visitGrass(x, y); break;
      case ROCK: visitRock(x, y); break;
      default: throw new RuntimeException("Missing GroundTile case in visitGround.");
    }
  }

  default void visitChampion(Champion c, int x, int y) {}
  default void visitNexus(Nexus n, int x, int y) {}
}
