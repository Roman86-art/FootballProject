
import Pojo.MidfieldersPojo;
import com.fasterxml.jackson.core.type.TypeReference;


import Pojo.AllTeamsPojo;
import Pojo.CoachSpainPojo;
import Pojo.Team;
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
import java.util.Map;

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
    public static List<String> getAllGoalkeepers() throws URISyntaxException, IOException, NullPointerException {

        HttpClient client = HttpClientBuilder.create().build();

        //  http://api.football-data.org/v2/teams/66
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("http").setHost("api.football-data.org").setPath("v2/teams/66");

        HttpGet get = new HttpGet(uriBuilder.build());
        get.setHeader("Accept", "application/json");
        get.setHeader("X-Auth-Token", "72bd7f61c55842bd88ee905ed35f15db");

        HttpResponse response = client.execute(get);

        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());

        ObjectMapper objectMapper= new ObjectMapper();
      Map<String, Object> allGoalKeepers = objectMapper.readValue(response.getEntity().getContent(),
                new TypeReference<Map<String, Object>>() {
                });

     List<Map<String, Object>> squad= (List<Map<String, Object>>) allGoalKeepers.get("squad");

        List<String> goalKeepers= new ArrayList<>();

        try {
            for (int i=0; i<squad.size(); i++){
                if(squad.get(i).get("position").equals("Goalkeeper")){
                    System.out.println(squad.get(i).get("name"));
                    goalKeepers.add(squad.get(i).get("name").toString());
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return goalKeepers;
    }

    /*
     * GET names of all defenders from England team
     * note: England team id is 66
     * Deserialization type: TypeReference
     */
    public static List<String> getDefenders() throws URISyntaxException, IOException {
        return null;
    }


    /*
     * GET names of all midfielders from England team
     * note: England team id is 66
     * Deserialization type: Pojo
     */
    public static List<String> getMidfielders() throws IOException, URISyntaxException {

        HttpClient client = HttpClientBuilder.create().build();

        //  http://api.football-data.org/v2/teams
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("http").setHost("api.football-data.org").setPath("v2/teams/66");

        HttpGet get = new HttpGet(uriBuilder.build());
        get.setHeader("Accept", "application/json");
        get.setHeader("X-Auth-Token", "72bd7f61c55842bd88ee905ed35f15db");

        HttpResponse response = client.execute(get);

        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        MidfieldersPojo serialize = objectMapper.readValue(response.getEntity().getContent(), MidfieldersPojo.class);

        List<String>midfielder = new ArrayList<>();
        try {


            for (int i = 0; i < serialize.getSquad().size(); i++) {
                if (serialize.getSquad().get(i).getPosition().equals("Midfielder")) {
                 //   System.out.println(serialize.getSquad().get(i).getName());
                    midfielder.add(serialize.getSquad().get(i).getName());
                }

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(midfielder);

        return midfielder;
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

        HttpClient client = HttpClientBuilder.create().build();

        //  http://api.football-data.org/v2/teams
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("http").setHost("api.football-data.org").setPath("v2/teams/77");

        HttpGet get = new HttpGet(uriBuilder.build());
        get.setHeader("Accept", "application/json");
        get.setHeader("X-Auth-Token", "72bd7f61c55842bd88ee905ed35f15db");

        HttpResponse response = client.execute(get);

        Assert.assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        CoachSpainPojo coachSpainPojo = objectMapper.readValue(response.getEntity().getContent(), CoachSpainPojo.class);
        List<String>spainCoaches=new ArrayList<>();
        for (int i = 0; i <coachSpainPojo.getSquad().size() ; i++) {
            if(coachSpainPojo.getSquad().get(i).getRole().equals("COACH")){
                spainCoaches.add(coachSpainPojo.getSquad().get(i).getName());
            }

        }
        System.out.println(spainCoaches);
        return spainCoaches;



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
