import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by nurkulov 12/26/19
 */

public class TestConstants {

    private static final String[]     ACTUAL_DEFENDERS                =
        {"Marcos Rojo", "Harry Maguire", "Victor Nilsson-Lindelöf", "Axel Tuanzebe", "Phil Jones", "Luke Shaw", "Eric Bailly", "Timothy Fosu-Mensah", "Aaron Wan-Bissaka", "Diogo Dalot",
            "Brandon Williams"};
    private static final String[]     GOALKEEPERS                     = {"David De Gea", "Sergio Romero", "Nathan Bishop", "Joel Pereira", "Lee Grant"};
    private static final String[]     EXPECTED_MIDFIELDERS            =
        {"Fred", "Bruno Fernandes", "Jesse Lingard", "Paul Pogba", "Nemanja Matić", "Scott McTominay", "Juan Mata", "Daniel James", "Andreas Pereira", "Tahith Chong",
            "James Garner"};
    private static final String[]     EXPECTED_MIDFIELDER_FROM_BRAZIL = {"Fred", "Andreas Pereira"};
    private static final String[]     EXPECTED_ATTACKERS              = {"Marcus Rashford", "Mason Greenwood"};
    private static final String[]     EXPECTED_COACH                  = {"Gaizka Garitano"};
    private static final String[]     EXPECTED_TEAMS                  =
        {"Arsenal FC", "Aston Villa FC", "Blackburn Rovers FC", "Bolton Wanderers FC", "Chelsea FC", "Everton FC", "Fulham FC", "Liverpool FC", "Manchester City FC",
            "Manchester United FC", "Newcastle United FC", "Norwich City FC", "Queens Park Rangers FC", "Stoke City FC", "Sunderland AFC", "Tottenham Hotspur FC", "West Bromwich Albion FC",
            "Wigan Athletic FC", "Wolverhampton Wanderers FC", "Hull City AFC", "Burnley FC", "Birmingham City FC", "Leicester City FC", "Southampton FC", "Leeds United AFC", "Derby County FC",
            "Middlesbrough FC", "Sheffield Wednesday FC", "Watford FC", "Charlton Athletic FC", "Ipswich Town FC", "Nottingham Forest FC", "Crystal Palace FC", "Reading FC", "Sheffield United FC",
            "Barnsley FC", "Millwall FC", "Rotherham United FC", "Bristol City FC", "Luton Town FC", "Huddersfield Town AFC", "Brighton & Hove Albion FC", "Brentford FC", "West Ham United FC",
            "England", "AFC Bournemouth", "Burton Albion FC", "Preston North End FC"};
    private static final String[]     EXPECTED_SECOND_HIGHEST_SCORER  = {"Denis Cheryshev", "Cristiano Ronaldo", "Antoine Griezmann", "Romelu Lukaku", "Kylian Mbappé"};
    private static final List<String> EXPECTED_COMPETITIONS_LIST      = Stream.of(
            "WC Qualification", "Primera B Nacional", "Superliga Argentina", "Supercopa Argentina", "WC Qualification", "FFA Cup", "A League", "Bundesliga", "Playoffs 1/2", "ÖFB Cup", "Erste Liga",
            "Coupe de Belgique", "Playoffs II", "Jupiler Pro League", "Division 1B", "Supercoupe de Belgique", "LFPB", "Premier Liga", "Série C", "Série A", "Série B", "Copa do Brasil", "Série D",
            "A PFG", "Kupa na Bulgarija", "Canadian Championship", "Playoffs 1/2", "Supercopa de Chile", "Primera División", "Chinese Super League", "Superliga de Colombia", "Liga Postobón",
            "Prva Liga", "Synot Liga", "Superliga", "Play Offs 1/2", "DBU Pokalen", "Copa Pilsener Serie A", "League Two", "FA Community Shield", "Football League Cup", "FA Cup", "Championship",
            "League One", "National League", "Premier League", "Meistriliiga", "European Championship", "UEFA Champions League", "UEFA Europa League", "UEFA Women's EURO", "WC Qualification",
            "Veikkausliiga", "Suomen Cup", "Coupe de France", "Playoffs 2/3", "Coupe de la Ligue", "Ligue 1", "Ligue 2", "Trophée des Champions", "Playoffs 1/2", "3. Liga", "DFL Super Cup",
            "2. Bundesliga", "Bundesliga", "Frauen Bundesliga", "Regionalliga", "DFB-Pokal", "Greek Cup", "Super League", "Magyar Kupa", "NB I", "Úrvalsdeild", "I-League", "Ligat ha'Al", "Supercoppa",
            "Serie A", "Serie B", "Coppa Italia", "Serie C", "Super Cup", "J. League Division 2", "J.League Cup", "J. League", "Virslīga", "A Lyga", "Premier League", "SuperCopa MX", "Copa MX",
            "Liga MX", "Johan Cruijff Schaal", "Jupiler League", "KNVB Beker", "Eredivisie", "Premiership", "League Cup", "Tippeligaen", "Playoffs 1/2", "1. divisjon", "WC Qualification",
            "Liga Panameña de Fútbol", "Primera División", "Superpuchar Polski", "Puchar Polski", "Liga2 Cabovisão", "Taça de Portugal", "Supertaça Cândido de Oliveira", "Primeira Liga",
            "Premier Division", "Liga II", "Supercupa României", "Liga I", "FNL", "Russian Cup", "Playoffs 1/2", "RFPL", "Russian Super Cup", "Premier League", "Championship", "Playoffs 2/3",
            "Scottish Cup", "ABSA Premiership", "WC Qualification", "Copa America", "Copa Sudamericana", "Supercopa de España", "Primera Division", "Copa del Rey", "Segunda División", "Superettan",
            "Playoffs 2/3", "Playoffs 1/2", "Allsvenskan", "Schweizer Pokal", "Super League", "1. Lig", "Süper Lig", "TFF Süper Kupa", "Premier Liha", "Kubok Ukrainy", "Playoffs 1/2",
            "Superkubok Ukrainy", "MLS", "Supercopa Uruguaya", "Primera División", "Primera División", "V-League", "Welsh Premier League", "FIFA World Cup")
        .collect(Collectors.toList());

    public static String[] getActualDefenders() {
        return ACTUAL_DEFENDERS;
    }

    public static String[] getGOALKEEPERS() {
        return GOALKEEPERS;
    }

    public static String[] getExpectedMidfielders() {
        return EXPECTED_MIDFIELDERS;
    }

    public static String[] getExpectedMidfielderFromBrazil() {
        return EXPECTED_MIDFIELDER_FROM_BRAZIL;
    }

    public static String[] getExpectedAttackers() {
        return EXPECTED_ATTACKERS;
    }

    public static String[] getExpectedCoach() {
        return EXPECTED_COACH;
    }

    public static String[] getExpectedTeams() {
        return EXPECTED_TEAMS;
    }

    public static String[] getExpectedSecondHighestScorer() {
        return EXPECTED_SECOND_HIGHEST_SCORER;
    }

    public static List<String> getExpectedCompetitionsList() {
        return EXPECTED_COMPETITIONS_LIST;
    }
}
