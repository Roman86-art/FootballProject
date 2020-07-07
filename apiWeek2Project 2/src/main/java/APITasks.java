
import Pojo.AllTeamsPojo;
import Pojo.Defenders.DefendersPojo;
import Pojo.Defenders.Squad;
import Pojo.Team;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nurkulov 12/26/19
 */
public class APITasks {

    /*
     * GET all soccer team names listed in given resource
     * Deserialization type: Pojo
     */
    public static List<String> getAllTeams() throws URISyntaxException, IOException {

        HttpClient client = HttpClientBuilder.create().build();

        //  http://api.football-data.org/v2/teams
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("http").setHost("api.football-data.org").setPath("v2/teams");

        HttpGet get = new HttpGet(uriBuilder.build());
        get.setHeader("Accept", "application/json");
        get.setHeader("X-Auth-Token", "72bd7f61c55842bd88ee905ed35f15db");

        HttpResponse response = client.execute(get);

        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        AllTeamsPojo allTeamsPojo = objectMapper.readValue(response.getEntity().getContent(), AllTeamsPojo.class);

        List<String> teams = new ArrayList<>();
        for (Team team : allTeamsPojo.getTeams()){

            teams.add(team.getName());
        }

        return teams;
    }

    /*
     * GET names of all goalkeepers from England team
     * note: England team id is 66
     * Deserialization type: TypeReference
     */
    public static List<String> getAllGoalkeepers() throws URISyntaxException, IOException {
        return null;
    }

    /*
     * GET names of all defenders from England team
     * note: England team id is 66
     * Deserialization type: TypeReference
     */
    public static List<String> getDefenders() throws URISyntaxException, IOException {

        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder uri = new URIBuilder();
        uri.setScheme("http").setHost("api.football-data.org").setPath("v2/teams/66");

        HttpGet get = new HttpGet(uri.build());
        get.setHeader("Accept", "application/json");
        get.setHeader("X-Auth-Token", "72bd7f61c55842bd88ee905ed35f15db");

        HttpResponse response = client.execute(get);
        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
        ObjectMapper mapper = new ObjectMapper();
        DefendersPojo deserialization =  mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false).readValue(response.getEntity().getContent(),
                new TypeReference<DefendersPojo>() {
                });

        List<String> defenders = new ArrayList<>();
        try {
            for (int i = 0; i < deserialization.getSquad().size(); i++){
                if (deserialization.getSquad().get(i).getPosition().equalsIgnoreCase("Defender")){
                    defenders.add(deserialization.getSquad().get(i).getName());
                    System.out.println(deserialization.getSquad().get(i).getName());
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


         return defenders;
    }



    public static List<String> getMidfielders() throws IOException, URISyntaxException {
        return null;
    }

    /*
     * GET names of all midfielders from England team whose country is Brazil
     * note: England team id is 66
     * Deserialization type: Pojo
     */
    public static List<String> getMidfielderFromBrazil() throws URISyntaxException, IOException {
        return null;
    }

    /*
     * GET names of all attackers from England team whose origin country is England
     * note: England team id is 66
     * Deserialization type: Pojo
     */
    public static List<String> getAttackerFromEngland() throws URISyntaxException, IOException {
        return null;
    }

    /*
     * GET name of Spain team coach
     * note: Spain team id is 77
     * Deserialization type: Pojo
     */
    public static List<String> getSpainCoach() throws URISyntaxException, IOException {
        return null;
    }

    /*
    GET list of all competitions
    Deserialization type: POJO
     */
    public static List<String> getAllCompetitions() throws URISyntaxException, IOException {
        return null;

    }

    /*
     * GET names of second highest scorrer from competitions of 2000 season
     * note: endpoint for competitions: `competitions/<year>/
     * note: endpoint for scorers: `competitions/<year>/scorers`
     * Deserialization type: Pojo and TypeReference
     */
    public static List<String> getSecondHighestScorer() throws URISyntaxException, IOException {
        return null;
    }
}
