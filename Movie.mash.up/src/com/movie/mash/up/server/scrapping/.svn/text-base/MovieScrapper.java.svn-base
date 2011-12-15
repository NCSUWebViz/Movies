package com.movie.mash.up.server.scrapping;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import com.google.gson.Gson;
import com.google.gwt.http.client.URL;
import com.movie.mash.up.client.Movie;
import com.movie.mash.up.client.util.MovieConstants;
import com.movie.mash.up.server.util.CommonUtils;

public class MovieScrapper {

	private Movie movie = null;
	private Map<String, Integer> imbd_positive;
	private Map<String, Integer> imdb_neutral;
	private Map<String, Integer> imdb_negative;

	private Map<String, Integer> rt_positive;
	private Map<String, Integer> rt_neutral;
	private Map<String, Integer> rt_negative;

	private Map<String, Integer> amazon_positive;
	private Map<String, Integer> amazon_neutral;
	private Map<String, Integer> amazon_negative;

	private Map<Integer, Integer> imbd_rating_map;
	private Map<Integer, Integer> rt_rating_map;
	private Map<Integer, Integer> amazon_rating_map;

	private Map<String, Integer> amazon_reviews;

	public MovieScrapper() {
		imbd_positive = new HashMap<String, Integer>();
		imdb_neutral = new HashMap<String, Integer>();
		imdb_negative = new HashMap<String, Integer>();

		rt_positive = new HashMap<String, Integer>();
		rt_neutral = new HashMap<String, Integer>();
		rt_negative = new HashMap<String, Integer>();

		amazon_positive = new HashMap<String, Integer>();
		amazon_neutral = new HashMap<String, Integer>();
		amazon_negative = new HashMap<String, Integer>();

		imbd_rating_map = new HashMap<Integer, Integer>();
		rt_rating_map = new HashMap<Integer, Integer>();
		amazon_rating_map = new HashMap<Integer, Integer>();
		initalize();
	}

	private void initalize() {
		// TODO Auto-generated method stub
		imbd_positive.put(MovieConstants.POSITIVE_AWESOME, 0);
		imbd_positive.put(MovieConstants.POSITIVE_FANTASTIC, 0);
		imbd_positive.put(MovieConstants.POSITIVE_GREAT, 0);

		imdb_neutral.put(MovieConstants.NEUTRAL_DECENT, 0);
		imdb_neutral.put(MovieConstants.NEUTRAL_GOOD, 0);
		imdb_neutral.put(MovieConstants.NEUTRAL_NOT_BADB, 0);

		imdb_negative.put(MovieConstants.NEGATIVE_STAY_AWAY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_SUCKS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_WORST, 0);

		rt_positive.put(MovieConstants.POSITIVE_AWESOME, 0);
		rt_positive.put(MovieConstants.POSITIVE_FANTASTIC, 0);
		rt_positive.put(MovieConstants.POSITIVE_GREAT, 0);

		rt_neutral.put(MovieConstants.NEUTRAL_DECENT, 0);
		rt_neutral.put(MovieConstants.NEUTRAL_GOOD, 0);
		rt_neutral.put(MovieConstants.NEUTRAL_NOT_BADB, 0);

		rt_negative.put(MovieConstants.NEGATIVE_STAY_AWAY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_SUCKS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_WORST, 0);

		amazon_positive.put(MovieConstants.POSITIVE_AWESOME, 0);
		amazon_positive.put(MovieConstants.POSITIVE_FANTASTIC, 0);
		amazon_positive.put(MovieConstants.POSITIVE_GREAT, 0);

		amazon_neutral.put(MovieConstants.NEUTRAL_DECENT, 0);
		amazon_neutral.put(MovieConstants.NEUTRAL_GOOD, 0);
		amazon_neutral.put(MovieConstants.NEUTRAL_NOT_BADB, 0);

		amazon_negative.put(MovieConstants.NEGATIVE_STAY_AWAY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_SUCKS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_WORST, 0);

		imbd_rating_map.put(1, 0);
		imbd_rating_map.put(2, 0);
		imbd_rating_map.put(3, 0);
		imbd_rating_map.put(4, 0);
		imbd_rating_map.put(5, 0);

		amazon_rating_map.put(1, 0);
		amazon_rating_map.put(2, 0);
		amazon_rating_map.put(3, 0);
		amazon_rating_map.put(4, 0);
		amazon_rating_map.put(5, 0);

		rt_rating_map.put(1, 0);
		rt_rating_map.put(2, 0);
		rt_rating_map.put(3, 0);
		rt_rating_map.put(4, 0);
		rt_rating_map.put(5, 0);

		/* IMDB positive words */
		imbd_positive.put(MovieConstants.POSITIVE_AWESOME, 0);
		imbd_positive.put(MovieConstants.POSITIVE_FANTASTIC, 0);
		imbd_positive.put(MovieConstants.POSITIVE_GREAT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_HAPPY, 0);
		imbd_positive.put(MovieConstants.POSITIVE_GRATEFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_DETERMINED, 0);
		imbd_positive.put(MovieConstants.POSITIVE_PROFESSIONAL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SWELL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_AUTHENTIC, 0);
		imbd_positive.put(MovieConstants.POSITIVE_CONTENT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_FOCUSED, 0);
		imbd_positive.put(MovieConstants.POSITIVE_EXTRAORDINARY, 0);
		imbd_positive.put(MovieConstants.POSITIVE_DELIGHTFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_IMAGINATIVE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SUCCESSFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_HEROIC, 0);
		imbd_positive.put(MovieConstants.POSITIVE_CHEERFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_UNIQUE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_TOUGH, 0);
		imbd_positive.put(MovieConstants.POSITIVE_GLAD, 0);
		imbd_positive.put(MovieConstants.POSITIVE_DESIRABLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_VALIANT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_WORTHY, 0);
		imbd_positive.put(MovieConstants.POSITIVE_COLORFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_JOYFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_LAUDABLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_CUTE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_DEPENDABLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_REMARKABLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_CONFIDENT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_FUNNY, 0);
		imbd_positive.put(MovieConstants.POSITIVE_MAGNETIC, 0);
		imbd_positive.put(MovieConstants.POSITIVE_ECSTATIC, 0);
		imbd_positive.put(MovieConstants.POSITIVE_LOVELY, 0);
		imbd_positive.put(MovieConstants.POSITIVE_ENTERTAINING, 0);
		imbd_positive.put(MovieConstants.POSITIVE_DECENT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_HELPFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_CONVINCING, 0);
		imbd_positive.put(MovieConstants.POSITIVE_BEAUTIFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_COMMENDABLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SENSUAL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SUBLIME, 0);
		imbd_positive.put(MovieConstants.POSITIVE_ENGAGING, 0);
		imbd_positive.put(MovieConstants.POSITIVE_HUMOROUS, 0);
		imbd_positive.put(MovieConstants.POSITIVE_WARM, 0);
		imbd_positive.put(MovieConstants.POSITIVE_PLEASANT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_ORIGINAL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SUPERB, 0);
		imbd_positive.put(MovieConstants.POSITIVE_INTELLIGENT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_PLAYFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_IMPRESSIVE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_ELATED, 0);
		imbd_positive.put(MovieConstants.POSITIVE_CREDIBLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_WONDERFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_BRIGHT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_FANTASTIC, 0);
		imbd_positive.put(MovieConstants.POSITIVE_RICH, 0);
		imbd_positive.put(MovieConstants.POSITIVE_BOLD, 0);
		imbd_positive.put(MovieConstants.POSITIVE_FUN, 0);
		imbd_positive.put(MovieConstants.POSITIVE_NICE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_CREATIVE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SATISFIED, 0);
		imbd_positive.put(MovieConstants.POSITIVE_PRECIOUS, 0);
		imbd_positive.put(MovieConstants.POSITIVE_GREGARIOUS, 0);
		imbd_positive.put(MovieConstants.POSITIVE_INNOCENT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_PERFECT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_INDUSTRIOUS, 0);
		imbd_positive.put(MovieConstants.POSITIVE_PRACTICAL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_STABLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_LOYAL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_CASUAL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_COMFORTABLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SENSIBLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_RELAXED, 0);
		imbd_positive.put(MovieConstants.POSITIVE_MERRY, 0);
		imbd_positive.put(MovieConstants.POSITIVE_BRILLIANT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_FASCINATING, 0);
		imbd_positive.put(MovieConstants.POSITIVE_APPRECIATIVE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SOULFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_CORDIAL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SPARKLING, 0);
		imbd_positive.put(MovieConstants.POSITIVE_GLEEFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_RADIANT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_RESOLUTE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_BLISSFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_GENUINE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_ARTISTIC, 0);
		imbd_positive.put(MovieConstants.POSITIVE_ADMIRABLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_REAL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_POLISHED, 0);
		imbd_positive.put(MovieConstants.POSITIVE_DESERVING, 0);
		imbd_positive.put(MovieConstants.POSITIVE_DARING, 0);
		imbd_positive.put(MovieConstants.POSITIVE_FREE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_GREAT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_ELEGANT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_CHIC, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SLEEK, 0);
		imbd_positive.put(MovieConstants.POSITIVE_EXCELLENT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_AFFABLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_HOPEFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_STYLISH, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SUBTLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_PEACEFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_BRAINY, 0);
		imbd_positive.put(MovieConstants.POSITIVE_DECISIVE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_CALM, 0);
		imbd_positive.put(MovieConstants.POSITIVE_AMAZING, 0);
		imbd_positive.put(MovieConstants.POSITIVE_WISE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_FABULOUS, 0);
		imbd_positive.put(MovieConstants.POSITIVE_POWERFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SPECIAL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_STRONG, 0);
		imbd_positive.put(MovieConstants.POSITIVE_CAPTIVATING, 0);
		imbd_positive.put(MovieConstants.POSITIVE_PASSIONATE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_ENTHUSIASTIC, 0);
		imbd_positive.put(MovieConstants.POSITIVE_BALANCED, 0);
		imbd_positive.put(MovieConstants.POSITIVE_THRIFTY, 0);
		imbd_positive.put(MovieConstants.POSITIVE_AMIABLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_VERSATILE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_HEAVENLY, 0);
		imbd_positive.put(MovieConstants.POSITIVE_LIVELY, 0);
		imbd_positive.put(MovieConstants.POSITIVE_ATTRACTIVE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_POETIC, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SENTIMENTAL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_ADORABLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_LIKEABLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_ROMANTIC, 0);
		imbd_positive.put(MovieConstants.POSITIVE_REFINED, 0);
		imbd_positive.put(MovieConstants.POSITIVE_POSITIVE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_RESPECTFUL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_HILARIOUS, 0);
		imbd_positive.put(MovieConstants.POSITIVE_PRICELESS, 0);
		imbd_positive.put(MovieConstants.POSITIVE_REASONABLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_FASHIONABLE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_FORTHRIGHT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_COMELY, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SPIRITUAL, 0);
		imbd_positive.put(MovieConstants.POSITIVE_LIGHT, 0);
		imbd_positive.put(MovieConstants.POSITIVE_MATURE, 0);
		imbd_positive.put(MovieConstants.POSITIVE_CANDID, 0);
		imbd_positive.put(MovieConstants.POSITIVE_ENERGETIC, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SOPHISTICATED, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SPLENDID, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SUNNY, 0);
		imbd_positive.put(MovieConstants.POSITIVE_ROSY, 0);
		imbd_positive.put(MovieConstants.POSITIVE_MODERN, 0);
		imbd_positive.put(MovieConstants.POSITIVE_AWESOME, 0);
		imbd_positive.put(MovieConstants.POSITIVE_SWEET, 0);
		imbd_positive.put(MovieConstants.POSITIVE_TERRIFIC, 0);
		imbd_positive.put(MovieConstants.POSITIVE_FANTASTIC, 0);
		/* IMDB neutral words */
		imdb_neutral.put(MovieConstants.NEUTRAL_DECENT, 0);
		imdb_neutral.put(MovieConstants.NEUTRAL_GOOD, 0);
		imdb_neutral.put(MovieConstants.NEUTRAL_NOT_BADB, 0);
		/* IMDB negative words */
		imdb_negative.put(MovieConstants.NEGATIVE_STAY_AWAY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_SUCKS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_WORST, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_WORST, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_SUCKS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_STAY_AWAY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_EVIL, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_EMBARASSED, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_DRACONIAN, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_DISTURBING, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_DEPRESSED, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_DISAGREEABLE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_DEFECTIVE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_DEFEATED, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_DECEITFUL, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_DANGEROUS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_CRUEL, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_CREEPY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_CYNICAL, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_CRAZY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_COWARDLY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_CONFUSED, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_CLUMSY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_CARELESS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_CALLOUS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_BORING, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_ANGRY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_ANNOYED, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_ARROGANT, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_ASHAMED, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_AWFUL, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_BAD, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_AMBIGUOUS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_BEWILDERED, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_AFRAID, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_ALOOF, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_ABUSIVE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_ABRUPT, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_FANATICAL, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_PANICKY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_OBNOXIOUS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_MALICIOUS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_MATERIALISTIC, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_PATHETIC, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_LACKING, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_JITTERY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_MEAN, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_OUTRAGEOUS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_HORRIBLE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_HESITANT, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_HELPLESS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_FRIGHTENED, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_FRETFUL, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_FRANTIC, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_FORGETFUL, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_FOOLISH, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_FLIPPANT, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_FLASHY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_FILTHY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_FIERCE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_NOISY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_LONELY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_NAIVE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_NASTY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_NERVOUS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_LAZY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_REPULSIVE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_GRUMPY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_QUARRELSOME, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_IGNORANT, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_FURTIVE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_GULLIBLE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_HURT, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_POSSESSIVE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_ILL, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_IRRESOLUTE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_JEALOUS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_RUTHLESS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_SAD, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_SCARY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_SECRETIVE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_SELFISH, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_SILLY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_SLOW, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_SNEAKY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_SNOBBISH, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_STRANGE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_SULKY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_TERRIBLE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_THREATENING, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_TIGHT, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_TIMID, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_TIRESOME, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_TROUBLED, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_UPSET, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_UNSURE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_UNSUITABLE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_VAGUE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_UNDESIRABLE, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_VENGEFUL, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_VULGAR, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_WARY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_WEAK, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_WASTEFUL, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_WEARY, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_WICKED, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_WORRIED, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_WORTHLESS, 0);
		imdb_negative.put(MovieConstants.NEGATIVE_WRETCHED, 0);
		/* RT positive words */
		rt_positive.put(MovieConstants.POSITIVE_AWESOME, 0);
		rt_positive.put(MovieConstants.POSITIVE_FANTASTIC, 0);
		rt_positive.put(MovieConstants.POSITIVE_GREAT, 0);
		rt_positive.put(MovieConstants.POSITIVE_HAPPY, 0);
		rt_positive.put(MovieConstants.POSITIVE_GRATEFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_DETERMINED, 0);
		rt_positive.put(MovieConstants.POSITIVE_PROFESSIONAL, 0);
		rt_positive.put(MovieConstants.POSITIVE_SWELL, 0);
		rt_positive.put(MovieConstants.POSITIVE_AUTHENTIC, 0);
		rt_positive.put(MovieConstants.POSITIVE_CONTENT, 0);
		rt_positive.put(MovieConstants.POSITIVE_FOCUSED, 0);
		rt_positive.put(MovieConstants.POSITIVE_EXTRAORDINARY, 0);
		rt_positive.put(MovieConstants.POSITIVE_DELIGHTFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_IMAGINATIVE, 0);
		rt_positive.put(MovieConstants.POSITIVE_SUCCESSFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_HEROIC, 0);
		rt_positive.put(MovieConstants.POSITIVE_CHEERFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_UNIQUE, 0);
		rt_positive.put(MovieConstants.POSITIVE_TOUGH, 0);
		rt_positive.put(MovieConstants.POSITIVE_GLAD, 0);
		rt_positive.put(MovieConstants.POSITIVE_DESIRABLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_VALIANT, 0);
		rt_positive.put(MovieConstants.POSITIVE_WORTHY, 0);
		rt_positive.put(MovieConstants.POSITIVE_COLORFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_JOYFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_LAUDABLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_CUTE, 0);
		rt_positive.put(MovieConstants.POSITIVE_DEPENDABLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_REMARKABLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_CONFIDENT, 0);
		rt_positive.put(MovieConstants.POSITIVE_FUNNY, 0);
		rt_positive.put(MovieConstants.POSITIVE_MAGNETIC, 0);
		rt_positive.put(MovieConstants.POSITIVE_ECSTATIC, 0);
		rt_positive.put(MovieConstants.POSITIVE_LOVELY, 0);
		rt_positive.put(MovieConstants.POSITIVE_ENTERTAINING, 0);
		rt_positive.put(MovieConstants.POSITIVE_DECENT, 0);
		rt_positive.put(MovieConstants.POSITIVE_HELPFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_CONVINCING, 0);
		rt_positive.put(MovieConstants.POSITIVE_BEAUTIFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_COMMENDABLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_SENSUAL, 0);
		rt_positive.put(MovieConstants.POSITIVE_SUBLIME, 0);
		rt_positive.put(MovieConstants.POSITIVE_ENGAGING, 0);
		rt_positive.put(MovieConstants.POSITIVE_HUMOROUS, 0);
		rt_positive.put(MovieConstants.POSITIVE_WARM, 0);
		rt_positive.put(MovieConstants.POSITIVE_PLEASANT, 0);
		rt_positive.put(MovieConstants.POSITIVE_ORIGINAL, 0);
		rt_positive.put(MovieConstants.POSITIVE_SUPERB, 0);
		rt_positive.put(MovieConstants.POSITIVE_INTELLIGENT, 0);
		rt_positive.put(MovieConstants.POSITIVE_PLAYFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_IMPRESSIVE, 0);
		rt_positive.put(MovieConstants.POSITIVE_ELATED, 0);
		rt_positive.put(MovieConstants.POSITIVE_CREDIBLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_WONDERFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_BRIGHT, 0);
		rt_positive.put(MovieConstants.POSITIVE_FANTASTIC, 0);
		rt_positive.put(MovieConstants.POSITIVE_RICH, 0);
		rt_positive.put(MovieConstants.POSITIVE_BOLD, 0);
		rt_positive.put(MovieConstants.POSITIVE_FUN, 0);
		rt_positive.put(MovieConstants.POSITIVE_NICE, 0);
		rt_positive.put(MovieConstants.POSITIVE_CREATIVE, 0);
		rt_positive.put(MovieConstants.POSITIVE_SATISFIED, 0);
		rt_positive.put(MovieConstants.POSITIVE_PRECIOUS, 0);
		rt_positive.put(MovieConstants.POSITIVE_GREGARIOUS, 0);
		rt_positive.put(MovieConstants.POSITIVE_INNOCENT, 0);
		rt_positive.put(MovieConstants.POSITIVE_PERFECT, 0);
		rt_positive.put(MovieConstants.POSITIVE_INDUSTRIOUS, 0);
		rt_positive.put(MovieConstants.POSITIVE_PRACTICAL, 0);
		rt_positive.put(MovieConstants.POSITIVE_STABLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_LOYAL, 0);
		rt_positive.put(MovieConstants.POSITIVE_CASUAL, 0);
		rt_positive.put(MovieConstants.POSITIVE_COMFORTABLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_SENSIBLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_RELAXED, 0);
		rt_positive.put(MovieConstants.POSITIVE_MERRY, 0);
		rt_positive.put(MovieConstants.POSITIVE_BRILLIANT, 0);
		rt_positive.put(MovieConstants.POSITIVE_FASCINATING, 0);
		rt_positive.put(MovieConstants.POSITIVE_APPRECIATIVE, 0);
		rt_positive.put(MovieConstants.POSITIVE_SOULFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_CORDIAL, 0);
		rt_positive.put(MovieConstants.POSITIVE_SPARKLING, 0);
		rt_positive.put(MovieConstants.POSITIVE_GLEEFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_RADIANT, 0);
		rt_positive.put(MovieConstants.POSITIVE_RESOLUTE, 0);
		rt_positive.put(MovieConstants.POSITIVE_BLISSFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_GENUINE, 0);
		rt_positive.put(MovieConstants.POSITIVE_ARTISTIC, 0);
		rt_positive.put(MovieConstants.POSITIVE_ADMIRABLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_REAL, 0);
		rt_positive.put(MovieConstants.POSITIVE_POLISHED, 0);
		rt_positive.put(MovieConstants.POSITIVE_DESERVING, 0);
		rt_positive.put(MovieConstants.POSITIVE_DARING, 0);
		rt_positive.put(MovieConstants.POSITIVE_FREE, 0);
		rt_positive.put(MovieConstants.POSITIVE_GREAT, 0);
		rt_positive.put(MovieConstants.POSITIVE_ELEGANT, 0);
		rt_positive.put(MovieConstants.POSITIVE_CHIC, 0);
		rt_positive.put(MovieConstants.POSITIVE_SLEEK, 0);
		rt_positive.put(MovieConstants.POSITIVE_EXCELLENT, 0);
		rt_positive.put(MovieConstants.POSITIVE_AFFABLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_HOPEFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_STYLISH, 0);
		rt_positive.put(MovieConstants.POSITIVE_SUBTLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_PEACEFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_BRAINY, 0);
		rt_positive.put(MovieConstants.POSITIVE_DECISIVE, 0);
		rt_positive.put(MovieConstants.POSITIVE_CALM, 0);
		rt_positive.put(MovieConstants.POSITIVE_AMAZING, 0);
		rt_positive.put(MovieConstants.POSITIVE_WISE, 0);
		rt_positive.put(MovieConstants.POSITIVE_FABULOUS, 0);
		rt_positive.put(MovieConstants.POSITIVE_POWERFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_SPECIAL, 0);
		rt_positive.put(MovieConstants.POSITIVE_STRONG, 0);
		rt_positive.put(MovieConstants.POSITIVE_CAPTIVATING, 0);
		rt_positive.put(MovieConstants.POSITIVE_PASSIONATE, 0);
		rt_positive.put(MovieConstants.POSITIVE_ENTHUSIASTIC, 0);
		rt_positive.put(MovieConstants.POSITIVE_BALANCED, 0);
		rt_positive.put(MovieConstants.POSITIVE_THRIFTY, 0);
		rt_positive.put(MovieConstants.POSITIVE_AMIABLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_VERSATILE, 0);
		rt_positive.put(MovieConstants.POSITIVE_HEAVENLY, 0);
		rt_positive.put(MovieConstants.POSITIVE_LIVELY, 0);
		rt_positive.put(MovieConstants.POSITIVE_ATTRACTIVE, 0);
		rt_positive.put(MovieConstants.POSITIVE_POETIC, 0);
		rt_positive.put(MovieConstants.POSITIVE_SENTIMENTAL, 0);
		rt_positive.put(MovieConstants.POSITIVE_ADORABLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_LIKEABLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_ROMANTIC, 0);
		rt_positive.put(MovieConstants.POSITIVE_REFINED, 0);
		rt_positive.put(MovieConstants.POSITIVE_POSITIVE, 0);
		rt_positive.put(MovieConstants.POSITIVE_RESPECTFUL, 0);
		rt_positive.put(MovieConstants.POSITIVE_HILARIOUS, 0);
		rt_positive.put(MovieConstants.POSITIVE_PRICELESS, 0);
		rt_positive.put(MovieConstants.POSITIVE_REASONABLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_FASHIONABLE, 0);
		rt_positive.put(MovieConstants.POSITIVE_FORTHRIGHT, 0);
		rt_positive.put(MovieConstants.POSITIVE_COMELY, 0);
		rt_positive.put(MovieConstants.POSITIVE_SPIRITUAL, 0);
		rt_positive.put(MovieConstants.POSITIVE_LIGHT, 0);
		rt_positive.put(MovieConstants.POSITIVE_MATURE, 0);
		rt_positive.put(MovieConstants.POSITIVE_CANDID, 0);
		rt_positive.put(MovieConstants.POSITIVE_ENERGETIC, 0);
		rt_positive.put(MovieConstants.POSITIVE_SOPHISTICATED, 0);
		rt_positive.put(MovieConstants.POSITIVE_SPLENDID, 0);
		rt_positive.put(MovieConstants.POSITIVE_SUNNY, 0);
		rt_positive.put(MovieConstants.POSITIVE_ROSY, 0);
		rt_positive.put(MovieConstants.POSITIVE_MODERN, 0);
		rt_positive.put(MovieConstants.POSITIVE_AWESOME, 0);
		rt_positive.put(MovieConstants.POSITIVE_SWEET, 0);
		rt_positive.put(MovieConstants.POSITIVE_TERRIFIC, 0);

		rt_neutral.put(MovieConstants.NEUTRAL_DECENT, 0);
		rt_neutral.put(MovieConstants.NEUTRAL_GOOD, 0);
		rt_neutral.put(MovieConstants.NEUTRAL_NOT_BADB, 0);

		/* RT negative words */
		rt_negative.put(MovieConstants.NEGATIVE_STAY_AWAY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_SUCKS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_WORST, 0);
		rt_negative.put(MovieConstants.NEGATIVE_WORST, 0);
		rt_negative.put(MovieConstants.NEGATIVE_SUCKS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_STAY_AWAY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_EVIL, 0);
		rt_negative.put(MovieConstants.NEGATIVE_EMBARASSED, 0);
		rt_negative.put(MovieConstants.NEGATIVE_DRACONIAN, 0);
		rt_negative.put(MovieConstants.NEGATIVE_DISTURBING, 0);
		rt_negative.put(MovieConstants.NEGATIVE_DEPRESSED, 0);
		rt_negative.put(MovieConstants.NEGATIVE_DISAGREEABLE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_DEFECTIVE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_DEFEATED, 0);
		rt_negative.put(MovieConstants.NEGATIVE_DECEITFUL, 0);
		rt_negative.put(MovieConstants.NEGATIVE_DANGEROUS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_CRUEL, 0);
		rt_negative.put(MovieConstants.NEGATIVE_CREEPY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_CYNICAL, 0);
		rt_negative.put(MovieConstants.NEGATIVE_CRAZY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_COWARDLY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_CONFUSED, 0);
		rt_negative.put(MovieConstants.NEGATIVE_CLUMSY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_CARELESS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_CALLOUS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_BORING, 0);
		rt_negative.put(MovieConstants.NEGATIVE_ANGRY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_ANNOYED, 0);
		rt_negative.put(MovieConstants.NEGATIVE_ARROGANT, 0);
		rt_negative.put(MovieConstants.NEGATIVE_ASHAMED, 0);
		rt_negative.put(MovieConstants.NEGATIVE_AWFUL, 0);
		rt_negative.put(MovieConstants.NEGATIVE_BAD, 0);
		rt_negative.put(MovieConstants.NEGATIVE_AMBIGUOUS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_BEWILDERED, 0);
		rt_negative.put(MovieConstants.NEGATIVE_AFRAID, 0);
		rt_negative.put(MovieConstants.NEGATIVE_ALOOF, 0);
		rt_negative.put(MovieConstants.NEGATIVE_ABUSIVE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_ABRUPT, 0);
		rt_negative.put(MovieConstants.NEGATIVE_FANATICAL, 0);
		rt_negative.put(MovieConstants.NEGATIVE_PANICKY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_OBNOXIOUS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_MALICIOUS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_MATERIALISTIC, 0);
		rt_negative.put(MovieConstants.NEGATIVE_PATHETIC, 0);
		rt_negative.put(MovieConstants.NEGATIVE_LACKING, 0);
		rt_negative.put(MovieConstants.NEGATIVE_JITTERY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_MEAN, 0);
		rt_negative.put(MovieConstants.NEGATIVE_OUTRAGEOUS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_HORRIBLE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_HESITANT, 0);
		rt_negative.put(MovieConstants.NEGATIVE_HELPLESS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_FRIGHTENED, 0);
		rt_negative.put(MovieConstants.NEGATIVE_FRETFUL, 0);
		rt_negative.put(MovieConstants.NEGATIVE_FRANTIC, 0);
		rt_negative.put(MovieConstants.NEGATIVE_FORGETFUL, 0);
		rt_negative.put(MovieConstants.NEGATIVE_FOOLISH, 0);
		rt_negative.put(MovieConstants.NEGATIVE_FLIPPANT, 0);
		rt_negative.put(MovieConstants.NEGATIVE_FLASHY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_FILTHY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_FIERCE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_NOISY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_LONELY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_NAIVE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_NASTY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_NERVOUS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_LAZY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_REPULSIVE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_GRUMPY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_QUARRELSOME, 0);
		rt_negative.put(MovieConstants.NEGATIVE_IGNORANT, 0);
		rt_negative.put(MovieConstants.NEGATIVE_FURTIVE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_GULLIBLE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_HURT, 0);
		rt_negative.put(MovieConstants.NEGATIVE_POSSESSIVE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_ILL, 0);
		rt_negative.put(MovieConstants.NEGATIVE_IRRESOLUTE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_JEALOUS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_RUTHLESS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_SAD, 0);
		rt_negative.put(MovieConstants.NEGATIVE_SCARY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_SECRETIVE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_SELFISH, 0);
		rt_negative.put(MovieConstants.NEGATIVE_SILLY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_SLOW, 0);
		rt_negative.put(MovieConstants.NEGATIVE_SNEAKY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_SNOBBISH, 0);
		rt_negative.put(MovieConstants.NEGATIVE_STRANGE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_SULKY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_TERRIBLE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_THREATENING, 0);
		rt_negative.put(MovieConstants.NEGATIVE_TIGHT, 0);
		rt_negative.put(MovieConstants.NEGATIVE_TIMID, 0);
		rt_negative.put(MovieConstants.NEGATIVE_TIRESOME, 0);
		rt_negative.put(MovieConstants.NEGATIVE_TROUBLED, 0);
		rt_negative.put(MovieConstants.NEGATIVE_UPSET, 0);
		rt_negative.put(MovieConstants.NEGATIVE_UNSURE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_UNSUITABLE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_VAGUE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_UNDESIRABLE, 0);
		rt_negative.put(MovieConstants.NEGATIVE_VENGEFUL, 0);
		rt_negative.put(MovieConstants.NEGATIVE_VULGAR, 0);
		rt_negative.put(MovieConstants.NEGATIVE_WARY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_WEAK, 0);
		rt_negative.put(MovieConstants.NEGATIVE_WASTEFUL, 0);
		rt_negative.put(MovieConstants.NEGATIVE_WEARY, 0);
		rt_negative.put(MovieConstants.NEGATIVE_WICKED, 0);
		rt_negative.put(MovieConstants.NEGATIVE_WORRIED, 0);
		rt_negative.put(MovieConstants.NEGATIVE_WORTHLESS, 0);
		rt_negative.put(MovieConstants.NEGATIVE_WRETCHED, 0);
		/* Amazon positive words */
		amazon_positive.put(MovieConstants.POSITIVE_AWESOME, 0);
		amazon_positive.put(MovieConstants.POSITIVE_FANTASTIC, 0);
		amazon_positive.put(MovieConstants.POSITIVE_GREAT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_HAPPY, 0);
		amazon_positive.put(MovieConstants.POSITIVE_GRATEFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_DETERMINED, 0);
		amazon_positive.put(MovieConstants.POSITIVE_PROFESSIONAL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SWELL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_AUTHENTIC, 0);
		amazon_positive.put(MovieConstants.POSITIVE_CONTENT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_FOCUSED, 0);
		amazon_positive.put(MovieConstants.POSITIVE_EXTRAORDINARY, 0);
		amazon_positive.put(MovieConstants.POSITIVE_DELIGHTFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_IMAGINATIVE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SUCCESSFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_HEROIC, 0);
		amazon_positive.put(MovieConstants.POSITIVE_CHEERFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_UNIQUE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_TOUGH, 0);
		amazon_positive.put(MovieConstants.POSITIVE_GLAD, 0);
		amazon_positive.put(MovieConstants.POSITIVE_DESIRABLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_VALIANT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_WORTHY, 0);
		amazon_positive.put(MovieConstants.POSITIVE_COLORFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_JOYFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_LAUDABLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_CUTE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_DEPENDABLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_REMARKABLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_CONFIDENT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_FUNNY, 0);
		amazon_positive.put(MovieConstants.POSITIVE_MAGNETIC, 0);
		amazon_positive.put(MovieConstants.POSITIVE_ECSTATIC, 0);
		amazon_positive.put(MovieConstants.POSITIVE_LOVELY, 0);
		amazon_positive.put(MovieConstants.POSITIVE_ENTERTAINING, 0);
		amazon_positive.put(MovieConstants.POSITIVE_DECENT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_HELPFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_CONVINCING, 0);
		amazon_positive.put(MovieConstants.POSITIVE_BEAUTIFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_COMMENDABLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SENSUAL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SUBLIME, 0);
		amazon_positive.put(MovieConstants.POSITIVE_ENGAGING, 0);
		amazon_positive.put(MovieConstants.POSITIVE_HUMOROUS, 0);
		amazon_positive.put(MovieConstants.POSITIVE_WARM, 0);
		amazon_positive.put(MovieConstants.POSITIVE_PLEASANT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_ORIGINAL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SUPERB, 0);
		amazon_positive.put(MovieConstants.POSITIVE_INTELLIGENT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_PLAYFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_IMPRESSIVE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_ELATED, 0);
		amazon_positive.put(MovieConstants.POSITIVE_CREDIBLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_WONDERFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_BRIGHT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_FANTASTIC, 0);
		amazon_positive.put(MovieConstants.POSITIVE_RICH, 0);
		amazon_positive.put(MovieConstants.POSITIVE_BOLD, 0);
		amazon_positive.put(MovieConstants.POSITIVE_FUN, 0);
		amazon_positive.put(MovieConstants.POSITIVE_NICE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_CREATIVE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SATISFIED, 0);
		amazon_positive.put(MovieConstants.POSITIVE_PRECIOUS, 0);
		amazon_positive.put(MovieConstants.POSITIVE_GREGARIOUS, 0);
		amazon_positive.put(MovieConstants.POSITIVE_INNOCENT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_PERFECT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_INDUSTRIOUS, 0);
		amazon_positive.put(MovieConstants.POSITIVE_PRACTICAL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_STABLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_LOYAL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_CASUAL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_COMFORTABLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SENSIBLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_RELAXED, 0);
		amazon_positive.put(MovieConstants.POSITIVE_MERRY, 0);
		amazon_positive.put(MovieConstants.POSITIVE_BRILLIANT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_FASCINATING, 0);
		amazon_positive.put(MovieConstants.POSITIVE_APPRECIATIVE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SOULFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_CORDIAL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SPARKLING, 0);
		amazon_positive.put(MovieConstants.POSITIVE_GLEEFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_RADIANT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_RESOLUTE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_BLISSFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_GENUINE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_ARTISTIC, 0);
		amazon_positive.put(MovieConstants.POSITIVE_ADMIRABLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_REAL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_POLISHED, 0);
		amazon_positive.put(MovieConstants.POSITIVE_DESERVING, 0);
		amazon_positive.put(MovieConstants.POSITIVE_DARING, 0);
		amazon_positive.put(MovieConstants.POSITIVE_FREE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_GREAT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_ELEGANT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_CHIC, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SLEEK, 0);
		amazon_positive.put(MovieConstants.POSITIVE_EXCELLENT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_AFFABLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_HOPEFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_STYLISH, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SUBTLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_PEACEFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_BRAINY, 0);
		amazon_positive.put(MovieConstants.POSITIVE_DECISIVE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_CALM, 0);
		amazon_positive.put(MovieConstants.POSITIVE_AMAZING, 0);
		amazon_positive.put(MovieConstants.POSITIVE_WISE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_FABULOUS, 0);
		amazon_positive.put(MovieConstants.POSITIVE_POWERFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SPECIAL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_STRONG, 0);
		amazon_positive.put(MovieConstants.POSITIVE_CAPTIVATING, 0);
		amazon_positive.put(MovieConstants.POSITIVE_PASSIONATE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_ENTHUSIASTIC, 0);
		amazon_positive.put(MovieConstants.POSITIVE_BALANCED, 0);
		amazon_positive.put(MovieConstants.POSITIVE_THRIFTY, 0);
		amazon_positive.put(MovieConstants.POSITIVE_AMIABLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_VERSATILE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_HEAVENLY, 0);
		amazon_positive.put(MovieConstants.POSITIVE_LIVELY, 0);
		amazon_positive.put(MovieConstants.POSITIVE_ATTRACTIVE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_POETIC, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SENTIMENTAL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_ADORABLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_LIKEABLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_ROMANTIC, 0);
		amazon_positive.put(MovieConstants.POSITIVE_REFINED, 0);
		amazon_positive.put(MovieConstants.POSITIVE_POSITIVE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_RESPECTFUL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_HILARIOUS, 0);
		amazon_positive.put(MovieConstants.POSITIVE_PRICELESS, 0);
		amazon_positive.put(MovieConstants.POSITIVE_REASONABLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_FASHIONABLE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_FORTHRIGHT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_COMELY, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SPIRITUAL, 0);
		amazon_positive.put(MovieConstants.POSITIVE_LIGHT, 0);
		amazon_positive.put(MovieConstants.POSITIVE_MATURE, 0);
		amazon_positive.put(MovieConstants.POSITIVE_CANDID, 0);
		amazon_positive.put(MovieConstants.POSITIVE_ENERGETIC, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SOPHISTICATED, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SPLENDID, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SUNNY, 0);
		amazon_positive.put(MovieConstants.POSITIVE_ROSY, 0);
		amazon_positive.put(MovieConstants.POSITIVE_MODERN, 0);
		amazon_positive.put(MovieConstants.POSITIVE_AWESOME, 0);
		amazon_positive.put(MovieConstants.POSITIVE_SWEET, 0);
		amazon_positive.put(MovieConstants.POSITIVE_TERRIFIC, 0);

		amazon_neutral.put(MovieConstants.NEUTRAL_DECENT, 0);
		amazon_neutral.put(MovieConstants.NEUTRAL_GOOD, 0);
		amazon_neutral.put(MovieConstants.NEUTRAL_NOT_BADB, 0);
		/* Amazon negative words */
		amazon_negative.put(MovieConstants.NEGATIVE_STAY_AWAY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_SUCKS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_WORST, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_WORST, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_SUCKS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_STAY_AWAY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_EVIL, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_EMBARASSED, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_DRACONIAN, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_DISTURBING, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_DEPRESSED, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_DISAGREEABLE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_DEFECTIVE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_DEFEATED, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_DECEITFUL, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_DANGEROUS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_CRUEL, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_CREEPY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_CYNICAL, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_CRAZY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_COWARDLY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_CONFUSED, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_CLUMSY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_CARELESS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_CALLOUS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_BORING, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_ANGRY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_ANNOYED, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_ARROGANT, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_ASHAMED, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_AWFUL, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_BAD, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_AMBIGUOUS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_BEWILDERED, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_AFRAID, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_ALOOF, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_ABUSIVE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_ABRUPT, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_FANATICAL, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_PANICKY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_OBNOXIOUS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_MALICIOUS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_MATERIALISTIC, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_PATHETIC, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_LACKING, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_JITTERY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_MEAN, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_OUTRAGEOUS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_HORRIBLE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_HESITANT, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_HELPLESS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_FRIGHTENED, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_FRETFUL, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_FRANTIC, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_FORGETFUL, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_FOOLISH, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_FLIPPANT, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_FLASHY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_FILTHY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_FIERCE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_NOISY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_LONELY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_NAIVE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_NASTY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_NERVOUS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_LAZY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_REPULSIVE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_GRUMPY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_QUARRELSOME, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_IGNORANT, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_FURTIVE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_GULLIBLE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_HURT, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_POSSESSIVE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_ILL, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_IRRESOLUTE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_JEALOUS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_RUTHLESS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_SAD, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_SCARY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_SECRETIVE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_SELFISH, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_SILLY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_SLOW, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_SNEAKY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_SNOBBISH, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_STRANGE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_SULKY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_TERRIBLE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_THREATENING, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_TIGHT, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_TIMID, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_TIRESOME, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_TROUBLED, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_UPSET, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_UNSURE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_UNSUITABLE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_VAGUE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_UNDESIRABLE, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_VENGEFUL, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_VULGAR, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_WARY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_WEAK, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_WASTEFUL, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_WEARY, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_WICKED, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_WORRIED, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_WORTHLESS, 0);
		amazon_negative.put(MovieConstants.NEGATIVE_WRETCHED, 0);

	}

	public Movie htmlScrapperFromMovieTitle(String movieTitle) {

		if (movieTitle == null) {
			return null;
		}
		movie = new Movie(); // flush each time
		movie.setTitle(movieTitle);
		String encodedMovieTitle = movieTitle.replace(" ", "%20");
		buildFromImdb(movieTitle);
		// buildFromImdb(encodedMovieTitle);
		buildFromRottenTomatoes(encodedMovieTitle);
		buildFromAmazon(movieTitle);
		// buildFromNetflix(movieTitle);

		return movie;

	}

	private void buildFromAmazon(String movieTitle) {
		// TODO Auto-generated method stub
		if (movieTitle == null || movieTitle.equals("")) {
			return;
		}
		Document doc = null;
		// String url =
		// "http://www.amazon.com/Kung-Fu-Panda-Jack-Black/dp/B001HN6918/ref=sr_tr_sr_1?s=movies-tv&ie=UTF8&qid=1322694322&sr=1-1";
		MovieMap movieMap = new MovieMap();
		String url = movieMap.map.get(movieTitle);
		try {
			doc = Jsoup.connect(url).get();
			String text = doc.body().text();
			HashMap<String, String> h = buildRatingMap(text);
			printRatingsMap(h);

			buildAmazonReviewMap(text);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	/* TO BE CHECKED ? */

	/*****************************************/
	private String returnKeyFromValue(Map<String,Integer> map, Integer value)
	{
		
		for(String mapString:map.keySet()){
			if(map.get(mapString).equals(value)){
				return mapString;
			}
		}
		
		return "";
	}
	private void buildAmazonReviewMap(String text) {
		//System.out.println("Text scraped from Amazon" + text);
		List<String> result = splitWords(text);
		buildAmazonFrequencyMap(result);
		
		Collection<Integer> valuesAsCollection = amazon_positive.values();
		List<Integer> toBeSorted = new ArrayList<Integer>(valuesAsCollection);
		Collections.sort(toBeSorted);
		Collections.reverse(toBeSorted);
		HashMap<String,Integer> amazon_positive_top_5 =new HashMap<String,Integer>(); 
		for(int i=1;i <= 5 ;i++){
			String  key = returnKeyFromValue(amazon_positive, toBeSorted.get(i));
			//System.out.println("Amazon Key Value : "+key);
			if(!key.equals("")){
				amazon_positive_top_5.put(key,toBeSorted.get(i));
			}
		}
		movie.setAmazon_positive(amazon_positive_top_5);
		
		
		
		Collection<Integer> valuesNegAsCollection = amazon_negative.values();
		List<Integer> toBeSortedNeg = new ArrayList<Integer>(valuesNegAsCollection);
		Collections.sort(toBeSortedNeg);
		Collections.reverse(toBeSortedNeg);
		HashMap<String,Integer> amazon_negative_top_5 =new HashMap<String,Integer>(); 
		for(int i=1;i <= 5 ;i++){
			String  key = returnKeyFromValue(amazon_negative, toBeSortedNeg.get(i));
			//System.out.println("Amazon Key Value : "+key);
			if(!key.equals("")){
				amazon_negative_top_5.put(key,toBeSortedNeg.get(i));
			}
		}
		movie.setAmazon_negative(amazon_negative_top_5);
	}
	
	

	
	
	private void buildRTReviewMap(String title){
		String url = "http://www.rottentomatoes.com/m/" + title;
		try {
			Document doc = Jsoup.connect(url).get();
			String text = doc.body().text();
			List<String> result = splitWords(text);
			buildRTFrequencyMap(result);
			
			
			
			Collection<Integer> valuesAsCollection = rt_positive.values();
			List<Integer> toBeSorted = new ArrayList<Integer>(valuesAsCollection);
			Collections.sort(toBeSorted);
			Collections.reverse(toBeSorted);
			HashMap<String,Integer> rt_positive_top_5 =new HashMap<String,Integer>(); 
			for(int i=1;i <= 5 ;i++){
				String  key = returnKeyFromValue(rt_positive, toBeSorted.get(i));
				//System.out.println("rt Key Value : "+key);
				if(!key.equals("")){
					rt_positive_top_5.put(key,toBeSorted.get(i));
				}
			}
			movie.setRt_positive(rt_positive_top_5);
			
			
			
			Collection<Integer> valuesNegAsCollection = rt_negative.values();
			List<Integer> toBeSortedNeg = new ArrayList<Integer>(valuesNegAsCollection);
			Collections.sort(toBeSortedNeg);
			Collections.reverse(toBeSortedNeg);
			HashMap<String,Integer> rt_negative_top_5 =new HashMap<String,Integer>(); 
			for(int i=1;i <= 5 ;i++){
				String  key = returnKeyFromValue(rt_negative, toBeSortedNeg.get(i));
				//System.out.println("rt Key Value : "+key);
				if(!key.equals("")){
					rt_negative_top_5.put(key,toBeSortedNeg.get(i));
				}
			}
			movie.setRt_negative(rt_negative_top_5);
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void buildRTFrequencyMap(List<String> result) {
		if (result == null || result.size() == 0) {
			return;
		}
		for (String word : result) {
			if (rt_positive.containsKey(word)) {
				Integer currentValue = rt_positive.get(word);
				rt_positive.put(word, currentValue + 1);
			}
			if (rt_negative.containsKey(word)) {
				Integer currentValue = rt_negative.get(word);
				rt_negative.put(word, currentValue + 1);
			}
		}
		Iterator<String> iterator = rt_positive.keySet().iterator();
		System.out.println("rt positive map");
		while (iterator.hasNext()) {
			String key = iterator.next().toString();
			Integer value = rt_positive.get(key);

			//System.out.println(key + " : " + value);
		}
	}
	
	private List<String> splitWords(String input) {
		List<String> resultSet = new Vector<String>();
		String _splitSpace = "\\s+";
		String result[] = input.split(_splitSpace);

		/* remove punctuations */
		for (String word : result) {
			word = word.replaceAll("[.,!?:;]", "");
			word = word.toLowerCase();
			resultSet.add(word);
		}
		return resultSet;
	}

	private void buildAmazonFrequencyMap(List<String> result) {
		if (result == null || result.size() == 0) {
			return;
		}
		for (String word : result) {
			if (amazon_positive.containsKey(word)) {
				Integer currentValue = amazon_positive.get(word);
				amazon_positive.put(word, currentValue + 1);
			}
			if (amazon_negative.containsKey(word)) {
				Integer currentValue = amazon_negative.get(word);
				amazon_negative.put(word, currentValue + 1);
			}
		}
		Iterator<String> iterator = amazon_positive.keySet().iterator();
		/*System.out.println("Amazon positive map");
		while (iterator.hasNext()) {
			String key = iterator.next().toString();
			Integer value = amazon_positive.get(key);

			System.out.println(key + " : " + value);
		}
		
		
		
		iterator = amazon_negative.keySet().iterator();
		System.out.println("Amazon NEGATIVE  map !!!! ");
		while (iterator.hasNext()) {
			String key = iterator.next().toString();
			Integer value = amazon_negative.get(key);

			System.out.println(key + " : " + value);
		}*/
	}

	/* TO BE CHECKD END */

	/* parse the text and store ratings in HashMap */
	public HashMap<String, String> buildRatingMap(String text) {
		HashMap<String, String> h = new HashMap<String, String>();
		String result = text.substring(text.indexOf("Customer Reviews") + 1,
				text.lastIndexOf("reviews)"));

		int count = 0;
		for (int i = 5; i > 0; i--) {
			int startIndex = result.indexOf(i + " star") + 6;
			int endIndex = result.indexOf(i - 1 + " star");
			String r1 = "";
			if (i == 1) {
				r1 = result.substring(startIndex);
			} else {
				r1 = result.substring(startIndex, endIndex);
			}
			startIndex = r1.indexOf("(") + 1;
			endIndex = r1.indexOf(")");

			h.put(i + " star", r1.substring(startIndex, endIndex));
			String rating = r1.substring(startIndex, endIndex);
			Integer nRating = 0;
			try {
				nRating = Integer.parseInt(rating.replace(",", ""));
			} catch (Exception e) {
				e.printStackTrace();
			}
			amazon_rating_map.put(i, nRating);
			count += Integer.parseInt(r1.substring(startIndex, endIndex)
					.replace(",", ""));

		}

		String avgRating = result.substring(
				result.indexOf("Average Customer Review")
						+ "Average Customer Review".length() + 1,
				result.indexOf("out of 5 stars"));
		Float fAvgRating = (float) 0;
		try {
			fAvgRating = Float.parseFloat(avgRating);
		} catch (Exception e) {
			e.printStackTrace();
		}
		movie.setAmazon_avg(fAvgRating);
		movie.setAmazon_rating_map(amazon_rating_map);
	
		
		/*movie.setAmazon_negative(amazon_negative);
		movie.setAmazon_neutral(amazon_neutral);
		movie.setAmazon_positive(amazon_positive);*/

		h.put("Average Customer Review",
				result.substring(result.indexOf("Average Customer Review")
						+ "Average Customer Review".length() + 1,
						result.indexOf("out of 5 stars")));
		h.put("Reviews", Integer.toString(count).replace(",", ""));
		;
		return h;

	}

	/* Printing the Amazon ratings; just to test values */
	private static void printRatingsMap(HashMap<String, String> map) {
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next().toString();
			String value = map.get(key).toString();
			//System.out.println(key + " : " + value);
		}
	}

	private void buildFromRottenTomatoes(String movieTitle) {
		// TODO Auto-generated method stub
		if (movieTitle == null || movieTitle.equals("")) {
			return;
		}
		Document doc = null;
		String imdb_id = null;
		String url = MovieConstants.ROTTEN_TOMATOES_MOVIE_BASE_URI_1
				+ movieTitle;

		System.out.println(" RT : " + movieTitle);
		java.net.URL myURL = null;
		try {
			URI uri = new URI(url);
			myURL = uri.toURL();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			doc = Jsoup.connect(myURL.toString()).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Gson gson = new Gson();
		// gson.fromJson(json, RottenTomatoesMovieInfoList.class);
		if (doc != null && doc.body() != null & doc.body().childNode(0) != null) {
			Node element = doc.body().childNode(0);
			String jsonRT = element.toString().replace("&quot;", "\"");
			RottenTomatoesJsonMovieList rottenTomatoesMovies = gson.fromJson(
					jsonRT, RottenTomatoesJsonMovieList.class);
			List<RottenTomatoesJsonMovie> movies = rottenTomatoesMovies
					.getMovies();

			for (RottenTomatoesJsonMovie rtMovie : movies) {

				System.out.println(" rtMovie : " + rtMovie);

				buildReviewMapFromRt(rtMovie);
				break;

			}
		}

	}

	private void buildReviewMapFromRt(RottenTomatoesJsonMovie rtMovie) {
		if (movie == null) {
			return;
		}
		movie.setRt_id(rtMovie.getId());
		movie.setRt_critics_ratings(rtMovie.getRatings().getCritics_score()
				.toString());
		movie.setRt_audience_rating(rtMovie.getRatings().getAudience_score()
				.toString());

		/**
		 * TODO : Fetch reviews similar to IMDB and populate the map , time
		 * being just putting initialized values
		 */
	/*	movie.setRt_positive(rt_positive);
		movie.setRt_neutral(rt_neutral);
		movie.setRt_negative(rt_negative);*/

		Document doc = null;

		RTMovieURLMap urlMap = new RTMovieURLMap();
		String title = urlMap.map.get(movie.getTitle());

		buildRTReviewMap(title);
		fetchRTPoster(title);

		System.out.println("title of the RT : " + title);
		// String url = "http://www.rottentomatoes.com/m/" +
		// rtMovie.getTitle().replace(" ", "%20") +"/reviews/#page=";
		String url = "http://www.rottentomatoes.com/m/" + title
				+ "/reviews/#page=";

		java.net.URL myURL = null;
		try {
			URI uri = new URI(url);
			myURL = uri.toURL();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Integer page = 1;

		/**************/
		ArrayList<String> arrList = new ArrayList<String>();
		int star1 = 0, star2 = 0, star3 = 0, star4 = 0, star5 = 0;
		int sum = 0, value1 = 0;
		// "http://www.rottentomatoes.com/m/titanic/reviews/#type=user"
		// http://www.rottentomatoes.com/m/titanic/reviews/#page=2&type=user

		/**************/
		while (page <= 10) {
			try {
				doc = Jsoup.connect(myURL.toString() + page + "&type=user")
						.get();
				//System.out.println(myURL.toString() + page + "&type=user");
				String body = doc.body().text();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (doc != null) {
				// Elements spanElements = doc.getElementsByTag("span");
				// Elements divElements = doc.getElementsByTag("div");
				// processReviews(elements);
				// processRTRatings(divElements);
				// processRTRatings(spanElements);

				/**********************************************************/

				String text = doc.select("div.media_block_content")
						.select("div.reviewsnippet").select("p").toString();
				int length = doc.select("div.media_block_content")
						.select("div.reviewsnippet").select("p").size();

				for (int i = 0; i < length; i++) {
					String s = doc.select("div.media_block_content")
							.select("div.reviewsnippet").select("p").get(i)
							.toString();
					if (s.contains("Original Score:")) {
						int startIndex = s.indexOf("Original Score:")
								+ "Original Score:".length();
						int endIndex = s.indexOf("</p>");
						s = s.substring(startIndex, endIndex);
						// System.out.println(s);
						arrList.add(s);
					}

				}
			}

			for (String s : arrList) {

				// NUMERICAL VALUE HAVING /
				if (s.trim().length() > 2) {
					String s1 = "/";
					String[] split = s.split(s1);

					double value = Double.parseDouble(split[0])
							/ Double.parseDouble(split[1]);

					if (value <= 0.2) {
						star1++;
					} else if (value <= 0.4) {
						star2++;
					} else if (value <= 0.6) {
						star3++;
					} else if (value <= 0.8) {
						star4++;
					} else {
						star5++;
					}
				}
				// ALPHABET GRADE
				/*
				 * A+ or A : 5 A- : 4 B+ or B : 3 B-:2 C+, C , C-: 1
				 */
				else {
					s = s.trim();
					if (s.equalsIgnoreCase("A") || s.equalsIgnoreCase("A+")) {
						star5++;
					}
					if (s.equalsIgnoreCase("A-")) {
						star4++;
					}
					if (s.equalsIgnoreCase("B") || s.equalsIgnoreCase("B+")) {
						star3++;
					}
					if (s.equalsIgnoreCase("B-")) {
						star2++;
					}
					if (s.equalsIgnoreCase("C") || s.equalsIgnoreCase("C-")
							|| s.equalsIgnoreCase("C+")) {
						star1++;
					}

				}
			}

			page = page + 1;
			/*********************************************************/
		}

		Map<Integer, Integer> h = new HashMap<Integer, Integer>();
		h.put(5, star5);
		h.put(4, star4);
		h.put(3, star3);
		h.put(2, star2);
		h.put(1, star1);

		Iterator entries = h.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) entries.next();
			//System.out.println("Star " + entry.getKey() + ", Value = "+ entry.getValue());
			sum = sum + ((entry.getKey()) * (entry.getValue()));
			value1 += entry.getValue();
		}

		rt_rating_map.put(5, star5);
		rt_rating_map.put(4, star4);
		rt_rating_map.put(3, star3);
		rt_rating_map.put(2, star2);
		rt_rating_map.put(1, star1);

		float avgRating = sum / value1;
		movie.setRt_avg(avgRating);
		movie.setRt_rating_map(rt_rating_map);

	}

	private void fetchRTPoster(String title) {

		String url = "http://www.rottentomatoes.com/m/" + title;
		String imageURL = null;
		Document doc;
		try {
			doc = Jsoup.connect(url).get();
			System.out.println("RT url " + url);
			String body = doc.body().text();
			// String text
			// =doc.select("div.movie_poster_area").select("[href]").toString();
			int length = doc.select("div.movie_poster_area").select("[href]")
					.size();
			for (int i = 0; i < length; i++) {
				imageURL = doc.select("div.movie_poster_area").select("[href]")
						.toString();
				if (imageURL.contains("img src=")) {
					int startIndex = imageURL.indexOf("img src=")
							+ "img src=".length();
					int endIndex = imageURL.indexOf("width");
					imageURL = imageURL.substring(startIndex, endIndex);
					imageURL = imageURL.replace("_det", "_pro");

				}

			}
			movie.setImdb_poster(imageURL);
			// movie.setRT_poster(imageURL);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void processRTRatings(Elements elements) {
		// TODO Auto-generated method stub
		if (elements != null) {
			for (Element element : elements) {
				String cls = element.attr("class");
				if (cls != null && cls.contains("fixed stars score")) {
					if (cls != null) {
						CharSequence cRating = cls.subSequence(
								cls.length() - 2, cls.length() - 1);

						try {
							Integer numericalRating = Integer.parseInt(cRating
									.toString());
							buildRTRatingMap(numericalRating);

						} catch (Exception e) {
							e.printStackTrace();
						}

					}
				}
			}
		}
	}

	private void buildRTRatingMap(Integer numericalRating) {
		// TODO Auto-generated method stub
		if (numericalRating == null || numericalRating > 10) {
			return;
		}

		if (numericalRating == 1) {
			if (rt_rating_map.containsKey(1)) {
				Integer currentValue = rt_rating_map.get(1);
				rt_rating_map.put(1, currentValue + 1);
			}
		}
		if (numericalRating == 2) {
			if (rt_rating_map.containsKey(2)) {
				Integer currentValue = rt_rating_map.get(2);
				rt_rating_map.put(2, currentValue + 1);
			}
		}
		if (numericalRating == 3) {
			if (rt_rating_map.containsKey(3)) {
				Integer currentValue = rt_rating_map.get(3);
				rt_rating_map.put(3, currentValue + 1);
			}
		}
		if (numericalRating == 4) {
			if (rt_rating_map.containsKey(4)) {
				Integer currentValue = rt_rating_map.get(4);
				rt_rating_map.put(4, currentValue + 1);
			}
		}
		if (numericalRating == 5) {
			if (rt_rating_map.containsKey(5)) {
				Integer currentValue = rt_rating_map.get(5);
				rt_rating_map.put(5, currentValue + 1);
			}
		}
	}

	private void buildFromImdb(String movieTitle) {
		if (movieTitle == null || movieTitle.equals("")) {
			return;
		}
		Document doc = null;
		String imdb_id = null;
		IMDBMovieURLMap id = new IMDBMovieURLMap();
		String url = MovieConstants.IMBD_MOVIE_BASE_URI_1
				+ id.map.get(movieTitle)
				+ MovieConstants.IMDB_MOVIE_BASE_URI_2_XML;
		System.out.println("Movie title" + movieTitle);
		System.out.println("IMDB id: " + id.map.get(movieTitle));
		System.out.println("URL" + url);
		String url2 = "http://www.imdb.com/title/" + imdb_id + "";
		java.net.URL myURL = null;
		try {
			URI uri = new URI(url);
			myURL = uri.toURL();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			doc = Jsoup.connect(myURL.toString()).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (doc != null) {
			Elements elements = doc.getElementsByTag("movie");
			if (elements != null && elements.get(0) != null
					&& elements.get(0).hasAttr("title")
					&& elements.get(0).hasAttr("rating")
					&& elements.get(0).hasAttr("votes")
					&& elements.get(0).hasAttr("id")
					&& elements.get(0).hasAttr("poster")
					&& elements.get(0).hasAttr("tomatoFresh")
					&& elements.get(0).hasAttr("tomatoMeter")
					&& elements.get(0).hasAttr("tomatoRotten")) {
				movie.setImdb_title(elements.get(0).attr("title").toString());
				movie.setImdb_rating(elements.get(0).attr("rating").toString());
				movie.setImdb_Votes(elements.get(0).attr("votes").toString());
				movie.setImdb_id(elements.get(0).attr("id").toString());
				// movie.setImdb_poster(elements.get(0).attr("poster").toString());
				movie.setRt_tomatoFresh(elements.get(0).attr("tomatoFresh")
						.toString());
				movie.setRt_tomatoMeter(elements.get(0).attr("tomatoMeter")
						.toString());
			}
		}
		String url3 = "http://www.imdb.com/title/" + movie.getImdb_id();
		// url3 = "http://www.imdb.com/title/" + "tt0468569";

		try {
			doc = Jsoup.connect(url3).get();
			String body = doc.body().text();
			Elements table = doc.getElementsByTag("table");
			if (body != null) {

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		buildReviewMapFromImdb(movie.getImdb_id());
		// buildReviewMapFromImdb("tt0468569");

		// buildReviewMapFromImdb(movie.getImdb_id());
	}

	private void buildReviewMapFromImdb(String imdb_id) {
		// TODO Auto-generated method stub
		if (imdb_id == null || imdb_id.equals("")) {
			return;
		}
		Document doc = null;
		String url = "http://www.imdb.com/title/" + imdb_id
				+ "/reviews?count=*&start=";
		String url2 = "http://www.imdb.com/title/" + imdb_id + "";
		Integer page = 0;

		while (page <= 2000) {
			try {
				doc = Jsoup.connect(url + page).get();
				String body = doc.body().text();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (doc != null) {
				Elements elements = doc.getElementsByTag("p");
				Elements imageElements = doc.getElementsByTag("img");
				processReviews(elements);
				processRatings(imageElements);
			}
			page = page + 50;
		}
	/*	movie.setImbd_positive(imbd_positive);
		movie.setImdb_neutral(imdb_neutral);
		movie.setImdb_negative(imdb_negative);*/
		movie.setImbd_rating_map(imbd_rating_map);

	}

	private void processRatings(Elements elements) {
		// TODO Auto-generated method stub

		if (elements != null) {
			for (Element element : elements) {
				String img = element.attr("src");
				String alt = element.attr("alt");
				if (img != null
						&& img.contains("http://i.media-imdb.com/images/showtimes/")) {
					if (alt != null) {
						String[] rating = alt.split("/");
						if (rating != null && rating.length >= 1) {
							try {
								Integer numericalRating = Integer
										.parseInt(rating[0]);
								buildRatingImdbMap(numericalRating);

							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}

		String words = " ";
		words.length();

	}

	private void buildRatingImdbMap(Integer numericalRating) {
		// TODO Auto-generated method stub
		if (numericalRating == null || numericalRating > 10) {
			return;
		}

		if (numericalRating == 0 || numericalRating == 1) {
			if (imbd_rating_map.containsKey(1)) {
				Integer currentValue = imbd_rating_map.get(1);
				imbd_rating_map.put(1, currentValue + 1);
			}
		}
		if (numericalRating == 1 || numericalRating == 2) {
			if (imbd_rating_map.containsKey(1)) {
				Integer currentValue = imbd_rating_map.get(1);
				imbd_rating_map.put(1, currentValue + 1);
			}
		}
		if (numericalRating == 3 || numericalRating == 4) {
			if (imbd_rating_map.containsKey(2)) {
				Integer currentValue = imbd_rating_map.get(2);
				imbd_rating_map.put(2, currentValue + 1);
			}
		}
		if (numericalRating == 5 || numericalRating == 6) {
			if (imbd_rating_map.containsKey(3)) {
				Integer currentValue = imbd_rating_map.get(3);
				imbd_rating_map.put(3, currentValue + 1);
			}
		}
		if (numericalRating == 7 || numericalRating == 8) {
			if (imbd_rating_map.containsKey(4)) {
				Integer currentValue = imbd_rating_map.get(4);
				imbd_rating_map.put(4, currentValue + 1);
			}
		}
		if (numericalRating == 9 || numericalRating == 10) {
			if (imbd_rating_map.containsKey(5)) {
				Integer currentValue = imbd_rating_map.get(5);
				imbd_rating_map.put(5, currentValue + 1);
			}
		}

	}

	private void processReviews(Elements elements) {
		// TODO Auto-generated method stub
		if (elements != null) {
			for (Element element : elements) {
				String[] words = element.text().toString().split(" ");
				buildIMDBMap(words);
			}
		}

	}

	private void buildIMDBMap(String[] words) {
		// TODO Auto-generated method stub
		if (words == null || words.length == 0) {
			return;
		}

		for (String word : words) {

			if (imbd_positive.containsKey(word)) {
				Integer currentValue = imbd_positive.get(word);
				imbd_positive.put(word, currentValue + 1);
			}
			if (imdb_neutral.containsKey(word)) {
				Integer currentValue = imdb_neutral.get(word);
				imdb_neutral.put(word, currentValue + 1);
			}
			if (imdb_negative.containsKey(word)) {
				Integer currentValue = imdb_negative.get(word);
				imdb_negative.put(word, currentValue + 1);
			}
			
			
			
			
			
			if (CommonUtils.patternMatch(".*/10", "9/10")) {
				String[] rating = "9/10".split("/");
				if (rating != null && rating.length >= 1) {
					try {
						Integer numericalRating = Integer.parseInt(rating[0]);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			if (word.endsWith("/10")) {
				String[] rating = word.split("/");
				if (rating != null && rating.length >= 1) {
					try {
						Integer numericalRating = Integer.parseInt(rating[0]);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			if (CommonUtils.patternMatch(".*/10", word)) {
				String[] rating = word.split("/");
				if (rating != null && rating.length >= 1) {
					try {
						Integer numericalRating = Integer.parseInt(rating[0]);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		
		Collection<Integer> valuesAsCollection = imbd_positive.values();
		List<Integer> toBeSorted = new ArrayList<Integer>(valuesAsCollection);
		Collections.sort(toBeSorted);
		Collections.reverse(toBeSorted);
		HashMap<String,Integer> imbd_positive_top_5 =new HashMap<String,Integer>(); 
		for(int i=1;i <= 5 ;i++){
			String  key = returnKeyFromValue(imbd_positive, toBeSorted.get(i));
			//System.out.println("imbd Key Pos Value : "+key);
			if(!key.equals("")){
				imbd_positive_top_5.put(key,toBeSorted.get(i));
			}
		}
		movie.setImbd_positive(imbd_positive_top_5);
		
		
		
		Collection<Integer> valuesNegAsCollection = imdb_negative.values();
		List<Integer> toBeSortedNeg = new ArrayList<Integer>(valuesNegAsCollection);
		Collections.sort(toBeSortedNeg);
		Collections.reverse(toBeSortedNeg);
		HashMap<String,Integer> imdb_negative_top_5 =new HashMap<String,Integer>(); 
		for(int i=1;i <= 5 ;i++){
			String  key = returnKeyFromValue(imdb_negative, toBeSortedNeg.get(i));
			//System.out.println("imdb Key Value : "+key);
			if(!key.equals("")){
				imdb_negative_top_5.put(key,toBeSortedNeg.get(i));
			}
		}
		movie.setImdb_negative(imdb_negative_top_5);
		
	}

}
