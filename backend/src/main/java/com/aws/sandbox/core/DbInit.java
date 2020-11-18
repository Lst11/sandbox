package com.aws.sandbox.core;

import com.aws.sandbox.entity.Game;
import com.aws.sandbox.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * DbInit.
 *
 * @author alena.stanisheuskaya
 */

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Component
public class DbInit {

    private final GameRepository gameRepository;

    @PostConstruct
    private void postConstruct() {
        List<Game> initGames = new ArrayList<>();

        Game game1 = Game.builder()
                .title("The Witcher 3: Wild Hunt")
                .description("The Witcher 3: Wild Hunt is a story-driven, next-generation open world " +
                        "role-playing game set in a visually stunning fantasy universe full " +
                        "of meaningful choices and impactful consequences. In The Witcher you " +
                        "play as the professional monster hunter, Geralt of Rivia, tasked with " +
                        "finding a child of prophecy in a vast open world rich with merchant " +
                        "cities, viking pirate islands, dangerous mountain passes, and forgotten caverns to explore.")
                .price(21.15)
                .build();
        initGames.add(game1);


        Game game2 = Game.builder()
                .title("Horizon Zero Dawn")
                .description("Horizon Zero Dawn is an exhilarating new action role playing game " +
                        "exclusively for the PlayStation 4 system, developed by the award winning Guerrilla Games, " +
                        "creators of PlayStation’s venerated Killzone franchise. \n" +
                        "As Horizon Zero Dawn’s main protagonist Aloy, " +
                        "a skilled hunter, explore a vibrant and lush world inhabited " +
                        "by mysterious mechanized creatures. Embark on a compelling, emotional " +
                        "journey and unravel mysteries of tribal societies, ancient artifacts and " +
                        "advanced technologies that will determine the fate of this planet, and of life itself.")
                .price(19.64)
                .build();
        initGames.add(game2);

        Game game3 = Game.builder()
                .title("The Last of Us Part II")
                .description("Five years later…\n" +
                        "An intense, harrowing and emotional adventure awaits – Ellie and Joel return for an epic journey " +
                        "in the sequel to the critically acclaimed game by Naughty Dog.\n" +
                        "In the Last of Us Part II, Ellie is now 19 and living in Jackson. With the level of peace, " +
                        "Jackson offers she’s had a chance to be a teenager and forge " +
                        "lasting relationships. When that peace is shattered, Ellie is thrust into a brutal " +
                        "journey fuelled by a need to bring those that have wronged her to justice.")
                .price(22.12)
                .build();
        initGames.add(game3);

        Game game4 = Game.builder()
                .title("God of War")
                .description("Winner of 5 Bafta Awards, including Best Narrative and Best Game.\n" +
                        "\n" +
                        "Kratos; a son of a god living as a man, outside the shadow of the gods, " +
                        "he seeks solitude in the unfamiliar lands of Norse mythology. With new purpose and his son at his side, " +
                        "Kratos must fight for survival as powerful forces threaten to disrupt the new life he has created.")
                .price(25.58)
                .build();
        initGames.add(game4);

        Game game5 = Game.builder()
                .title("Marvel's Spider-Man: Miles Morales")
                .description("Be Greater. Be Yourself.\n" +
                        "Experience the rise of Miles Morales as the new hero masters incredible, explosive new " +
                        "powers to become his own Spider-Man.\n" +
                        "The Rise of Miles Morales\n" +
                        "Miles Morales discovers explosive powers that set him apart from his mentor, Peter Parker. " +
                        "Master his unique, bio-electric venom blast attacks and covert camouflage power " +
                        "alongside spectacular web-slinging acrobatics, gadgets and skills.")
                .price(23.79)
                .build();
        initGames.add(game5);

        Game game6 = Game.builder()
                .title("Death Stranding")
                .description("From legendary game creator Hideo Kojima comes an all-new, genre-defying experience " +
                        "for PlayStation4. Sam Bridges must brave a world utterly transformed by the Death Stranding." +
                        " Carrying the disconnected remnants of our future in his hands, he embarks on a journey to " +
                        "reconnect the shattered world one step at a time. With spectral creatures plaguing the landscape," +
                        " and humanity on the verge of a mass extinction, it’s up to Sam to journey across the ravaged continent" +
                        " and save mankind from impending annihilation.\n" +
                        "What is the mystery of the Death Stranding? " +
                        "What will Sam discover on the road ahead? An unprecedented gameplay experience holds these answers and more." +
                        " Starring Norman Reedus, Mads Mikkelsen, Léa Seydoux and Lindsay Wagner.")
                .price(33.84)
                .build();
        initGames.add(game6);

        Game game7 = Game.builder()
                .title("Skyrim Special Edition")
                .description("Winner of more than 200 Game of the Year Awards, Skyrim Special Edition brings the epic fantasy to " +
                        "life in stunning detail. The Special Edition includes the critically acclaimed game and " +
                        "add-ons with all-new features like remastered art and effects, volumetric god rays, dynamic " +
                        "depth of field, screen-space reflections, and more.")
                .price(29.16)
                .build();
        initGames.add(game7);

        Game game8 = Game.builder()
                .title("Dragon Age 4")
                .description("Prepare for exciting news! Dragon Age 4 has been announced at The Game Awards 2018 and is " +
                        "available for pre-order at GAME. \n" +
                        "The Game Awards has been incredibly exciting and Dragon Age 4 is another video game that " +
                        "we can’t wait to see more of. \n" +
                        "Don’t miss out and pre-order Dragon Age 4 on PS4 today!")
                .price(15.98)
                .build();
        initGames.add(game8);

        Game game9 = Game.builder()
                .title("The Elder Scrolls Online: Tamriel Unlimited Crown Edition\n" +
                        "(PlayStation 4) ")
                .description("The Elder Scrolls Online: Tamriel Unlimited Crown Edition - Only at GAME - " +
                        "includes 1250 Crowns worth £8 - that's 750 more Crowns than the Standard Edition.\n" +
                        "The Elder Scrolls® Online: Tamriel Unlimited™ is the latest chapter of the " +
                        "award-winning franchise – and will bring the legendary experience online to consoles for the first time. " +
                        "Explore the far reaches of Skyrim, the mysterious lands of Morrowind, the sprawling metropolis of Daggerfall and beyond. " +
                        "The choices you make, from the alliance you join to the battles you fight, will shape your destiny and the world of Tamriel.")
                .price(3.52)
                .build();
        initGames.add(game9);

        gameRepository.saveAll(initGames);
    }
}
