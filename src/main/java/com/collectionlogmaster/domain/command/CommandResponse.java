package com.collectionlogmaster.domain.command;

import java.util.ArrayList;
import lombok.Data;

@Data
public class CommandResponse {
    private ArrayList<String> task;
    private String tier;
    private int progressPercentage;
}
