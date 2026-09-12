import { StoryLesson } from '../types';

export const ALPHABET_LETTERS = [
  'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
  'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
] as const;

export const ALPHABET_STORIES: Record<string, [StoryLesson, StoryLesson]> = {
  A: [
    {
      id: 'A-1',
      category: 'alphabet',
      letter: 'A',
      title: "Arthur's Ancient Alchemy Adventure",
      subtitle: "Dense 'A' Alliteration & Vowel Drill",
      text: "Arthur the ambitious alchemist arranged ancient amber amulets along arched avenues, attempting astounding astral alignments across autumn afternoons. All around, attentive apprentices admired Arthur's astonishing aptitude as atomic ashes ascended."
    },
    {
      id: 'A-2',
      category: 'alphabet',
      letter: 'A',
      title: "Astronauts Along Astral Atmospheres",
      subtitle: "High-Frequency 'A' Orbit Drill",
      text: "Astronauts aligned advanced apparatus across astral atmospheres, aiming at anomalous asteroids orbiting above azure auroras. Automated antennas adjusted accurately, analyzing abundant atmospheric anomalies and alerting astonished astronomers."
    }
  ],
  B: [
    {
      id: 'B-1',
      category: 'alphabet',
      letter: 'B',
      title: "Brave Bakers Baking Brilliant Brownies",
      subtitle: "Dense 'B' Bilabial Muscle Drill",
      text: "Brave bakers baked brilliant butter brownies beside bustling bakeries before breakfast. Benjamin blended bountiful brown batter, boiling bitter blackberries and braising blueberries beneath bronze burners while busy bees buzzed."
    },
    {
      id: 'B-2',
      category: 'alphabet',
      letter: 'B',
      title: "Beneath Blue Bridges Benjamin Built",
      subtitle: "High-Frequency 'B' Alliteration",
      text: "Beneath broad blue bridges, Benjamin built big boats from birch bark. Billowing breezes blew bright banners, bouncing beyond bubbling brooks where brave badgers boldly burrowed between blooming bushes."
    }
  ],
  C: [
    {
      id: 'C-1',
      category: 'alphabet',
      letter: 'C',
      title: "Clever Cats Chasing Curious Clockwork Crickets",
      subtitle: "Sharp 'C' Left-Hand Drill",
      text: "Clever cats cautiously chased curious clockwork crickets climbing copper clocks. Christopher captured crystalline clouds creating calm conditions, causing cautious creatures to celebrate cheerful choir chords across cobblestone courtyards."
    },
    {
      id: 'C-2',
      category: 'alphabet',
      letter: 'C',
      title: "Captain Christopher's Cosmic Cruiser Coasting",
      subtitle: "High-Frequency 'C' Cadence",
      text: "Captain Christopher commanded cosmic cruisers coasting calmly through celestial canyons. Cylindrical capsules carried classified crystals capable of capturing cosmic currents, captivating curious cadets charting constellation coordinates."
    }
  ],
  D: [
    {
      id: 'D-1',
      category: 'alphabet',
      letter: 'D',
      title: "Daring Detectives Discovering Distant Dark Dimensions",
      subtitle: "Middle Finger 'D' Precision",
      text: "Daring detectives decoded dubious documents detailing distant dark dimensions. Daniel discovered dazzling diamond discs dropped during dramatic dust storms, demonstrating dependable deductive diligence despite dangerous distractions."
    },
    {
      id: 'D-2',
      category: 'alphabet',
      letter: 'D',
      title: "Deep Down Dragons Defend Dazzling Diamonds",
      subtitle: "High-Frequency 'D' Rhythmic Drill",
      text: "Deep down, dormant dragons defended dazzling diamonds during damp December dawns. Distant drums declared daring deeds while determined dwarves deliberated dynamic defenses defying dangerous dark destroyers."
    }
  ],
  E: [
    {
      id: 'E-1',
      category: 'alphabet',
      letter: 'E',
      title: "Eccentric Engineers Exploring Electric Echoes Everywhere",
      subtitle: "Top Row 'E' Frequency Drill",
      text: "Eccentric engineers explored electric echoes echoing everywhere across enchanted estates. Evelyn examined exquisite emerald engines, emitting energetic electromagnetic elements that enlightened enthusiastic experts eager for extraordinary evolution."
    },
    {
      id: 'E-2',
      category: 'alphabet',
      letter: 'E',
      title: "Eager Eagles Enjoying Early Emerald Evenings",
      subtitle: "Dense 'E' Muscle Memory",
      text: "Eager eagles enjoyed early emerald evenings expanding elegant echoes across eastern estuaries. Environmental educators explained ecological equilibriums, examining evergreen ecosystems enveloped by ethereal evening elements."
    }
  ],
  F: [
    {
      id: 'F-1',
      category: 'alphabet',
      letter: 'F',
      title: "Fearless Foxes Foraging Fresh Fragrant Figs",
      subtitle: "Left Index Home Row Anchor 'F'",
      text: "Fearless foxes foraged fragrant figs floating freely from fabulous forest flora. Felicity found forty fresh ferns flourishing faithfully beside frozen fjords, fascinating friendly forest folk following foreign footprints."
    },
    {
      id: 'F-2',
      category: 'alphabet',
      letter: 'F',
      title: "Fierce Falcons Flying Far From Frosty Fjords",
      subtitle: "Speed 'F' Flight Drill",
      text: "Fierce falcons flew far from frosty fjords, facing ferocious frozen fog fearlessly. Flexible feathers felt formidable friction, facilitating fast fluid flights flourishing faithfully forward through furious frigid frontiers."
    }
  ],
  G: [
    {
      id: 'G-1',
      category: 'alphabet',
      letter: 'G',
      title: "Gallant Giants Guarding Golden Glowing Gardens",
      subtitle: "Inner Reach 'G' Index Drill",
      text: "Gallant giants guarded golden gardens glowing graciously through gorgeous green glades. Gregory gathered giant grapes, generating great gratitude among generous guests gazing upon glittering glass greenhouses."
    },
    {
      id: 'G-2',
      category: 'alphabet',
      letter: 'G',
      title: "Gentle Gentlefolk Gathering Green Grapes Gladly",
      subtitle: "High-Frequency 'G' Rhythm",
      text: "Gentle gentlefolk gathered glossy green gooseberries gladly beside graceful gushing geysers. Glistening glaciers gifted generous gravity, guiding genuine adventurers toward grandiose granite gates guarding giant groves."
    }
  ],
  H: [
    {
      id: 'H-1',
      category: 'alphabet',
      letter: 'H',
      title: "Heroic Hunters Heading Home Helping Humble Hermits",
      subtitle: "Right Index Center Anchor 'H'",
      text: "Heroic hunters headed home happily through high highlands, helping humble hermits harvest hearty hazelnuts. Harmonious horns hailed historical heroes who held heavy hammers, honorably defending hillside homesteads."
    },
    {
      id: 'H-2',
      category: 'alphabet',
      letter: 'H',
      title: "Harmonious Harps Hum Heavenly Hymns Happily",
      subtitle: "Melodic 'H' Coordination",
      text: "Harmonious harps hummed heavenly hymns, healing heavy hearts hanging in hopeless hollows. Helena heard heartfelt harmonies hovering higher, honoring holy heralds holding handsome hazelwood lanterns."
    }
  ],
  I: [
    {
      id: 'I-1',
      category: 'alphabet',
      letter: 'I',
      title: "Intrepid Inventors Illuminating Infinite Iron Islands",
      subtitle: "Right Middle Top Row 'I' Drill",
      text: "Intrepid inventors illuminated infinite iron islands, installing ingenious instruments in immense isolated industrial installations. Isaac inspected interconnected interfaces, improving intricate information indicators instantly."
    },
    {
      id: 'I-2',
      category: 'alphabet',
      letter: 'I',
      title: "Impressive Iguanas Inhabiting Isolated Ice Inlets",
      subtitle: "Dense 'I' Vowel Alliteration",
      text: "Impressive iguanas inhabited illuminated ironwood isles, ignoring icy intervals inside insulated igloos. Innocent insects identified incredible ivy illustrations, inspiring inquisitive illustrators imagining ideal idyllic impressions."
    }
  ],
  J: [
    {
      id: 'J-1',
      category: 'alphabet',
      letter: 'J',
      title: "Jovial Jugglers Juggling Juicy Jars Joyfully",
      subtitle: "Right Index Home Row Tactile Bump 'J'",
      text: "Jovial jugglers juggled juicy jars joyfully, jumping jubilantly around jade jungle paths. Julian joined junior jewelers journeying across judicial jurisdictions, joking jaunty jests beside joyful jukeboxes."
    },
    {
      id: 'J-2',
      category: 'alphabet',
      letter: 'J',
      title: "Judicious Judges Joining Jolly Jungle Journeys",
      subtitle: "High-Focus 'J' Precision",
      text: "Judicious judges joined jolly jungle journeys, justifying judicious judgments with joyous generosity. Jasper jammed jazzy jigs on jangling junk instruments, justifying justifiable joy across jubilant jamborees."
    }
  ],
  K: [
    {
      id: 'K-1',
      category: 'alphabet',
      letter: 'K',
      title: "Kind Knights Keeping Keen Kingdom Keys",
      subtitle: "Right Middle Home Row 'K' Drill",
      text: "Kind knights kept keen kingdom keys locked in kinetic kiosks knowing knavish kings kept knocking. Kimberly knitted khaki keepsake kits, kindly keeping kaleidoscope keepsakes known across distant kingdoms."
    },
    {
      id: 'K-2',
      category: 'alphabet',
      letter: 'K',
      title: "Knowing Kings Knocking Kitchen Kettles Kindly",
      subtitle: "Kinetic 'K' Muscle Training",
      text: "Knowing kings knocked kinetic kettles kindly, keeping keen kitchen knives keen and kosher. Kayakers knew kilometer markers kept kinsmen knowledgeable regarding kindred kingdoms keeping knightly kudos."
    }
  ],
  L: [
    {
      id: 'L-1',
      category: 'alphabet',
      letter: 'L',
      title: "Lively Leopards Leaping Long Lush Lowlands",
      subtitle: "Right Ring Home Row 'L' Drill",
      text: "Lively leopards leaped lightly along lush lowlands, locating little lucid lagoons lit by luminous lanterns. Lawrence looked like lucky leaders leaning against limestone lattices, listening to lovely lyrical lullabies."
    },
    {
      id: 'L-2',
      category: 'alphabet',
      letter: 'L',
      title: "Luminous Lanterns Lighting Lonely Lunar Lakes",
      subtitle: "Liquid 'L' Flow Training",
      text: "Luminous lanterns lit lonely lunar lakes like liquid light. Lorelei loved lyrical legends lingering beneath lavender lilacs, liberating lonely listeners longing for limitless loyal laughter."
    }
  ],
  M: [
    {
      id: 'M-1',
      category: 'alphabet',
      letter: 'M',
      title: "Mighty Magicians Making Mysterious Midnight Music",
      subtitle: "Right Index Bottom Row 'M' Reach",
      text: "Mighty magicians made mysterious midnight music moving melodic mist mounting mountain meadows. Marcus mixed molten metals methodically, managing majestic magnetic machines making monumental masterpieces."
    },
    {
      id: 'M-2',
      category: 'alphabet',
      letter: 'M',
      title: "Merry Monkeys Munched Many Mellow Mangos",
      subtitle: "Resonant 'M' Bottom Row Drill",
      text: "Merry monkeys munched many mellow mangoes, making modest mischief midst magnificent mossy mangrove mountains. Mindful monks murmured meaningful mantras, meditating modern mysteries morning until midnight."
    }
  ],
  N: [
    {
      id: 'N-1',
      category: 'alphabet',
      letter: 'N',
      title: "Nimble Ninjas Navigating Narrow Northern Networks",
      subtitle: "Right Index Inward 'N' Diagonal",
      text: "Nimble ninjas navigated narrow northern networks, noticing subtle notes neatly nestled near noisy waterfalls. Natalie neglected no necessary nuances, negotiating noble novel treaties neutralizing negative nations."
    },
    {
      id: 'N-2',
      category: 'alphabet',
      letter: 'N',
      title: "Noble Nomads Noticing New Nebulas Nightly",
      subtitle: "Dense 'N' Consonant Drill",
      text: "Noble nomads noticed novel nebulas nightly, naming numerous nomadic navigations naturally. Nathan navigated nautical networks near northern Norway, noting neat neon notifications nesting near nautical nodes."
    }
  ],
  O: [
    {
      id: 'O-1',
      category: 'alphabet',
      letter: 'O',
      title: "Optimistic Owls Observing Open Oceanic Oceans",
      subtitle: "Right Ring Top Row 'O' Reach",
      text: "Optimistic owls observed open oceanic horizons, overcoming obstinate obstacles on orderly nocturnal operations. Oliver obtained old obsidian orbs, opening opulent oriental doorways overlooking orchards."
    },
    {
      id: 'O-2',
      category: 'alphabet',
      letter: 'O',
      title: "Original Orators Offering Outstanding Olive Oil",
      subtitle: "Rounded 'O' Finger Coordination",
      text: "Original orators offered outstanding olive oils, organizing official occasions on open ornamental observatories. Oscar operated optical oscillators, outputting optimized organic orders overcome by opulent outcomes."
    }
  ],
  P: [
    {
      id: 'P-1',
      category: 'alphabet',
      letter: 'P',
      title: "Prudent Pirates Painting Purple Palm Pavilions",
      subtitle: "Right Pinky Top Corner 'P' Reach",
      text: "Prudent pirates painted purple palm pavilions, placing polished platinum plates principally upon peaceful private porches. Penelope produced perfect pastries packed with pecans, pleasing passing populations praising pastry prowess."
    },
    {
      id: 'P-2',
      category: 'alphabet',
      letter: 'P',
      title: "Playful Penguins Prowling Polar Paths Patiently",
      subtitle: "Pinky Precision 'P' Drill",
      text: "Playful penguins prowled polar paths patiently, paddling past pleasant pebbled peninsulas. Philip proposed practical policies promoting peaceful planetary prosperity, preventing peril through prudent preparation."
    }
  ],
  Q: [
    {
      id: 'Q-1',
      category: 'alphabet',
      letter: 'Q',
      title: "Quick Queens Quietly Questioning Quaint Quests",
      subtitle: "Left Pinky Top Corner 'Q' Stretch",
      text: "Quick queens quietly questioned quaint quests, quoting quirky quotes while quilting quality quilts quickly. Quentin quenched quick quarrels between quarreling queens, querying quaint quantum qualities quite quietly."
    },
    {
      id: 'Q-2',
      category: 'alphabet',
      letter: 'Q',
      title: "Quirky Quokkas Quenching Quality Quartz",
      subtitle: "Rare Letter 'Q' Agility",
      text: "Quirky quokkas quenched thirst near quiet quicksilver quarries, querying quirky quartz quandaries. Qualified physicists quantified quantum quotes, questioning questionable quality qualifications quickly."
    }
  ],
  R: [
    {
      id: 'R-1',
      category: 'alphabet',
      letter: 'R',
      title: "Radiant Rangers Rescuing Rare Ruby Rhinos",
      subtitle: "Left Index Top Row 'R' Upward Roll",
      text: "Radiant rangers rescued rare ruby rhinos roaming rugged riverbeds, restoring rich regional rainforests rapidly. Rebecca recorded rhythmically resounding raindrops rolling through rustic redwood roots."
    },
    {
      id: 'R-2',
      category: 'alphabet',
      letter: 'R',
      title: "Rapid Rivers Rushing Round Rugged Rocks",
      subtitle: "Rolling 'R' Muscle Drill",
      text: "Rapid rivers rushed round rugged rocks, ringing resonant rhythms regarding rural romance. Raymond restored rustic rail cars, running reliable routes reaching remote residential reservations."
    }
  ],
  S: [
    {
      id: 'S-1',
      category: 'alphabet',
      letter: 'S',
      title: "Silent Sailors Steering Silver Ships Southward",
      subtitle: "Left Ring Home Row 'S' Anchor",
      text: "Silent sailors steered silver ships southward, scanning starry skies shimmering softly through smooth sea sprays. Sophia sang soothing sonnets, softening sorrowful spirits seeking serene sanctuaries."
    },
    {
      id: 'S-2',
      category: 'alphabet',
      letter: 'S',
      title: "Serene Swans Swimming Smooth Sunlit Streams",
      subtitle: "Sibilant 'S' Rhythm Mastery",
      text: "Serene swans swam silently through sunlit streams, startling several sleepy salamanders sheltered under sandstone slabs. Samuel sketched spectacular scenes showing splendid summer sunsets."
    }
  ],
  T: [
    {
      id: 'T-1',
      category: 'alphabet',
      letter: 'T',
      title: "Tireless Travelers Trekking Through Twilight Towns",
      subtitle: "Left Index Top Center 'T' Stretch",
      text: "Tireless travelers trekked through twilight towns, touching traditional terra-cotta towers that traced timeless tales. Theodore tested turbulent turbines toward torrential typhoons, transporting technological tools truthfully."
    },
    {
      id: 'T-2',
      category: 'alphabet',
      letter: 'T',
      title: "Tall Timber Trees Towering Toward Tomorrow",
      subtitle: "High-Frequency 'T' Consonant Flow",
      text: "Tall timber trees towered toward tomorrow, tranquil trunks trapping timeless terrors. Timothy taught talented technicians tactile typing techniques, triggering tremendous transformative trends."
    }
  ],
  U: [
    {
      id: 'U-1',
      category: 'alphabet',
      letter: 'U',
      title: "Unique Unicorns Unlocking Unusual Underwater Universes",
      subtitle: "Right Index Top Row 'U' Reach",
      text: "Unique unicorns unlocked unusual underwater universes, utilizing ultramarine umbrellas upon unexpected upstream upsurges. Ursula understood universal utility, unifying unknown urban users under utopian undertakings."
    },
    {
      id: 'U-2',
      category: 'alphabet',
      letter: 'U',
      title: "Urban Umpires Uttering Urgent Useful Understandings",
      subtitle: "Vowel 'U' Balance Training",
      text: "Urban umpires uttered urgent understandings upon umpire tribunals, upgrading unruly uniforms unhesitatingly. Unbiased underground updates upheld utmost user unity, uncovering unique underlying utility."
    }
  ],
  V: [
    {
      id: 'V-1',
      category: 'alphabet',
      letter: 'V',
      title: "Valiant Voyagers Viewing Vibrant Volcanic Vistas",
      subtitle: "Left Index Bottom Row 'V' Downward Reach",
      text: "Valiant voyagers viewed vibrant volcanic vistas, visiting verdant valleys veiled in velvet vapors. Victoria validated valuable vintage violins, vocalizing vigorous verses vibrating victorious vibes."
    },
    {
      id: 'V-2',
      category: 'alphabet',
      letter: 'V',
      title: "Velvet Violins Vibrating Vivid Vintage Verses",
      subtitle: "Resonant 'V' Dexterity Drill",
      text: "Velvet violins vibrated vivid vintage verses, vitalizing vague memories lingering in vast Venetian villas. Victor volunteered vigilant verification vectors, visualizing voluminous valid variations."
    }
  ],
  W: [
    {
      id: 'W-1',
      category: 'alphabet',
      letter: 'W',
      title: "Wise Wizards Weaving Wonderful White Willow Wands",
      subtitle: "Left Ring Top Row 'W' Reach",
      text: "Wise wizards wove wonderful white willow wands, whispering warm wishes whenever winter winds wailed wildly. William watched weathered windmills whirl without worry, welcoming weary wanderers westward."
    },
    {
      id: 'W-2',
      category: 'alphabet',
      letter: 'W',
      title: "Wild Wolves Wandering Warm Whispering Woods",
      subtitle: "Flowing 'W' Muscle Drill",
      text: "Wild wolves wandered westward through whispering woods, watching warm water wheeling within wooden wells. Walter wrote witty words with wondrous wisdom, winning world acclaim widely."
    }
  ],
  X: [
    {
      id: 'X-1',
      category: 'alphabet',
      letter: 'X',
      title: "Xanthic Xenons X-raying Xenial Xylophones",
      subtitle: "Left Ring Bottom Row 'X' Cross Reach",
      text: "Xanthic xenons x-rayed xenial xylophones across exotic exhibition halls, expressing extraordinary experimental excitement. Xavier examined exemplary xeriscape extracts, maximizing expressive syntax while extracting oxygen."
    },
    {
      id: 'X-2',
      category: 'alphabet',
      letter: 'X',
      title: "Xerox Experts Examining Xenon Xylographs",
      subtitle: "High-Precision 'X' Dexterity",
      text: "Xerox experts examined xenon xylographs, executing exceptional pixel exposures for xenobiology exhibits. Xylophonists executed exquisite movements, transcribing complex context with flexing index fingers."
    }
  ],
  Y: [
    {
      id: 'Y-1',
      category: 'alphabet',
      letter: 'Y',
      title: "Youthful Yachtsmen Yearning Yesterday's Yellow Yards",
      subtitle: "Right Index Center Top 'Y' Stretch",
      text: "Youthful yachtsmen yearned for yellow yards yielding juicy yams, yelling joyful yells beside yawning yellow yachts. Yasmin yielded yieldingly to youthful yearnings, yodeling yesterday's youthful yore."
    },
    {
      id: 'Y-2',
      category: 'alphabet',
      letter: 'Y',
      title: "Yonder Yaks Yielding Yummy Yam Yogurt",
      subtitle: "Agile 'Y' Finger Coordination",
      text: "Yonder yellow yaks yielded yummy yam yogurt yearly, yoking youthful yaks around yielding Yorkshire yards. Yuri yielded yearning yearbooks yesterday, yielding yearly yields youthfully."
    }
  ],
  Z: [
    {
      id: 'Z-1',
      category: 'alphabet',
      letter: 'Z',
      title: "Zealous Zebras Zigzagging Zephyrs Zero Zenith Zones",
      subtitle: "Left Pinky Bottom Corner 'Z' Precision",
      text: "Zealous zebras zigzagged past breezy zephyrs toward zero zenith zones, zooming through zesty zinnia gardens with zinc zest. Zara zipped zealously along zigzagging trails, zeroing zoom lenses with zestful zeal."
    },
    {
      id: 'Z-2',
      category: 'alphabet',
      letter: 'Z',
      title: "Zany Zoologists Zooming Zealous Zeppelins",
      subtitle: "Pinky Anchor 'Z' Alliteration",
      text: "Zany zoologists zoomed zealous zeppelins over Zimbabwe's zodiac zones, surveying zippy lizards snacking on zesty zucchini. Zachary's zeal zen-focused zigzagging zigzags, zincing zero-gravity zones."
    }
  ]
};

export const BIGRAM_STORIES: StoryLesson[] = [
  {
    id: 'bi-as',
    category: 'bigram',
    pair: 'A+S',
    title: "Home Row Anchor: A + S Muscle Flow",
    subtitle: "Left Hand Ring & Pinky Finger Coordination",
    text: "As ash asked fast cast masks, smart mass assistants pass glass flasks as past grass casts dark fast blasts. Sam asks brass tasks as stars spark sharp paths across massed grasslands."
  },
  {
    id: 'bi-th',
    category: 'bigram',
    pair: 'T+H',
    title: "Index Coordination: T + H Central Stretch",
    subtitle: "Left Index Top Stretch to Right Index Center",
    text: "The three hearty brothers thought that thirty thick thorns thrilled their thoughtful father throughout that thrilling theater trip. These thirty thrilling truths taught them to trust hearty thoughts."
  },
  {
    id: 'bi-er',
    category: 'bigram',
    pair: 'E+R',
    title: "Finger Roll Rhythm: E + R Top Row Drill",
    subtitle: "Left Middle to Left Index Rapid Roll",
    text: "Ever faster runners cheered greater orders everywhere as reverent referees rendered better scores. Rivers roared over greener riversides where every brave rider cheered their dearest order."
  },
  {
    id: 'bi-in',
    category: 'bigram',
    pair: 'I+N',
    title: "Inward Roll Flow: I + N Right Hand Drill",
    subtitle: "Right Middle Top to Right Index Inward Diagonal",
    text: "In shining morning rain, nine innocent penguins spinning inside infinite rings grinning into thin shining tin pins. Iron miners winning infinite coin mining in fine mountain ravines."
  },
  {
    id: 'bi-qu',
    category: 'bigram',
    pair: 'Q+U',
    title: "Reach Coordination: Q + U Cross Hand Roll",
    subtitle: "Left Pinky Corner to Right Index Top Row",
    text: "Quiet queens quickly queried quaint quotes quoting quirky quirks. Unique statues acquire antique quartz quietly required for quick unquestioned quests across quiet quaint squares."
  },
  {
    id: 'bi-ck',
    category: 'bigram',
    pair: 'C+K',
    title: "Backhand Drill: C + K Coordination",
    subtitle: "Left Middle Bottom to Right Middle Home Row",
    text: "Click clack clock tick tock! Quick black ducks flock round thick brick stacks, locking black locks quickly as tricky black cats chuckle back in dark backyards."
  },
  {
    id: 'bi-op',
    category: 'bigram',
    pair: 'O+P',
    title: "Pinky & Ring Extension: O + P Top Corner",
    subtitle: "Right Ring to Right Pinky Edge Rhythm",
    text: "Open opulent purple poppies popped atop copper rooftops. Popular poets plotted poignant prose, sipping copper potion drops upon open prospective platforms."
  }
];

export const MIXED_STORIES: StoryLesson[] = [
  {
    id: 'mix-1',
    category: 'mixed',
    title: "The Celestial Pangram Odyssey",
    subtitle: "Balanced uniform distribution of all 26 letters",
    text: "The quick brown fox jumps over the lazy dog while five boxing wizards jump quickly through vexing fog. Pack my box with five dozen liquor jugs, for exquisite joy quickly dazzles every keen mind."
  },
  {
    id: 'mix-2',
    category: 'mixed',
    title: "Sphinx of Quartz & Ivory Gears",
    subtitle: "Rich literary vocabulary exercising whole keyboard",
    text: "Jackdaws love my big sphinx of quartz, radiating whimsical vibes from azure zodiac skies. We promptly judged antique ivory flutes and complex bronze gears with glowing pride and zero skepticism."
  },
  {
    id: 'mix-3',
    category: 'mixed',
    title: "The Clockmaker's Midnight Horizon",
    subtitle: "Flowing prose covering high and low frequency keystrokes",
    text: "Beneath quiet velvet constellations, an eccentric watchmaker polished gleaming quartz pendulums. Curious foxes gazed from hazy groves while golden mechanical gears chimed twelve joyful notes."
  }
];

export const CASE_MASTERY_STORIES: StoryLesson[] = [
  {
    id: 'case-1',
    category: 'case-mastery',
    title: "Dr. Watson & NASA's Radar Expedition",
    subtitle: "Sudden capitals, acronyms, and Shift-key agility",
    text: "The Quick Brown Fox Jumped Over McDuck's iPhone in NewYork City while Dr. Watson Checked NASA's Radar at 08:00 AM on Sunday, July 4th. Did Mr. Smith Email JaneDoe@CorpDomain.com About ProjectAlpha?"
  },
  {
    id: 'case-2',
    category: 'case-mastery',
    title: "Full-Stack TypeScript & React Architecture",
    subtitle: "CamelCase, PascalCase, and alternating Shift muscles",
    text: "JavaScript and TypeScript Developers Love using React.useState and useEffect Hooks in VisualStudioCode! Notice How CamelCase, PascalCase, and Sudden CapitalLetters Train LeftShift and RightShift Muscles Instantly."
  },
  {
    id: 'case-3',
    category: 'case-mastery',
    title: "Starfleet Transmission: USS Enterprise",
    subtitle: "Quotes, initials, uppercase calls and tactical reports",
    text: "Captain James T. Kirk Contacted Starfleet Command: 'USS Enterprise Requesting Immediate WarpSpeed to Sector 001!' Admiral McCoy Replied: 'Affirmative, Engage Subspace Transponders Now!'"
  }
];

export const HARD_STORIES: StoryLesson[] = [
  {
    id: 'hard-1',
    category: 'hard',
    title: "The Paradox of Empirical Aesthetics",
    subtitle: "Academic prose, semicolons, em-dashes, and quotation marks",
    text: "Connoisseurs of contemporary literature frequently ponder this fundamental paradox: while existential skepticism often suffocates spontaneous intuition, it simultaneously unveils a mesmerizing, unadulterated aesthetic clarity; nevertheless, one must ask—can empirical cognition ever genuinely reconcile with metaphysical yearning?"
  },
  {
    id: 'hard-2',
    category: 'hard',
    title: "Antediluvian Artifacts & Cosmological Crypts",
    subtitle: "Complex multi-syllabic terms and rhythmic punctuation",
    text: "The archaeological expedition unearthed extraordinary paraphernalia—antediluvian chronometers, subterranean manuscripts, and cryptographically synthesized astrolabes—testifying to an advanced civilization whose cosmological comprehension surpassed that of Renaissance scholars."
  },
  {
    id: 'hard-3',
    category: 'hard',
    title: "Deontological Quandaries in Modern Governance",
    subtitle: "Analytical prose demanding sustained focus and rhythm",
    text: "Philosophical discourses regarding utilitarian ethics invariably confront the classical deontological quandary: does the collective welfare of an agglomerated populace supersede the inviolable prerogatives of solitary individuals, or does such pragmatic rationalization inevitably precipitate moral decay?"
  }
];

export const PRO_HARD_STORIES: StoryLesson[] = [
  {
    id: 'pro-1',
    category: 'pro-hard',
    title: "Production Node.js Middleware Handler",
    subtitle: "Brackets {}, fat arrows =>, template literals, and regex",
    text: "const handleData = async (req: Request, res: Response): Promise<void> => { const { id, query = '', maxLimit = 100 } = req.params; if (!id || typeof id !== 'string') throw new Error(`[ERR_400]: Invalid ID ${id}`); return await db.collection('v1_users').find({ $and: [{ active: true }, { score: { $gte: 95.5 } }] }); };"
  },
  {
    id: 'pro-2',
    category: 'pro-hard',
    title: "Bitwise Cryptographic Matrix Hash",
    subtitle: "Symbols $, %, ^, &, ternary operator ? :, and arrays",
    text: "for (let i = 0; i < matrix[0].length; ++i) { const hashVal = (x ^ 0xDEADBEEF) >>> 3; tokens.push({ key: `user_${i}#${Math.random().toFixed(4)}`, status: (i % 2 === 0) ? 200 : 404, payload: [1, 3.14159, 'Alpha-Beta', { debug: false }] }); }"
  },
  {
    id: 'pro-3',
    category: 'pro-hard',
    title: "Secured OAuth2 Bearer Header Payload",
    subtitle: "Escape quotes, URLs, dashes, underscores, and hex keys",
    text: "curl -X POST 'https://api.v2.dev/auth/token?env=prod&tier=gold' -H 'Authorization: Bearer 7a9f-33bc!88*e#' -d '{\"grant_type\": \"client_credentials\", \"client_id\": \"tc_app_9921\", \"nonce\": 1024, \"checksum\": 0xFA3C9}'"
  }
];

// ============================================================================
// AUTHENTIC LITERATURE: MUNSHI PREMCHAND, KABIR KE DOHE & SPACE SCIENCE
// ============================================================================

export const PREMCHAND_STORIES: StoryLesson[] = [
  {
    id: 'premchand-1',
    category: 'literature',
    language: 'hi',
    title: "मुंशी प्रेमचंद: ईदगाह (हामिद का चिमटा)",
    subtitle: "भावुकता, बाल मनोविज्ञान और मानवीय संवेदना का अनुपम उदाहरण",
    text: "रमजान के पूरे तीस रोजों के बाद आज ईद आई है। कितना मनोहर, कितना सुहावना प्रभाव है। वृक्षों पर कुछ अजीब हरियाली है, खेतों में कुछ अजीब रौनक है, आसमान पर कुछ अजीब लालिमा है। हामिद के पास केवल तीन पैसे हैं। मेले में सब बच्चे खिलौने और मिठाइयाँ लेते हैं, किंतु नन्हा हामिद अपनी बूढ़ी दादी अमीना के लिए लोहे का चिमटा खरीदता है, क्योंकि रोटियाँ सेंकते समय दादी की उंगलियाँ तवे से जल जाती थीं। हामिद का यह त्याग और विवेक देखकर बूढ़ी अमीना की आँखें छलक आईं और उसने दुआओं का दामन फैला दिया।"
  },
  {
    id: 'premchand-2',
    category: 'literature',
    language: 'hi',
    title: "मुंशी प्रेमचंद: गोदान (होरी का संघर्ष)",
    subtitle: "भारतीय किसान का अविचल स्वाभिमान, कर्मठता और यथार्थवादी जीवन",
    text: "होरी महतो ने दोनों बैलों को सानी-पानी देकर अपने फटे हुए कुर्ते को संभाला और लाठी टेकते हुए खेत की पगडंडी पर चल पड़ा। उसके मन में एक ही अभिलाषा थी कि द्वार पर एक पछाईं गाय बंधे, जिसके दूध से घर के बालक पुष्ट हों और द्वार की शोभा बढ़े। जीवन भर ऋण और लगान के बोझ तले दबने के बाद भी होरी ने कभी किसी के आगे हाथ नहीं फैलाया। कर्म की वेदी पर अपने प्राण न्योछावर करने वाला भारतीय कृषक वर्ग का यह स्वाभिमानी प्रतिनिधि आज भी हिंदी साहित्य का अमर स्तम्भ बना हुआ है।"
  },
  {
    id: 'premchand-3',
    category: 'literature',
    language: 'hi',
    title: "मुंशी प्रेमचंद: बड़े घर की बेटी (पारिवारिक सौहार्द)",
    subtitle: "पारिवारिक मर्यादा, क्षमाशीलता और स्नेहिल रिश्तों का गौरव",
    text: "आनंदी एक कुलीन और संपन्न परिवार की कन्या थी, जिसका विवाह एक साधारण जमींदार श्रीकंठ सिंह से हुआ। जब देवर लालबिहारी से मामूली कहासुनी पर विवाद बढ़ा, तो आनंदी ने क्रोध को त्यागकर क्षमा और विवेक का परिचय दिया। जब श्रीकंठ ने परिवार से अलग होने का निर्णय लिया, तब आनंदी ने नम्रता से कहा कि बड़े घर की बेटियाँ बिगड़े हुए काम को संवारती हैं, तोड़ती नहीं। आनंदी की इस उदारता ने परिवार को बिखरने से बचा लिया और चारों ओर उसकी बुद्धिमत्ता की प्रशंसा होने लगी।"
  }
];

export const KABIR_DOHA_STORIES: StoryLesson[] = [
  {
    id: 'kabir-1',
    category: 'literature',
    language: 'hi',
    title: "कबीर के दोहे: साधु स्वभाव एवं वाणी की मधुरता",
    subtitle: "सद्गुरु कबीर दास जी की कालजयी साखियाँ और जीवन दर्शन",
    text: "साधु ऐसा चाहिए, जैसा सूप सुभाय। सार-सार को गहि रहै, थोथा देई उड़ाय॥ ऐसी बानी बोलिए, मन का आपा खोय। औरन को सीतल करै, आपहु सीतल होय॥ कबीर दास जी समझाते हैं कि मनुष्य को सूप की तरह विवेकशील होना चाहिए, जो केवल गुणकारी तत्वों को ग्रहण करे और व्यर्थ की बातों को त्याग दे। साथ ही, अहंकार त्यागकर सदैव मधुर और शीतल वाणी बोलनी चाहिए, जिससे स्वयं का मन भी शांत रहे और सुनने वाले को भी असीम सुख प्राप्त हो।"
  },
  {
    id: 'kabir-2',
    category: 'literature',
    language: 'hi',
    title: "कबीर के दोहे: आत्म-निरीक्षण और समय का महत्व",
    subtitle: "अंतर्मुखी विवेक और कर्म की महत्ता पर कबीर का उपदेश",
    text: "बुरा जो देखन मैं चला, बुरा न मिलिया कोय। जो दिल खोजा आपना, मुझसे बुरा न कोय॥ काल करे सो आज कर, आज करे सो अब। पल में परलय होएगी, बहुरि करेगा कब॥ मनुष्य जब दूसरों के दोष खोजने के बजाय अपने अंतर्मन में झांकता है, तो उसे ज्ञात होता है कि वास्तविक सुधार स्वयं से ही आरंभ होना चाहिए। समय अत्यंत अमूल्य है, अतः शुभ संकल्पों और सत्कर्मों को कल पर टालने के स्थान पर वर्तमान क्षण में ही पूर्ण कर लेना चाहिए।"
  },
  {
    id: 'kabir-3',
    category: 'literature',
    language: 'hi',
    title: "कबीर के दोहे: गुरु महिमा और विनम्रता",
    subtitle: "सच्चे मार्गदर्शक का आदर और अहंकार का विसर्जन",
    text: "गुरु गोविंद दोऊ खड़े, काके लागूं पांय। बलिहारी गुरु आपने, गोविंद दियो बताय॥ बड़ा हुआ तो क्या हुआ, जैसे पेड़ खजूर। पंथी को छाया नहीं, फल लागे अति दूर॥ गुरु का स्थान ईश्वर से भी सर्वोपरि माना गया है, क्योंकि गुरु ही ब्रह्म का साक्षात्कार कराते हैं। खजूर के विशाल वृक्ष के समान केवल बाह्य बड़प्पन व्यर्थ है यदि उससे किसी थके हुए पथिक को छाया न मिले और फल भी दुर्गम हो; जीवन की शोभा विनम्रता और परोपकार में है।"
  }
];

export const SPACE_SCIENCE_STORIES: StoryLesson[] = [
  {
    id: 'space-1',
    category: 'literature',
    language: 'en',
    title: "Chandrayaan and the Lunar South Pole Horizon",
    subtitle: "Precision orbital mechanics, soft-landing vectors, and lunar exploration",
    text: "On August 23, 2023, India's Chandrayaan-3 achieved historical triumph as the Vikram lander performed an autonomous soft landing near the unexplored lunar south polar region. Guided by closed-loop hazard detection algorithms, velocimeters, and throttleable liquid engines, the craft touched down flawlessly on regolith terrain. Pragyan rover deployed its laser-induced breakdown spectroscope and alpha-particle X-ray spectrometer, confirming the presence of sulfur, iron, titanium, and trapped hydroxyl molecules within ancient shadowed craters."
  },
  {
    id: 'space-2',
    category: 'literature',
    language: 'en',
    title: "The James Webb Space Telescope & Primordial Galaxies",
    subtitle: "Infrared astronomy, beryllium mirrors, and deep cosmological horizons",
    text: "Stationed 1.5 million kilometers from Earth at the Second Lagrange Point (L2), the James Webb Space Telescope peers deep into the cosmic dawn. Its 6.5-meter gold-coated beryllium primary mirror captures faint redshifted infrared photons emitted over 13.5 billion years ago. Equipped with NIRCam and MIRI instruments, JWST resolves primordial galactic filaments, gravitational lenses, and atmospheric water vapor fingerprints on transiting exoplanets orbiting distant red dwarf stars."
  },
  {
    id: 'space-3',
    category: 'literature',
    language: 'en',
    title: "Quantum Entanglement and Event Horizon Thermodynamics",
    subtitle: "Hawking radiation, spacetime curvature, and information paradoxes",
    text: "Modern theoretical physics bridges general relativity and quantum mechanics through the enigmatic thermodynamics of black holes. At the event horizon, extreme gravitational tidal forces separate virtual particle-antiparticle pairs, producing steady Hawking radiation and causing gradual black hole evaporation. Bell inequality violations and quantum entanglement experiments demonstrate non-local correlations across spacetime, hinting that the fabric of geometry itself may emerge from entangled information matrices."
  }
];

