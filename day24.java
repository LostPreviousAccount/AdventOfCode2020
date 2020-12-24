import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day24 {
    static String problem = """
            nweeseeeeswsweenw
            nwnwnwneswswnwnwwnwnwnwnwnenwsenwnwnwnenw
            wnewneswnweseneseseswnewnesweswwnene
            weswnwnwnwnwewswnwwsenwnwwwseewe
            wnesewwswwsewenewnwswswnwwewwne
            enweseseseneeseseseeswsese
            neenesenewswnenenenwneseneeneneneneewne
            swwnwswwsewswswnwseeseeenewewe
            seseseeseesewwsenesesenwnweeesesew
            neneeeneseseewnwseeswsenwwwenwswe
            eeeseesewnwseeeseeseswnwneswnwnee
            swesenwsesesenewnewsewnesese
            swsewwseeneswsewnesenwsene
            wseseseneenwnewnwwseeenewnwneenwse
            eeeeswweeseesewnwneeeenwee
            swseseseswseesesenwsesesenwenwseseseswsese
            eenwseswwswnwewwnwsenwenwwwneeww
            seswswswseseneswneswswswswsewneseneseswsw
            seswwseseseswseseswswseseseswswnwneesw
            enwenwnwswnwswenwneswneswnwnwnwnwnwnwnwne
            wwwwwwnewwneswwswwewwwww
            ewneeneswsesenesweeeeewseeewnw
            swsenesweseswseswseesewwswswnwnwsesesw
            nwenwseneseeswsenweneseeswnenw
            nwnwnwnwnwnwnwwnwnwnwsenwnw
            wsewwnwwwwsenenwewwswwnwwsewe
            wwwnwwwewewwwswswnweswnwnwwww
            eewesenenenwneeeeeseneee
            nwswnwewwweneneneswnenwneneenwwe
            neenwswseeeweeeseeswnwww
            nwseswsewwseseswenesenesenewswneswe
            ewnwnwnwnewnenweneeneneneseneneww
            nwnwnwsenwwwnwnwnw
            wswsenenwsenwwnewnenwnwnwnwnwnenwwsw
            eeeeeeeeeweeneesw
            nwewswwwnenwenwweswwswnwenwwnw
            swsenenweeeswswswswseswswwswnwwswenw
            newnesenenwseneseeneseewwnwnewsene
            newnwneswnwneesewnwwnwnwwnwnwwswwnw
            ewwswswswsewswnwewwswswswswswnwsew
            nwnwsewnenenwseseesene
            seseseswseseseeesesesewsenenesesenewse
            neewnewnenewwnwenwwnwenwneesenw
            sewnwnewsenenenwsesesewswseeeseseswse
            eswwsesesesenenewswwnesesewsesenese
            nwnwnwsenwswnwnewenwnwnwwsenw
            wenwswwwwwswewwswwwwwww
            enweeweneeeeneeeseeseeswwsew
            neseneneeneneneneneneneswnwwnenenenene
            eeneseneneeweeeeee
            nenwnwseenenwnwneswnwswnenenwnwnwswswnene
            nenenwnewnewseswnwnwneneneneesenenenenw
            ewwwwneswwsesewswswwswwnwswwsw
            neeneenenwswneneeeeneneeee
            sewwnwwnwnewsewwwwnwsenwww
            swswneseswswswswseswswswnwnwswenwnwnesesw
            wwwwnwewwwnwwswnwsenwwww
            wswewnwswseswwswseswwwnewwwnesww
            wneswseseswswswsesesenwseseneseswesesese
            nenweeswnwwnwneseswnwneeneseneswnwne
            nwnwswnwnwnenwswnwnwnwnenenwe
            eswesweenenwnweneeeeene
            nweewneneneneneneenesweseneenewse
            wwswswswswswnwwwswsew
            nenenenesenwnenwswnenwnenwnenenenenwnese
            wnwwwwwnwnesewnwwsewnwnwswnwww
            neneneneneswneswwnenenenenwnwseenenenese
            nwnwnenenenewnenewnwnwnesenwnwneseenene
            seenwnwsenwsenwnweswwwwwnwneneswsenw
            nwseweswwswwwwneswwnweenesewnwsww
            eeeeeeeesewenenweeseeenew
            sewwsewwwwwnwnwwwwnewwesenww
            sweeswweswenwsesesewnewwwseswesw
            swswswswesenwswwsweswswswsenweswnwsw
            nwneswnenwnwswnenwnwnwenenwnwnenwnw
            seswnwnwnwnwswwwewnwnwnenw
            wwnwnwwnwwneeswwwswwwwnwswenw
            neenwnwenwwnwnwswenenwwsweeswnwse
            nenewnewneneeswnesenwnenwnwesesewsw
            wswnwswwwwneseswneswswwwswseswnew
            nwnenweswnenwnwseneseswswnwswnwnenweswnw
            neneseswnenenenenwsenenenwnenenwnenenwsw
            eneseneswsenweeseseeweseseeswsee
            seesesesesewseseseenesese
            nwenwnenwwnwsweswnwnwwwswwnwnenwwne
            wsenewswsenwneseswwnesewneenwwnwse
            newwwnwwswwenwwwesewwwwwwwnw
            eeweswneswneswenweewnesewsenwswnww
            nenweswseswswswneseswswswswnwswsesw
            wwewswwnwnwwnenweneswnwweseww
            wseweseseseseseswseseseseneesenesese
            swwswswswswnwwswswswweswwswseswswne
            nenwnwenenweseseseneweneeweeneesene
            seseseseswseseeseswseeseseswsenwsenwsw
            swseswswswseswnwseseseeswswsesesesewne
            wswswswswswwswswnwswwwswsenenweew
            nenwnwneneewenwnewneswweswnesw
            seeeeweeeeeeneesesesee
            swneneswswnwseneswswswsenwswwsweswenwsw
            swseeeeswneneesenwnwnwseeseeswnwsewsw
            wenwnwnwnwsenwnwwswwnwnewnwsenwswnwse
            seeeswsesesenwsesesewsesesenwesesenwse
            swenwseswseseswseneswswswswswseeswwwsw
            nenwneneeesweeneseeneneeneneeswe
            eswsweswwswswswswswwwnwweswswswsw
            nenwneeenenwswewneswswenee
            swswwswwwnwnwsenwneswwseswwswsenee
            eswsesweswswsewsenwewsweswwesenw
            wnenwnwwsenewnwewenwnwwnwsesenwsw
            eneeneeneeeneeenwwnesweneeeswe
            swsweswswswswswswnwswswsenwswsw
            nenwnwnenenenwnwnwnwnwsw
            seweseneeeeeseneesweesesewenw
            enwwwnwweswwenwweswwenwswwswwnw
            nwswnwneneneneneswwnwnenenenesenenenenenw
            nenwnenwswswneneenwswneneneneneswswnenene
            nwwseneseseeseseswseesesesewsesenesese
            seneseseseswneseseseswseswseswsesenenenw
            seeswseswseswswswswswseeswswswnesewsenw
            newneneneeeneneene
            eeeseeweeeeenweesenweeesw
            swneswswsesewswneswwseswseswneswswsesese
            nwseswnewswswnenwenewnenenwnesene
            wsenewswwwwwwewwwwwwwnwnew
            eseeeswsewwewnenwsesenewenwsenee
            newswwswwweswwsewnenwnweseswene
            sesesewwseseswneseswnesesenwsesenwesese
            enwenwnwnwnwnwnwewnwnwnwwsenenwnwnww
            wnenwnenwswnesesenenenenenenenenewne
            sesweseenenwnwseneeesweswseswwnwse
            wswneneeseneweneseweswnenwnwwnwee
            nwnwnwwwsewwwwnwwwewwnwwsew
            weenwnwnwnwwsewnwnwenwwwwnwww
            eesweeeenwseesewseesenweesee
            nwnenenwnewnwnwsenwenwsenwnwnenwnenwnw
            enweeeeeeseneeeweeeeeesw
            seswsesenewnesewnwneswnenenewwnwenw
            wswwswswwswswswswneswswswneswswswswe
            seseseeesenwesesese
            swswswswswseswswswneswwnwswswseneeswswsw
            wnewwewwswnwwwneseweswswseww
            seeeneneesewsewseenesenwwweneseswse
            neswswswswseswnwswseswswswswswswswnwswsw
            wseswsenenenenenwneneneenwnwnwnenenenewne
            wwswwwwnwenwnwnwnwwnwnw
            sesenwsewwswsesesesesesesenenesweseseew
            esenenewnenesenesenwnwseswneenewwwne
            ewseswseswseswwwsenenwswseesesesesw
            swseseseseneseeswseewswseneeeenesese
            ewneswnenwswwswwwsew
            eewwnwnwwnenenenwnwnenwswnwseneenenw
            wswwnewwwwswwwwswswwwne
            neswnewnenewswneneneenwnenenwe
            sweeneeeeeeweseeesenweseese
            seswsenwseeseswseeseewsenwwweswsese
            nweenwnwwnwnwsenwnwnwnenwsewnwnwnwwwe
            ewnewneeesweswwswswwwww
            wwswwsewnewswswwewwenesewwwww
            sesweseesewswswseswseneswseseseswnwse
            wwswnwwswewwseswswwweew
            eesewneneneneneseswseneeenenenwwwse
            neenwnwnenenwnenwswnene
            seseseseswswsweswenwsewseswswswsenwsw
            swswnwswswneswswewswswswswwenwswnwswe
            eeseeeeeeeesesenwenewseseew
            eswseseeswnwwseseseswsesesenesesewseswse
            swneseswswesenewwwswenenwwswwwsesw
            nwwnwnwnewswnwwwenwwwsenwnwnwwnw
            swnwnwnwnwnenwnwnwseeeswwnwnwnenenenw
            nenwnenenesenesenenwneenewneneswnenene
            seseewseseseeeseeseseeewneese
            eneeneeeseewewnwseneneesweswe
            sesenweeseseneesweseeeeseeenwsesw
            nwnwnwnwsenwnenenesewnenenweneswnenwnww
            nwnenenewneeneenwneenweneswnewsww
            neseseneseseswwswsese
            nwenenwnenweseneswnwnwwnenwnenwnenene
            neeeeseneneeeneeneenw
            nwswnwnwnenwnwnwwsenwnwwnenwsewnwnww
            enwnwwwnweswneswnesesenenenwnwnwnew
            seswwnwsewwwwswneeswwwwwsenewnw
            wwwwwwnenwewwwnwwnwsenwnwnwwsese
            neswseewnwnenwwswsenwwnwnwneseneseee
            eesweseswswsenwnwnwnesw
            nwnwnwnesenwnwnwwneenwnwwnwnwne
            weeesweseswewenesenwnweseneenw
            enesewesweswnenwswnwwseeseneeseee
            sesenwnwseswseswswsenwneesew
            nwnwnewnwnwnewswnwwwwewnwnwnwsenw
            nwnwseneswnenwnenenwnenwnenenwnw
            wswsewwswnewswsewswwwneswnwneswswsw
            seneseneenwseeneneenenenenenewweww
            swswseswnwswswseswne
            seneswsewswseswenesenenweenwesesenwse
            nenenwnenwsenwnwsenwnwnwwnwnwwnwnesenwnwnw
            wwnwwwnwnwnwnweswnwsew
            wneswwwnenwwswseseswwnenewswwswse
            swswswswswswweewsw
            wwwnewseewswnewswswswswneeenwwsw
            sewsesweseseswseesesesenesewwnwswwnee
            swswnenwswswswswseswswswswsweswswswsw
            ewwwwwwwwwsenwewwswwsewnenw
            sweswswnweenwnwnwnwnwnwweewswnwenwnw
            eeeenweeseeenesenenwwnwseswweesw
            swwseseswnenwswswwswnwnwseseeneewsesw
            sesenwseeneseeseswswsesewseseneseseswsw
            nwswswswewswswnwswswswseswsww
            eseswsenwswswswseswswswswswneswsw
            esewnweeweeswnw
            sweneweenwsenewnwseswnenenwnwwnese
            ewnewneswsesesweneneneenwsw
            swwwwnwswwseswwneseswnwwsewwwww
            neenwnenenenwsewsewnwwnwwsenesenenwnw
            swwneswenwwswseseeswseneneseswwseseswsw
            nwneswsenwseenwwnwnwnwnwwnwnwnwnwnw
            wwnwswnwsewwwnwwwewwenwsenwwe
            sweseseeeseseeeeseeneeesenw
            weweeeeseeneseeeeeeewseee
            wswswewnesewwwswwwwwnewnwwe
            seeeseseseseeseswseseenenwseswwsesee
            eswseswnwneseswswswswsw
            neneseenwnenenenweseneeeeeseneew
            swnenwnwsenewnenewsenwneseseseswwswne
            seseseseseseseseswsewneseswwsesesenese
            enwwnesewsenesenwenenwneseesenenwneswse
            senwnenwwnwnwwnweneswsenenwswswnwenesese
            seswseseseseseesesenwseesesesese
            eeeeswneeenwweeesenee
            nwwnwseewnwwwwww
            neenenwneneneswenwneeseswnwnwneseswne
            swseseseseseseseesenwsw
            wnwseswewswswneesenwsenwseseeenesesw
            nwswnwnwenwnwswnwenwwenwwnwswwweenw
            wweweeseeseeeseeneeeeneee
            seweeswnwsweeeeseeeswenwneewe
            seswseswswsewswswneseswsw
            wweseneswseseeseseenwswseseeseneneee
            wsenenwwswnwwseesenweswwnwnwnwenwnw
            sweswnwswenweeswnwswswwwwswswenesw
            seseseesewseneseeseseneesewswseewe
            swneswswseswsweswswwswwswswnwne
            nwneneseneneseswswenenenwnewneneneneene
            seseswswnewneseseswseseeswneswwswswwese
            nwswnwnwewsenwnenewwwswewnwwww
            newnwseseneswwwnewsweewwseesene
            wwwwnewwwwnwswswenewenwsenesww
            senenwneeneeeenwesw
            swnenenwswswnweneswswswnwesewsenwswswsw
            nwnwnwsenenwnenwnwwnwnwnwsewwnwenenw
            seswnewswswneswwewswswwswwswwwsww
            swnwesewwswswswwswnwneswswse
            swseswwwwnewwwswww
            wswneneneseswnwnenweswenwnwnenesesewnenw
            wewwneenenwnwnwsenwseswswswsewseenee
            swenwnwneenwnwnwnwswnwnwswnwnwnwnwnwnwnw
            nwnwsenenenwnenenenenenenwnenene
            wnweeeeseseseenwseswnwsesesesesesene
            wneswseseswseeeseseeseneneeseeee
            neneneswnewnwwswneswnwneneneneseenesw
            wswnwneewwswwewwnwnww
            ewnwwnwnenwnwnwwwswwwsewenwww
            seswseseseswswswneswswswsw
            seneseesesenwswseseseseeseseewsewsese
            neswwseswnwwseswneseswswwnwseeenenese
            nwnenwnwnwwsenwnenwnwnenwseseswsenwswnew
            nwnwnwseenesenwneneenwewnwswswnenwnenw
            wnwnwwseswnesweneneeswswsw
            sesenwseneeweeseeswenwseswseeseswsee
            nwswnwsenwneswnwneeewnweswnwwswnwnw
            nenwnwnwsenewsenwnesewsenesenwnenenenw
            esewswseseseswsenwsenweswsesewnwsene
            eenwneweswwsweeneeeneneneseese
            swswwswseswswswswswnwswswwseneeneswswsw
            nwewseeeseeseeseseseneenwseesw
            eseseeesenwseseesesesewesenewesewne
            nwnwswnwnwwwnwewwnwwnenw
            nwnwsenwwwnesenwnwnwsewnwnwnwnwnenwnwnw
            eeeeeeewwseeewseenwswsenwnene
            wsesewswswneswswwswswnwnwswesweww
            sewsewswwnenwswseswswswneswsenwseesw
            enwnewnwswseseneswnweneenwswnenwnwwse
            swneneenweeenenesweneswneneswneene
            nwsenwnwnwnewnenenwnwnwsenenwnwnenwwne
            nwnwwnwwnwnwenwenwwnwseswnwnwewwnw
            senwseeswseseeweswwsweseeneneneene
            nwswneenwnwenenenwswseseeswseenenenene
            seeeweneseeseee
            eswwneswwsweesenwsesewenwse
            eenenewnewnenwneneneeeneseneseneese
            ewseseswswenewwseswse
            seseeseeesweseseeeseseeeneswnww
            nwnwweswewsenwnenenwswnwneesenwwswnene
            eeeeenwwseeeseeweweeeseenw
            eswnenewswseeswsenwseswswsewswswneswsw
            wewsewsewwnwnwewwnenwwwwwwswse
            nwneneswswneweew
            eeeseseswseesewsenewenwseneneweese
            esesesesesesesenwseseesesw
            enenewnesweneneenenenene
            seneswnenwnwnenenenee
            swswseswswwswwseeswnwswnwswswneswswsw
            nenwnwnwnenwnenwswnwnwneneenwnene
            seseswswsenwesesenwseswnwswseseseswnwseswe
            senenwsesesewwsweseseswneswseswsewswsesw
            enweswswneseeeenwsweeeeseene
            nenwneswnenwenenenenwnwswnenwwenesenw
            eneewneswenenenwweseweseeneenenw
            swseeswnwswweneeswnwswswwwswneswnw
            sweeswswswswswswswswseseseswnwswenwwsesw
            nenwwwwwnwswwneswesewnewswwwe
            neenewnewneeeseneeneeeswnwwnene
            eswswnwswswseswnenwseswswsesenenwsesewnwse
            swnwnweneeeneeeneneswwwene
            swswwswsewneswswwswwwnwsweswnwwsesw
            sewseewswswseesesesenwwnesenwseese
            nwswsenwnesweneeenenenenenenenenenenw
            eeseenwseesewnweeeneeseeewe
            nwnwswswnwnewwnewswnwnwenwwnwnwwnw
            wswswseneswwnenwswwwneswneswswseswsw
            enesenwsweeeesweeenw
            nwsweeeeneeeneeswseeeeewneew
            eswweseeneneneweenwenesweswewe
            nwsesenwewwnewnwnwnwnwwneswnwewwwe
            swswwwswnweswswseswswwwswswnewswsw
            neneweeweeneswsweeeeenweeee
            senenenenenenenenwnwswnese
            nwswwnwnwnwnwwnwsenenwnwnwenenwnwnenwnw
            eneweesesweswnweweeeeseesesenese
            seweneeneeewwneseenenee
            nwnwnwwnenwseswnwnwwewwse
            wwsenwwwwwswsewnwswswnewwswsesw
            neneneswswseseseeeenweeeeeewesw
            sesweneneenweeenesweenenenwnweee
            nweswnwneneneneneswswswene
            eseeesweenesweneeenwswe
            nenwwnenwswwnenwsesesenenewseseeswsesw
            senwneweneewnwswsesenwnwnwnwewnwnw
            neeswnenwnenwnwnenenenenwwnw
            nenwsewneswswswsewseseseeseswneneswse
            senenwnenwsenwnwnenenwnwnene
            senenenwsewnesewwwesewswswseswswe
            swswswnwwswswswswsesesweneswseseswswsenw
            seneesenwenewnwsewsesweseeseesew
            seseenweseeseseeseseneenwesesesesw
            wwewnwwnwswnwwnenwnwnww
            wwneswnenewnwneeenwnenenenwnenenwsene
            swwswneswwswwwwswweswwswwswesesw
            wwwnwwnewswnwnesenwsewwwnwwnww
            swwneweswswwwsw
            wswswswwneswwwwwwwww
            sweeesenwnwenwswe
            wswwswsenwswswnwswnesweseswwswswsww
            swseswwnwsweswswneswswwswswswseenwsw
            swwneeeeeeneenee
            neneenenwnenenenwneneneenenwneswneswne
            nenwneneseneneneeneeswnwnesenene
            swswneswswnwenwseseneswwwswseneenwnwsw
            newwwwwsewnwnwsewwww
            wnwsenwnwnwnwnwnewnwnwnwnww
            seseseneswseseseseseswsesew
            seeswsewnwneewnenesewwnwnwnenwsesww
            wswnwnwsenewneswswnwseneneneeseeswnwnw
            swwswswswewswswnesw
            swseswsenesenweswsewwesesenwsenese
            eneneeneeneeneeseweswneeewsene
            nwseeeeeeswswneeswsenweeeesenee
            nwnwenewnwneseneenwsweswswnenenenenw
            nenewswewswneeneneeeneneenenenwnew
            sewweswnenwswwnwnwewsenenwsewenw
            neswneseswswnwseswnwsw
            nenwseswnwwswsenwnwwswsenesweseswwsene
            swwwwwwswwnwewwwwnewwseww
            nwneeseneneneneswneeeswneswnenenwwnwnw
            nwwnwwwsewwwnwswnewwswsenenwwnww
            nwwnwnwnwswenwwsenewnww
            nwnwsenenenenenenenene
            neenweenesenwneeneneeswnenenenwswwese
            eewweeneneeeeeenwneenesewsesw
            swseswnenewswswswsw
            swnwewneeswnweseswenwswseeeseeene
            wenwneneenwnwsewnwswwsenenwnesenwne
            eeeweeseeeneeeeeenweewe
            sewnwnwswnwnenwnwnwneenwnwseswnwnwnwnw
            wwnenwnwwsenwnwnwwswswnwnwnwnwnwwenw
            neseeseeseseswnww
            senwsewnweeeseesenwsweeneseseneee
            seseeenwwseeseesewsweeseeenee
            wwwnwswwsenwwwwwseswnwewswwswse
            swnwnwnwnwnwnenwnwnwwenwwsenwnwwnwsww
            neseneeeneswneenwnewsweenenenesewne
            nwwnenewwswwwnewswsewwenwsesww
            seswwwnwnenenewswswww
            nwnenwnwsewnwnwswnwnenwnenw
            wswswswnesweswswswswsweswswswswswswnw
            nwsenwwnwsewnwwnwnwnweneswnwwwnwnww
            senwnwnwewnwnenwswnwnwsenwnwnwnwnwnwnw
            wweneweswswwewswnewnwwwwnwsewsw
            seneeswwwwwwwnwwnwnwsenwwenwswnw
            nwnweseeswwsenwnwwsenwewnwnwnwnwwnwe
            sewwswweswswewnwswwswneseswseswnw
            neswneneneneneenweneneenee
            newseseseseswnwesesenenewseseswsesese
            swnwsesesesesesesesesesenwseseweswsenese
            nwenwswnwneneenesenwnwswnenw
            sewsenenweenwswnewsenwsweseseswsenese
            swneswnwsweeeswenenwnesweeewe
            senwseeenwenenwneeeeneenesw
            nenenenweseeswwseneewnwwseeesesw""";

    static String ex1 = """
            sesenwnenenewseeswwswswwnenewsewsw
            neeenesenwnwwswnenewnwwsewnenwseswesw
            seswneswswsenwwnwse
            nwnwneseeswswnenewneswwnewseswneseene
            swweswneswnenwsewnwneneseenw
            eesenwseswswnenwswnwnwsewwnwsene
            sewnenenenesenwsewnenwwwse
            wenwwweseeeweswwwnwwe
            wsweesenenewnwwnwsenewsenwwsesesenwne
            neeswseenwwswnwswswnw
            nenwswwsewswnenenewsenwsenwnesesenew
            enewnwewneswsewnwswenweswnenwsenwsw
            sweneswneswneneenwnewenewwneswswnese
            swwesenesewenwneswnwwneseswwne
            enesenwswwswneneswsenwnewswseenwsese
            wnwnesenesenenwwnenwsewesewsesesew
            nenewswnwewswnenesenwnesewesw
            eneswnwswnwsenenwnwnwwseeswneewsenese
            neswnwewnwnwseenwseesewsenwsweewe
            wseweeenwnesenwwwswnew""";
    private final String input;
    private Set<String> blacks;

    public Day24(String ex1) {
        this.input = ex1;
        this.blacks = new HashSet<>();
    }

    private void solution1() {
        var inputArr = this.input.split("\\n");
        for (String line : inputArr) {
            String tile = todo(line);
            if (blacks.contains(tile)) {
                blacks.remove(tile);
                //System.out.println(tile + " to white");
            } else {
                blacks.add(tile);
                //System.out.println(tile + " to black");
            }
        }
        System.out.println(" ==> blacks : " + blacks.size());
    }

    private void solution2() {
        int round = 0;
        while (round++ < 100) {
            int[][] neighs = new int[400][400];
            blacks.forEach(s -> {
                int[] sarr = Arrays.stream(s.split(",")).map(Integer::parseInt).mapToInt(i -> i).toArray();
                neighs[sarr[0] + 2][sarr[1]] += 1;
                neighs[sarr[0] - 2][sarr[1]] += 1;
                neighs[sarr[0] - 1][sarr[1] - 1] += 1;
                neighs[sarr[0] - 1][sarr[1] + 1] += 1;
                neighs[sarr[0] + 1][sarr[1] - 1] += 1;
                neighs[sarr[0] + 1][sarr[1] + 1] += 1;
            });
            for (int i = 0; i < 400; i++) {
                for (int j = 0; j < 400; j++) {
                    String tile = i + "," + j;
                    if (blacks.contains(tile) && (neighs[i][j] == 0 || neighs[i][j] > 2))
                        blacks.remove(tile);
                    else if (!blacks.contains(tile) && (neighs[i][j] == 2))
                        blacks.add(tile);
                }
            }
            System.out.println("round " + round + "  ==> blacks : " + blacks.size());
        }
    }

    public String todo(String line) { // https://www.redblobgames.com/grids/hexagons/#coordinates-doubled
        var tile = new int[]{200, 200};
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            switch (c) {
                case 'w' -> tile[0] -= 2;
                case 'e' -> tile[0] += 2;
                case 'n' -> {
                    i++;
                    c = line.charAt(i);
                    if (c == 'w') { //nw
                        tile[0] -= 1;
                    } else { //ne
                        tile[0] += 1;
                    }
                    tile[1] -= 1;
                }
                case 's' -> {
                    i++;
                    c = line.charAt(i);
                    if (c == 'w') { //sw
                        tile[0] -= 1;
                    } else { //se
                        tile[0] += 1;
                    }
                    tile[1] += 1;
                }
            }
        }
        return tile[0] + "," + tile[1];
    }

    public static void main(String[] args) {
        Day24 day24 = new Day24(problem);
        day24.solution1();
        day24.solution2();
    }
}
