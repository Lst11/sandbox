package com.aws.sandbox.controller;

import com.aws.sandbox.dto.GameDto;
import com.aws.sandbox.exception.ResourceNotFoundException;
import com.aws.sandbox.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * GameController.
 *
 * @author alena.stanisheuskaya
 */

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping(value = "/games")
public class GameController {

    private final GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable("id") Long id) {
        return gameService.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @GetMapping
    public List<GameDto> findAll() {
        return gameService.findAll();
    }
}
