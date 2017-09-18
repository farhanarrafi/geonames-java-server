package edu.aiub.cs.geonames.controller;

import edu.aiub.cs.geonames.model.Geoname;
import edu.aiub.cs.geonames.repository.GeonameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Farhan on 9/18/2017.
 * Receives the data sent to server.
 */
@Controller
@RequestMapping(path = "/data")
public class DataController {

    @Autowired
    private GeonameRepository geonameRepository;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    //@PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody
    String addNewUser(@RequestParam long geonameid, @RequestParam String name,
                      @RequestParam long longitude, @RequestParam long latitude) {

        Geoname geoname = new Geoname();
        geoname.setGeonameId(geonameid);
        geoname.setName(name);
        geonameRepository.save(geoname);
        return "Saved";
    }
}
