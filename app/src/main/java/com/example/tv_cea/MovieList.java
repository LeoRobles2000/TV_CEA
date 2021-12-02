package com.example.tv_cea;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Querétaro",
            "Monterrey",
            "Sinaloa"
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "Presa de Jalpan",
                "Presa Zimapan",
                "Presa Rodrigo Gómez",
                "Presa Rompepicos",
                "Presa Sanalona",
                "Presa el Salto"
        };

        String description[] = {
                "La presa Jalpan embalsa las aguas del río Escanela, que nace en la parte alta de la sierra de Pinal de Amoles. Sus márgenes se encuentran cubiertas en parte por selvas bajas y algunas áreas dedicadas al cultivo de cítricos, albergando una variedad de especies de fauna silvestre, en particular aves acuáticas migratorias que llegan en invierno.",
                "La Presa Zimapán más formalmente llamada como Fernando Hiriart Valderrama En el límite de los estados de Hidalgo y Querétaro se impone uno de los cañones más caprichosos, de nuestra orografía, El Infiernillo, sus impresionantes paredes rocosas alcanzan una altura de más de 400 mts. y su irregular y estrecha boquilla, apenas permiten el paso obstinado del Río Moctezuma.",
                "Construida en la Cuenca del Río San Juan, durante los años de 1961 y 1963, por el bancario Rodrigo Gómez, tenía como principal objetivo el abastecimiento de agua para la zona metropolitana de Monterrey.",
                "En las montañas del municipio de Santa Catarina se construyó hace varios años una obra que ha trascendido hasta nuestros días, la cual no estuvo fuera de la polémica, se trata de la Presa Rompepicos.",
                "Fue construida entre 1940 y 1948 y su capacidad es de más de un millón de metros cúbicos de agua, surtida por los cauces de los ríos Tamazula y Sianori, que descienden de la Sierra Madre Occidental.",
                "La presa El Salto ubicada en Valle de Guadalupe en Los Altos de Jalisco es un modelo de un proyecto que concilia la pesca comercial con la pesca deportiva. Además de que ha sido todo un detonante de la actividad turística para quienes gustan del contacto directo con la naturaleza."
        };
        String studio[] = {
                "Jalpan de Serra", "Cadereyta de Montes", "Santiago", "Santa Catarina", "Culiacán", "Elota"
        };
        String videoUrl[] = {
                "https://storage.googleapis.com/app_cea/jalpan.mp4",
                "https://storage.googleapis.com/app_cea/zimapan.mp4",
                "https://storage.googleapis.com/app_cea/rodrigo.mp4",
                "https://storage.googleapis.com/app_cea/rompepicos.mp4",
                "https://storage.googleapis.com/app_cea/sanalona.mp4",
                "https://storage.googleapis.com/app_cea/salto.mp4"
        };
        String bgImageUrl =
                "https://img.freepik.com/vector-gratis/vector-azul-ola-agua-limpia-fondo-burbujas-aire_107791-1938.jpg?size=626&ext=jpg";

        String cardImageUrl[] = {
                "https://sierragordaecotours.com/wp-content/uploads/2017/08/presa-jalpan-sierra-gorda.jpg",
                "https://upload.wikimedia.org/wikipedia/commons/e/e4/Fernando_Hiriart_Balderrama_Dam%2C_Zimap%C3%A1n%2C_Hidalgo%2C_M%C3%A9xico._%281%29.jpg",
                "https://vidaenvilla.files.wordpress.com/2011/11/2.jpg",
                "https://www.debate.com.mx/__export/1504797193618/sites/debate/img/2017/09/07/cortinaspc.png_1902800913.png",
                "https://i.pinimg.com/originals/11/07/38/11073844078014ba60c8f6fd10374f46.jpg",
                "https://www.turimexico.com/wp-content/uploads/2015/06/plopez.jpg"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description[index],
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}