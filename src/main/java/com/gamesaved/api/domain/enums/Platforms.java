package com.gamesaved.api.domain.enums;

import lombok.Getter;

@Getter
public enum Platforms {
    PC(1, "Windows"),
    PS5(2, "PlayStation 5"),
    PS4(3, "PlayStation 4"),
    PS3(4, "PlayStation 3"),
    PS2(5, "PlayStation 2"),
    PSX(6, "PlayStation"),
    PSV(7, "PS Vita"),
    PSP(8, "Playstation Portable"),
    XB(9, "Xbox"),
    XB360(10, "Xbox 360"),
    XBO(11, "Xbox One"),
    XBS(12, "Xbox Series S/X"),
    NS(13, "Nintendo Switch"),
    NWIIU(14, "Nintendo WiiU"),
    NWII(15, "Nintendo Wii"),
    NGC(16, "Nintendo GameCube"),
    N64(17, "Nintendo 64"),
    SNES(18, "Super Nintendo"),
    NES(19, "Famicom"),
    N3DS(20, "Nintendo 3DS"),
    NDSI(21, "Nintendo DSi"),
    NDS(22, "Nintendo DS"),
    GBA(23, "Game Boy Advanced"),
    GBC(24, "Game Boy Color"),
    GB(25, "Game Boy"),
    DC(26, "DreamCast"),
    MD(27, "Mega Drive"),
    GA(28, "Android"),
    IOS(29, "iOS"),
    LIX(30, "Linux"),
    MOS(31, "MacOS");

    private int cod;
    private String name;

    private Platforms(int cod, String name) {
        this.cod = cod;
        this.name = name;
    }

    public static Platforms toEnum(Integer cod) {
        if (cod == null) return null;

        for (Platforms x : Platforms.values()) {
            if (cod.equals(x.getCod())) return x;
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
