/**
 * Dual-Letter Muscle-Memory Rule Pair Engine
 * Generates rich, high-density alternation stories for English bigrams (TH, CH, SH, QU, ING, AS, etc.)
 * and Devanagari conjuncts / dual consonant clusters (क्त, त्य, ध्य, स्त, न्द, प्र, क्र, धर्म, द्ध, द्व).
 */

import { StoryLesson } from '../types';

export interface BigramRuleSet {
  pair: string;
  language: 'en' | 'hi';
  title: string;
  subtitle: string;
  stories: StoryLesson[];
}

export const DUAL_RULE_PAIRS: Record<string, BigramRuleSet> = {
  // --------------------------------------------------------------------------
  // ENGLISH DUAL BIGRAMS
  // --------------------------------------------------------------------------
  'TH': {
    pair: 'TH',
    language: 'en',
    title: "The 'TH' Digraph Muscle Anchor",
    subtitle: "Alternating Index-to-Index & Index-to-Center rhythm drills",
    stories: [
      {
        id: 'th-1',
        category: 'bigram',
        pair: 'TH',
        language: 'en',
        title: "The Thoughtful Theorists of Thornbury",
        subtitle: "Rapid 'T' and 'H' transitions in initial and medial positions",
        text: "The three brothers thought that their mother would gather those thermal blankets together. They walked through thickets, although thirsty, thinking through their theories together. Thirty thousand theatrical enthusiasts cheered throughout the thrilling theater performance this Thursday afternoon. Those thoughtful thinkers thanked their benevolent mentors for their trustworthiness and thoroughness."
      },
      {
        id: 'th-2',
        category: 'bigram',
        pair: 'TH',
        language: 'en',
        title: "Thermal Horizons and the Northern Heath",
        subtitle: "High-cadence 'th' word clustering",
        text: "Through the thick heather, the thirty thirsty hunters trekked toward the northern foothills. That thousandth theorem taught them that thought without thoroughness yields thoroughly tangled theories. They thought that their truthful testimonies would thwart the ruthless thieves who threatened the peaceful township throughout the northern heath."
      },
      {
        id: 'th-3',
        category: 'bigram',
        pair: 'TH',
        language: 'en',
        title: "The Theoretical Thickets of Knowledge",
        subtitle: "Complex multi-syllabic 'th' combinations",
        text: "The talented technician tightened the titanium fittings that tethered the third turbine together. Throughout that stormy night, thunderstorms threatened the cathedral's gothic spires. Those who think thoroughly through perplexing problems weather the toughest trials with fortitude, thankful for truth and steadfast brotherhood."
      },
      {
        id: 'th-4',
        category: 'bigram',
        pair: 'TH',
        language: 'en',
        title: "Thundering Thoroughbreds on the Heath",
        subtitle: "Rhythmic alternating bursts",
        text: "The thirty thousand wild thoroughbreds thundered across the heather-covered heath this autumn. The hearth warmth comforted the weary travelers whose hearty laughter thrilled their host throughout the spacious hall. That truthful thesis thoroughly thwarted the hypocritical theories of tyrannical authorities."
      },
      {
        id: 'th-5',
        category: 'bigram',
        pair: 'TH',
        language: 'en',
        title: "The Threshold of Ancient Thebes",
        subtitle: "Endurance drill for digraph muscle memory",
        text: "Beneath the threshold of ancient Thebes, three thoughtful scholars gathered leatherbound manuscripts. They theorized that truth thrives through empathy, thoughtfulness, and methodical synthesis. Although thunderstorms threatened overhead, they stood together thankful for their collective breakthrough."
      }
    ]
  },
  'CH': {
    pair: 'CH',
    language: 'en',
    title: "The 'CH' Palatal Snap Cadence",
    subtitle: "Precision coordination between left-middle ('C') and right-index ('H')",
    stories: [
      {
        id: 'ch-1',
        category: 'bigram',
        pair: 'CH',
        language: 'en',
        title: "The Cheerful Clockmaker of Chester",
        subtitle: "Initial 'CH' articulation drills",
        text: "Charles, a cheerful clockmaker from Chester, chimed twenty antique mechanical clocks each morning. Children cheered as charcoal-roasted chestnuts crackled beneath flickering embers near the cathedral chapel. The choir chanted charming choruses while champions chose challenging chess matches in the village square."
      },
      {
        id: 'ch-2',
        category: 'bigram',
        pair: 'CH',
        language: 'en',
        title: "The Chronicle of Crimson Chalices",
        subtitle: "Medial and terminal 'CH' fluency",
        text: "Christopher checked each parchment chronicle in the castle archives, searching for enchanted golden chalices. Charming merchant ships anchored near sandy beaches, discharging chests filled with chocolate, chili spices, and rich damask cloth. Scholars cherish every chapter that teaches children chivalry."
      },
      {
        id: 'ch-3',
        category: 'bigram',
        pair: 'CH',
        language: 'en',
        title: "Chasing Shadows Across the Orchard",
        subtitle: "Rapid cross-hand alternating pace",
        text: "Curious children chased chirping birds through cherry orchards, catching cool breezes beneath birch branches. The architect sketched magnificent arches and chimneypieces, achieving technical perfection with charcoal sketches. True champions face every challenge with courage, cheerfulness, and unyielding character."
      },
      {
        id: 'ch-4',
        category: 'bigram',
        pair: 'CH',
        language: 'en',
        title: "The Chivalrous Champion's Choice",
        subtitle: "Sentence-level 'CH' repetition",
        text: "The chivalrous champion chose to protect the vulnerable township without charging any tribute. In the castle kitchen, chefs chopped carrots, cheese, and crunchy artichokes while cheerful apprentices fetched charcoal. Each achievement reflects patient craftsmanship and cheerful determination."
      },
      {
        id: 'ch-5',
        category: 'bigram',
        pair: 'CH',
        language: 'en',
        title: "Chamber of Clockwork Chimes",
        subtitle: "Endurance drill for 'CH' agility",
        text: "Within the grand chamber of clockwork chimes, Charles matched each gear tooth with surgical precision. Chirping crickets serenaded the starry night as the church bells chimed midnight. Such achievements cheer the spirit and teach us to cherish each passing hour."
      }
    ]
  },
  'SH': {
    pair: 'SH',
    language: 'en',
    title: "The 'SH' Sibilant Glide Drill",
    subtitle: "Seamless transition from left-ring ('S') to right-index ('H')",
    stories: [
      {
        id: 'sh-1',
        category: 'bigram',
        pair: 'SH',
        language: 'en',
        title: "Shimmering Shells Along the Shore",
        subtitle: "Left-to-right cross-keyboard coordination",
        text: "Sheena collected shimmering seashells along the windswept shore as morning sunshine shifted across shallow shoals. Ships sheltered inside the harbor while fishermen shared stories of colossal sharks swimming through shadowy offshore trenches. Sharp shadows vanished as sunshine showered the sheltered coast."
      },
      {
        id: 'sh-2',
        category: 'bigram',
        pair: 'SH',
        language: 'en',
        title: "The Silver Shield and Shadowy Shire",
        subtitle: "Dense 'SH' sibilant flow",
        text: "The valiant knight polished his silver shield before marching through the shadowed Scottish shire. Shepherds sheltered their woolly sheep inside stone sheds whenever harsh winter blizzards shook the hillsides. Sharp flashes of starlight shone brightly, shedding shimmer upon sleeping villages."
      },
      {
        id: 'sh-3',
        category: 'bigram',
        pair: 'SH',
        language: 'en',
        title: "The Shifting Sands of the Sahara",
        subtitle: "Dynamic finger balance",
        text: "Shifting sands whispered softly as nomadic caravans moved swiftly toward sheltered desert oases. Craftsmen shaped polished mahogany shelves, showcasing delicate porcelain dishes and shimmering crystal shapes. Shared fellowship shields the human spirit from harsh winter chills."
      },
      {
        id: 'sh-4',
        category: 'bigram',
        pair: 'SH',
        language: 'en',
        title: "The Shipwright's Skilled Showcase",
        subtitle: "Rhythmic 'SH' word repetitions",
        text: "The skilled shipwright smoothed cedar planks with sharp tools, shaping sturdy hulls that withstand surging ocean shockwaves. Shellfish nourished coastal communities while shops displayed stylish shawls, shoes, and shimmering sapphire jewelry. True friendship shines bright even through shadowy adversity."
      },
      {
        id: 'sh-5',
        category: 'bigram',
        pair: 'SH',
        language: 'en',
        title: "Shooting Stars Above Shoreline Shoals",
        subtitle: "Speed endurance drill",
        text: "Shooting stars shot across the midnight sky, shedding bright light upon the silent shoreline. Shepherds shared warm broth inside wooden shelters while sheep slept peacefully. The shining moon bathed the ship's polished deck in shimmering silver, completing a tranquil evening."
      }
    ]
  },
  'QU': {
    pair: 'QU',
    language: 'en',
    title: "The 'QU' Left-Pinky to Right-Index Dynamic",
    subtitle: "High-speed coordination from extreme left 'Q' to upper-right 'U'",
    stories: [
      {
        id: 'qu-1',
        category: 'bigram',
        pair: 'QU',
        language: 'en',
        title: "The Queen's Quest for Quantum Quartz",
        subtitle: "Left pinky stretch to right index reach",
        text: "The quiet queen quickly launched a quest across distant quarries to uncover luminous quantum quartz crystals. Inquisitive scholars requested quick access to antique scrolls, questioning ancient queens about quaint traditions. The quick brown fox quickly jumped over the inquisitive quail without quenching its thirst."
      },
      {
        id: 'qu-2',
        category: 'bigram',
        pair: 'QU',
        language: 'en',
        title: "The Quiet Quasar and the Quantum Quill",
        subtitle: "High-frequency 'QU' word repetition",
        text: "An inquisitive astronomer observed a distant quasar pulsing quietly across cosmic quadrants. The scribe dipped his antique quill into dark ink, quickly penning eloquent quotes about equality, tranquility, and quality governance. Quick decisions quell quarrelsome squabbles and qualify leaders for greater responsibilities."
      },
      {
        id: 'qu-3',
        category: 'bigram',
        pair: 'QU',
        language: 'en',
        title: "Quenching Thirst Beside Quiet Quays",
        subtitle: "Rhythmic agility drill",
        text: "Sailors quickly docked at quiet quays, quenching their thirst with cool aquifer water after exhausting ocean voyages. The queen requited loyalty with exquisite gifts, acknowledging the unique qualities of her loyal squadron. Frequent practice quickly squashes errors and qualifies typists for elite mastery."
      },
      {
        id: 'qu-4',
        category: 'bigram',
        pair: 'QU',
        language: 'en',
        title: "The Quirky Quartet at Queen's Square",
        subtitle: "Rapid finger leaping",
        text: "A quirky quartet performed melodious musical suites in Queen's Square, quickly attracting inquisitive crowds. The quintessential beauty of the musical chords quelled anxiety, leaving listeners quiet and captivated. Acquiring true mastery requires unquestionable dedication and quick mental reflexes."
      },
      {
        id: 'qu-5',
        category: 'bigram',
        pair: 'QU',
        language: 'en',
        title: "The Quantum Quorum of Scholars",
        subtitle: "Complex vocabulary and finger anchor",
        text: "A distinguished quorum of physicists gathered to discuss quantum mechanics and atmospheric equilibrium. They quickly formulated mathematical equations that resolved perplexing questions regarding subatomic particles. Quality research quickly transforms theoretical speculation into concrete technological triumphs."
      }
    ]
  },
  'ING': {
    pair: 'ING',
    language: 'en',
    title: "The 'ING' Tri-Key Suffix Cascade",
    subtitle: "Fluid roll: Right-Middle ('I') -> Right-Index ('N') -> Left-Index ('G')",
    stories: [
      {
        id: 'ing-1',
        category: 'bigram',
        pair: 'ING',
        language: 'en',
        title: "Singing Birds and Springtime Flowering",
        subtitle: "Right-hand roll to left-hand anchor",
        text: "Singing birds were bringing morning sunshine, awakening blooming flowers along whispering brooks. Young runners were sprinting, jumping, and breathing crisp morning air while gazing at soaring eagles gliding through billowing clouds. Learning, practicing, and improving typing speed brings lasting satisfaction every single day."
      },
      {
        id: 'ing-2',
        category: 'bigram',
        pair: 'ING',
        language: 'en',
        title: "Building, Crafting, and Inspiring Greatness",
        subtitle: "Continuous continuous-tense suffix drill",
        text: "Master artisans were constructing towering monuments, carving glistening stone and smelting glowing bronze throughout the morning. Diligent students were reading, thinking, questioning, and writing compelling essays. Developing genuine mastery means committing oneself to relentless training and never yielding to despair."
      },
      {
        id: 'ing-3',
        category: 'bigram',
        pair: 'ING',
        language: 'en',
        title: "Sailing Along Surging Ocean Swells",
        subtitle: "Rhythmic suffix cadences",
        text: "Navigators were charting distant islands while listening to splashing waves striking the sturdy hull. Glowing lanterns were swinging gently beneath billowing sails as darkness was falling across sparkling waters. Aspiring musicians spend countless evenings playing, listening, rehearsing, and perfecting their phrasing."
      },
      {
        id: 'ing-4',
        category: 'bigram',
        pair: 'ING',
        language: 'en',
        title: "Flowing Streams and Rustling Autumn Leaves",
        subtitle: "High-density '-ing' rolling rhythm",
        text: "Crisp autumn winds were sweeping across golden valleys, shaking branches and scattering swirling leaves across whispering pathways. Mountaineers were climbing steep crags, gripping jagged ledges and celebrating reaching the summit. Typing continuously without pausing reinforces reflex arcs and accelerates muscle memory."
      },
      {
        id: 'ing-5',
        category: 'bigram',
        pair: 'ING',
        language: 'en',
        title: "The Unfolding Symphony of Morning Dawn",
        subtitle: "Endurance suffix cascade",
        text: "The sun was rising, casting shimmering golden light across sleeping meadows and awakening bustling communities. Choirs were singing harmonious hymns, ringing church bells, and welcoming the promising dawn. Cultivating patience while steadily practicing daily typing exercises yields astonishing results."
      }
    ]
  },

  // --------------------------------------------------------------------------
  // DEVANAGARI DUAL CONJUNCTS & CLUSTERS (संयुक्त अक्षर व द्वित्व)
  // --------------------------------------------------------------------------
  'क्त': {
    pair: 'क्त',
    language: 'hi',
    title: "संयुक्त अक्षर 'क्त' (क + ् + त) अभ्यास",
    subtitle: "क-त संयुक्त संयोजन: भक्ति, शक्ति, मुक्ति, रक्त, व्यक्त",
    stories: [
      {
        id: 'kt-1',
        category: 'bigram',
        pair: 'क्त',
        language: 'hi',
        title: "भक्ति और शक्ति का पावन संगम",
        subtitle: "सघन 'क्त' संयुक्ताक्षर अभ्यास",
        text: "सच्ची भक्ति और आत्मिक शक्ति से युक्त मनुष्य जीवन के हर संकट से मुक्त हो जाता है। वक्त की पाबंदी और सतत लगन से किया गया कार्य ही श्रेष्ठ व्यक्त स्वरूप प्राप्त करता है। भक्त ने मंदिर में जाकर रक्त चंदन का तिलक लगाया और ईश्वर से ज्ञान रूपी शक्ति की प्रार्थना की।"
      },
      {
        id: 'kt-2',
        category: 'bigram',
        pair: 'क्त',
        language: 'hi',
        title: "संयुक्त परिवार और सशक्त समाज",
        subtitle: "व्यवहारिक वाक्यों में 'क्त' का प्रयोग",
        text: "संयुक्त परिवार की शक्ति से युक्त समाज ही राष्ट्र को सशक्त बनाता है। किसी भी विषय पर अपने विचार व्यक्त करते समय वक्त की गरिमा का ध्यान रखना आवश्यक है। परिश्रम से युक्त व्यक्ति कभी पराजित नहीं होता और अपने लक्ष्य को पूर्णतः प्राप्त करता है।"
      },
      {
        id: 'kt-3',
        category: 'bigram',
        pair: 'क्त',
        language: 'hi',
        title: "मुक्ति का मार्ग और सत्य की शक्ति",
        subtitle: "आध्यात्मिक एवं दार्शनिक 'क्त' शब्द",
        text: "सत्य से युक्त आचरण ही मनुष्य को अज्ञान के बंधनों से मुक्त करता है। व्यक्ति का व्यक्तित्व उसके सद्व्यवहार और संस्कारों से ही व्यक्त होता है। रक्त की हर बूंद में राष्ट्रभक्ति की भावना जागृत रखना प्रत्येक नागरिक का कर्तव्य है।"
      },
      {
        id: 'kt-4',
        category: 'bigram',
        pair: 'क्त',
        language: 'hi',
        title: "वक्त का महत्व और युक्तियुक्त निर्णय",
        subtitle: "दैनिक जीवन में गतिशीलता",
        text: "वक्त का सही सदुपयोग करने वाले व्यक्ति सदा सफल रहते हैं। उपयुक्त समय पर लिया गया युक्तिपूर्ण निर्णय असंभव कार्य को भी सुगम बना देता है। ज्ञान से परिपक्व व्यक्ति अपनी वाणी में मधुरता और सत्य को व्यक्त करता है।"
      },
      {
        id: 'kt-5',
        category: 'bigram',
        pair: 'क्त',
        language: 'hi',
        title: "सशक्त संकल्प और एकाग्र साधना",
        subtitle: "'क्त' संयुक्ताक्षर गति प्रवाह",
        text: "दृढ़ इच्छाशक्ति से युक्त साधक निरंतर अभ्यास द्वारा सफलता प्राप्त करता है। भक्ति भाव से आपूरित अंतःकरण में शांति का वास होता है। जब कर्म निष्काम भाव से युक्त होता है, तब जीवन स्वतः ही धन्य हो जाता है।"
      }
    ]
  },
  'त्य': {
    pair: 'त्य',
    language: 'hi',
    title: "संयुक्त अक्षर 'त्य' (त + ् + य) अभ्यास",
    subtitle: "त-य संयुक्त संयोजन: सत्य, नित्य, कृत्य, आदित्य, साहित्य",
    stories: [
      {
        id: 'ty-1',
        category: 'bigram',
        pair: 'त्य',
        language: 'hi',
        title: "सत्यमेव जयते और नित्य साधना",
        subtitle: "सत्य, कृत्य, नित्य का सतत अभ्यास",
        text: "सत्य की सदैव विजय होती है और असत्य का अंधकार स्वतः ही मिट जाता है। नित्य प्रति स्वाध्याय और सद्विचारों का चिंतन करने से मन निर्मल होता है। उत्कृष्ट साहित्य समाज को सत्य और कर्तव्य के पावन मार्ग पर अग्रसर करता है।"
      },
      {
        id: 'ty-2',
        category: 'bigram',
        pair: 'त्य',
        language: 'hi',
        title: "आदित्य की प्रभा और नित्य कर्म",
        subtitle: "प्रभात वेला और कर्तव्य परायणता",
        text: "आदित्य के उदय होते ही संसार में नवचेतना का संचार हो जाता है। नित्य कर्म से निवृत्त होकर किसान और श्रमिक अपने कर्तव्य पथ पर आगे बढ़ते हैं। अपने प्रत्येक कृत्य को निष्ठापूर्वक संपन्न करना ही श्रेष्ठ मनुष्य का लक्षण है।"
      },
      {
        id: 'ty-3',
        category: 'bigram',
        pair: 'त्य',
        language: 'hi',
        title: "हिंदी साहित्य और सनातन सत्य",
        subtitle: "साहित्यिक शब्दावली में 'त्य' का प्रयोग",
        text: "हिंदी साहित्य की समृद्ध परंपरा में मुंशी प्रेमचंद और कबीर दास जी ने सनातन सत्य को उजागर किया है। जो व्यक्ति नित्य अभ्यास करता है, उसकी टाइपिंग गति और शुद्धता अत्यंत प्रशंसनीय स्तर तक पहुंच जाती है।"
      },
      {
        id: 'ty-4',
        category: 'bigram',
        pair: 'त्य',
        language: 'hi',
        title: "प्रत्येक क्षण का महत्व और आतिथ्य",
        subtitle: "सद्भाव और मानवीय मूल्य",
        text: "भारतीय संस्कृति में अतिथि को भगवान मानकर आतिथ्य सत्कार किया जाता है। जीवन का प्रत्येक क्षण अमूल्य है, अतः इसे सत्य और परोपकार में लगाना चाहिए। सत्कर्मों से युक्त जीवन ही मृत्यु के उपरांत भी अमर रहता है।"
      },
      {
        id: 'ty-5',
        category: 'bigram',
        pair: 'त्य',
        language: 'hi',
        title: "कर्तव्यनिष्ठा और नित्य अभ्यास",
        subtitle: "'त्य' संयुक्ताक्षर अंगुली समन्वय",
        text: "टाइपिंग में नित्य अभ्यास करने से अंगुलियों का सामंजस्य स्वतः ही स्थापित हो जाता है। सत्य और संयम का मार्ग कठिन अवश्य है, किंतु इसका परिणाम सदैव कल्याणकारी होता है। साहित्य और कला जीवन को अत्यंत सरस बनाते हैं।"
      }
    ]
  },
  'ध्य': {
    pair: 'ध्य',
    language: 'hi',
    title: "संयुक्त अक्षर 'ध्य' (ध + ् + य) अभ्यास",
    subtitle: "ध-य संयुक्त संयोजन: ध्यान, अध्ययन, मध्य, माध्यम, संध्या",
    stories: [
      {
        id: 'dhy-1',
        category: 'bigram',
        pair: 'ध्य',
        language: 'hi',
        title: "गहन ध्यान और एकाग्र अध्ययन",
        subtitle: "ज्ञानार्जन एवं मानसिक एकाग्रता",
        text: "गहन ध्यान और नियमित अध्ययन से विद्यार्थी की स्मरण शक्ति अत्यंत तीव्र हो जाती है। संध्या वेला में शांत वातावरण के मध्य बैठकर चिंतन करने से अंतःकरण आलोकित हो उठता है। पुस्तकें ज्ञानार्जन का सर्वोत्तम माध्यम हैं।"
      },
      {
        id: 'dhy-2',
        category: 'bigram',
        pair: 'ध्य',
        language: 'hi',
        title: "मध्य मार्ग और जीवन का ध्येय",
        subtitle: "संतुलित जीवन शैली और लक्ष्य निर्धारण",
        text: "भगवान बुद्ध ने जीवन में अतिवाद से बचकर मध्यम मार्ग अपनाने का उपदेश दिया था। मनुष्य को अपने जीवन का ध्येय स्पष्ट रखना चाहिए ताकि वह भटकाव से बच सके। एकाग्र चित्त से अध्ययन करने पर कठिनतम विषय भी सुगम हो जाते हैं।"
      },
      {
        id: 'dhy-3',
        category: 'bigram',
        pair: 'ध्य',
        language: 'hi',
        title: "संध्या का सौंदर्य और आध्यात्मानुभूति",
        subtitle: "प्राकृतिक वातावरण और मन की शांति",
        text: "संध्या के समय आकाश में लालिमा बिखर जाती है और पक्षी अपने नीड़ की ओर लौटते हैं। इस पावन वेला में किया गया ध्यान मानसिक तनाव को दूर कर देता है। योग और प्राणायाम के माध्यम से शरीर और मन दोनों स्वस्थ रहते हैं।"
      },
      {
        id: 'dhy-4',
        category: 'bigram',
        pair: 'ध्य',
        language: 'hi',
        title: "आधुनिक शिक्षा और शोध अध्ययन",
        subtitle: "वैज्ञानिक दृष्टिकोण और अनुसंधान",
        text: "आधुनिक काल में वैज्ञानिक अध्ययनों के माध्यम से ब्रह्मांड के अनेक रहस्य उजागर हुए हैं। जब शोधार्थी पूर्ण ध्यान से अन्वेषण में लीन होते हैं, तब नवीन आविष्कारों का मार्ग प्रशस्त होता है। अध्ययन ही प्रगति का मूल आधार है।"
      },
      {
        id: 'dhy-5',
        category: 'bigram',
        pair: 'ध्य',
        language: 'hi',
        title: "ध्येय सिद्धि और अविराम साधना",
        subtitle: "'ध्य' संयुक्ताक्षर अभ्यास प्रवाह",
        text: "अपने ध्येय को प्राप्त करने के लिए निरंतर अध्ययन और अभ्यास आवश्यक है। मध्य मार्ग पर चलकर ही व्यक्ति संतुलन और शांति प्राप्त कर सकता है। ध्यान से काम करने पर गलतियों की संभावना शून्य हो जाती है।"
      }
    ]
  },
  'प्र': {
    pair: 'प्र',
    language: 'hi',
    title: "संयुक्त अक्षर 'प्र' (प + ् + र) अभ्यास",
    subtitle: "प-र पदेन संयोजन: प्रकाश, प्रगति, प्रयास, प्रकृति, प्रभाव",
    stories: [
      {
        id: 'pr-1',
        category: 'bigram',
        pair: 'प्र',
        language: 'hi',
        title: "प्रभात का प्रकाश और प्रकृति का सौंदर्य",
        subtitle: "प्रभात, प्रकाश, प्रकृति, प्रगति",
        text: "प्रभात की स्वर्णिम किरणों के प्रकाश से प्रकृति का कण-कण पुलकित हो उठा। निरंतर प्रयास और लगन से ही मनुष्य प्रगति के सर्वोच्च शिखर को स्पर्श करता है। प्रत्येक नागरिक को पर्यावरण संरक्षण के प्रति अपनी प्रतिबद्धता प्रकट करनी चाहिए।"
      },
      {
        id: 'pr-2',
        category: 'bigram',
        pair: 'प्र',
        language: 'hi',
        title: "सार्थक प्रयास और प्रेरणादायक प्रगति",
        subtitle: "परिश्रम और सफलता के सोपान",
        text: "सच्चे मन से किया गया प्रयास कभी व्यर्थ नहीं जाता और उसका प्रभाव सदैव सकारात्मक होता है। प्रसिद्ध वैज्ञानिकों ने कठिन प्रयोगों द्वारा संसार को अनेक अद्भुत उपहार प्रदान किए हैं। प्रगतिशील समाज में सभी को समान अवसर प्राप्त होते हैं।"
      },
      {
        id: 'pr-3',
        category: 'bigram',
        pair: 'प्र',
        language: 'hi',
        title: "प्रशंसा, प्रभाव और प्रामाणिक कार्य",
        subtitle: "कार्यकुशलता और प्रतिष्ठा",
        text: "प्रामाणिक और उत्कृष्ट कार्य करने वाले व्यक्ति की प्रशंसा चारों दिशाओं में फैलती है। अपने विनम्र स्वभाव से दूसरों को प्रभावित करना एक महान गुण है। प्रत्येक विद्यार्थी को अपनी प्रतिभा को निखारने का पूर्ण अवसर मिलना चाहिए।"
      },
      {
        id: 'pr-4',
        category: 'bigram',
        pair: 'प्र',
        language: 'hi',
        title: "प्रकृति की रक्षा और प्रदूषण मुक्ति",
        subtitle: "पर्यावरणीय दायित्व और सचेत प्रयास",
        text: "प्रकृति हमें जीवनदायिनी वायु और जल प्रदान करती है, अतः इसे प्रदूषण से मुक्त रखना हमारा पुनीत कर्तव्य है। वृक्षारोपण के माध्यम से हम पृथ्वी को हरा-भरा और प्रदूषण मुक्त बना सकते हैं। यह प्रयास मानवता के लिए अत्यंत कल्याणकारी है।"
      },
      {
        id: 'pr-5',
        category: 'bigram',
        pair: 'प्र',
        language: 'hi',
        title: "प्रतियोगिता में विजय और प्रफुल्लित मन",
        subtitle: "'प्र' पदेन संयुक्ताक्षर सघन अभ्यास",
        text: "प्रतियोगिता में सफलता प्राप्त करने के लिए पूर्व तैयारी और दृढ़ संकल्प आवश्यक है। जब परिणाम अनुकूल आता है, तो मन प्रफुल्लित हो उठता है। प्रगति के मार्ग पर आगे बढ़ते हुए कभी भी अपने नैतिक मूल्यों को नहीं भूलना चाहिए।"
      }
    ]
  },
  'धर्म': {
    pair: 'धर्म',
    language: 'hi',
    title: "रेफ़ संयोजन 'र्म' (र + ् + म) व धर्म अभ्यास",
    subtitle: "रेफ़ अभ्यास: धर्म, कर्म, मर्म, चर्म, निर्मल",
    stories: [
      {
        id: 'dharm-1',
        category: 'bigram',
        pair: 'धर्म',
        language: 'hi',
        title: "धर्म और कर्म का सनातन समन्वय",
        subtitle: "रेफ़ वर्ण अभ्यास (धर्म, कर्म, मर्म)",
        text: "सत्य और परोपकार ही मानव का सबसे बड़ा धर्म है, और निष्काम भाव से किया गया कर्म ही जीवन को सार्थक बनाता है। जो मनुष्य धर्म के मर्म को समझकर आचरण करता है, उसका अंतःकरण गंगाजल के समान निर्मल हो जाता है।"
      },
      {
        id: 'dharm-2',
        category: 'bigram',
        pair: 'धर्म',
        language: 'hi',
        title: "कर्मवीर का पावन संकल्प",
        subtitle: "कर्तव्यपरायणता और कर्मयोग",
        text: "श्रीमद्भगवद्गीता में भगवान श्रीकृष्ण ने कर्मयोग का उपदेश देते हुए कहा कि कर्म करना ही तुम्हारा अधिकार है, फल की चिंता छोड़ दो। जब व्यक्ति अपने धर्म का पालन करते हुए कर्म में लीन रहता है, तो उसे परम शांति की प्राप्ति होती है।"
      },
      {
        id: 'dharm-3',
        category: 'bigram',
        pair: 'धर्म',
        language: 'hi',
        title: "निर्मल अंतःकरण और धर्म का स्वरूप",
        subtitle: "मानवीय मूल्य और सद्भावना",
        text: "निर्मल हृदय में ही ईश्वर का वास होता है। किसी को पीड़ा न पहुंचाना और सभी प्राणियों के प्रति दया का भाव रखना ही वास्तविक धर्म है। कर्म की शुचिता से मनुष्य समाज में आदर और यश का पात्र बनता है।"
      },
      {
        id: 'dharm-4',
        category: 'bigram',
        pair: 'धर्म',
        language: 'hi',
        title: "धार्मिक सहिष्णुता और सद्भाव",
        subtitle: "एकता और बंधुत्व",
        text: "भारत भूमि पर अनेक धर्मों और संस्कृतियों का संगम हुआ है। सभी धर्म सत्य, प्रेम और करुणा का ही संदेश देते हैं। जब हम दूसरों के प्रति सद्भाव रखते हैं, तभी धर्म की वास्तविक सार्थकता सिद्ध होती है।"
      },
      {
        id: 'dharm-5',
        category: 'bigram',
        pair: 'धर्म',
        language: 'hi',
        title: "कर्मठता और चारित्रिक उत्कर्ष",
        subtitle: "रेफ़ संयुक्ताक्षर प्रवाह",
        text: "कर्मठ व्यक्ति अपने अथक परिश्रम से असंभव को भी संभव बना देता है। चरित्र की दृढ़ता ही मनुष्य का वास्तविक आभूषण है। धर्म और कर्म का समन्वय ही जीवन को दिव्यता और शांति की ओर अग्रसर करता है।"
      }
    ]
  }
};
