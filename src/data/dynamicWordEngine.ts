// ==========================================================================
// Adarsh's TextCraft & TypoLab Studio: Dynamic Procedural Word & Sentence Engine
// On-the-fly Intelligent Grammatical Synthesis with Seamless Infinite Streaming
// ==========================================================================

export interface VocabularyCategory {
  beginning: string[];
  middle: string[];
  ending: string[];
  adjectives: string[];
  nouns: string[];
  verbs: string[];
  adverbs: string[];
}

export interface HindiVocabularyCategory {
  initial: string[];
  medial: string[];
  final: string[];
  nouns: string[];
  adjectives: string[];
  verbs: string[];
  adverbs: string[];
  phrases: string[];
}

// --------------------------------------------------------------------------
// 1. ENGLISH VOCABULARY BY TARGET LETTER (A to Z)
// --------------------------------------------------------------------------
export const ENGLISH_DYNAMIC_VOCAB: Record<string, VocabularyCategory> = {
  'A': {
    beginning: ['ancient', 'astral', 'arcane', 'aurora', 'alchemist', 'artisan', 'acacia', 'avocado', 'altitude', 'airship', 'apprentice', 'archipelago', 'amphitheater', 'astrolabe', 'amulet', 'anomaly'],
    middle: ['adaptable', 'brave', 'charming', 'daring', 'graceful', 'radiant', 'stalwart', 'valiant', 'grandeur', 'clarity', 'landscape', 'canvas', 'fountain', 'monarch', 'palace', 'cascade'],
    ending: ['aurora', 'flora', 'fauna', 'arena', 'saga', 'panorama', 'vista', 'magna', 'strata', 'schema', 'nebula', 'sonata', 'drama', 'delta', 'plaza', 'opera'],
    adjectives: ['adaptable', 'ancient', 'astute', 'ambitious', 'arcane', 'astral', 'active', 'ardent', 'authentic', 'animated', 'agreeable', 'adequate', 'agile', 'abundant', 'aromatic', 'adventurous'],
    nouns: ['alchemist', 'artisan', 'astronomer', 'architect', 'aviator', 'acrobat', 'ambassador', 'apprentice', 'archaeologist', 'adventurer', 'analyst', 'athlete', 'arbiter', 'artist', 'anchor', 'agent'],
    verbs: ['analyzes', 'arranges', 'accelerates', 'admires', 'assembles', 'articulates', 'awakens', 'acquires', 'applauds', 'navigates', 'activates', 'allocates', 'advances', 'amplifies', 'ascends', 'adapts'],
    adverbs: ['always', 'accurately', 'astutely', 'admirably', 'actively', 'ardently', 'adeptly', 'alertly', 'anxiously', 'authentically', 'agreeably', 'audaciously', 'abundantly', 'artfully', 'assuredly', 'ably']
  },
  'B': {
    beginning: ['bold', 'brave', 'bright', 'brilliant', 'bountiful', 'buoyant', 'brisk', 'benevolent', 'broad', 'bronze', 'breathtaking', 'balanced', 'boundless', 'blossoming', 'blooming', 'beaming'],
    middle: ['harbor', 'marble', 'timber', 'cabin', 'pebble', 'bubble', 'embrace', 'symbol', 'sober', 'tribal', 'amber', 'labyrinth', 'reboot', 'noble', 'robust', 'sublime'],
    ending: ['climb', 'crumb', 'tomb', 'plumb', 'bomb', 'lamb', 'comb', 'dumb', 'hub', 'shrub', 'club', 'scrub', 'curb', 'orb', 'verb', 'bulb'],
    adjectives: ['brave', 'bold', 'brilliant', 'bountiful', 'buoyant', 'brisk', 'benevolent', 'broad', 'bronze', 'balanced', 'boundless', 'beautiful', 'bright', 'breathtaking', 'blithe', 'boreal'],
    nouns: ['baker', 'blacksmith', 'biologist', 'baron', 'builder', 'botanist', 'boatman', 'barber', 'beekeeper', 'brother', 'badger', 'beacon', 'boulder', 'bridge', 'bastion', 'browser'],
    verbs: ['builds', 'bakes', 'balances', 'braves', 'blends', 'bestows', 'broadcasts', 'beholds', 'brightens', 'bolsters', 'boosts', 'burrows', 'breathes', 'beckons', 'binds', 'branches'],
    adverbs: ['boldly', 'briskly', 'bravely', 'brilliantly', 'blithely', 'benevolently', 'bountifully', 'buoyantly', 'beautifully', 'brightly', 'breathlessly', 'boundlessly', 'broadly', 'blissfully', 'best', 'beyond']
  },
  'C': {
    beginning: ['clever', 'curious', 'creative', 'courageous', 'calm', 'crystalline', 'cosmic', 'celestial', 'classic', 'cooperative', 'clear', 'candid', 'careful', 'captivating', 'crisp', 'certain'],
    middle: ['secret', 'beacon', 'ancient', 'glacier', 'falcon', 'picture', 'anchor', 'circle', 'matrix', 'echo', 'arctic', 'spectacle', 'lucid', 'arcade', 'pacific', 'succinct'],
    ending: ['magic', 'music', 'cosmic', 'classic', 'epic', 'logic', 'lyric', 'mosaic', 'tropic', 'rustic', 'dynamic', 'pacific', 'mimic', 'relic', 'chronic', 'panoramic'],
    adjectives: ['clever', 'curious', 'creative', 'courageous', 'calm', 'crystalline', 'cosmic', 'celestial', 'classic', 'cooperative', 'captivating', 'crisp', 'capable', 'concentric', 'careful', 'candid'],
    nouns: ['captain', 'cartographer', 'craftsman', 'chemist', 'curator', 'clockmaker', 'climber', 'composer', 'courier', 'cadet', 'counselor', 'creator', 'citizen', 'cook', 'champion', 'companion'],
    verbs: ['creates', 'charts', 'commands', 'crafts', 'captures', 'calibrates', 'connects', 'celebrates', 'cultivates', 'conquers', 'combines', 'catalogues', 'carves', 'cooperates', 'conducts', 'checks'],
    adverbs: ['carefully', 'calmly', 'clearly', 'cleverly', 'courageously', 'creatively', 'constantly', 'cooperatively', 'crisply', 'captivatingly', 'critically', 'candidly', 'confidently', 'closely', 'correctly', 'cheerfully']
  },
  'D': {
    beginning: ['daring', 'dynamic', 'dedicated', 'diligent', 'distinct', 'dazzling', 'decisive', 'delightful', 'detailed', 'delicate', 'durable', 'diplomatic', 'disciplined', 'devoted', 'deep', 'diverse'],
    middle: ['meadow', 'shadow', 'cradle', 'spider', 'leader', 'garden', 'bridge', 'puddle', 'modern', 'ladder', 'border', 'candle', 'bandit', 'glider', 'order', 'hidden'],
    ending: ['grand', 'world', 'island', 'shield', 'sound', 'mind', 'fluid', 'cloud', 'friend', 'speed', 'field', 'strand', 'ground', 'proud', 'shard', 'sword'],
    adjectives: ['daring', 'dynamic', 'dedicated', 'diligent', 'distinct', 'dazzling', 'decisive', 'delightful', 'detailed', 'delicate', 'durable', 'diplomatic', 'disciplined', 'devoted', 'deep', 'diverse'],
    nouns: ['diver', 'detective', 'doctor', 'diplomat', 'draftsman', 'designer', 'director', 'discoverer', 'dancer', 'defender', 'drummer', 'dealer', 'driver', 'dreamer', 'druid', 'delegate'],
    verbs: ['discovers', 'designs', 'demonstrates', 'decodes', 'directs', 'delivers', 'develops', 'defends', 'defines', 'distributes', 'draws', 'drives', 'determines', 'delights', 'documents', 'debates'],
    adverbs: ['daringly', 'diligently', 'decisively', 'dynamically', 'distinctly', 'deliberately', 'delightfully', 'deeply', 'directly', 'devotedly', 'dutifully', 'dramatically', 'durably', 'daily', 'deftly', 'definitively']
  },
  'E': {
    beginning: ['eager', 'earnest', 'efficient', 'elegant', 'eloquent', 'eminent', 'enduring', 'energetic', 'enlightened', 'enterprising', 'epic', 'equitable', 'essential', 'ethical', 'evident', 'exemplary'],
    middle: ['seeker', 'deepest', 'breeze', 'secret', 'revere', 'zenith', 'forest', 'sphere', 'temple', 'serene', 'vessel', 'desert', 'legend', 'talent', 'beacon', 'element'],
    ending: ['serene', 'sublime', 'grace', 'nature', 'empire', 'glance', 'silence', 'balance', 'zenith', 'radiance', 'vibe', 'tribute', 'palace', 'voyage', 'miracle', 'oracle'],
    adjectives: ['eager', 'earnest', 'efficient', 'elegant', 'eloquent', 'eminent', 'enduring', 'energetic', 'enlightened', 'enterprising', 'equitable', 'exemplary', 'exquisite', 'extraordinary', 'empathetic', 'erudite'],
    nouns: ['explorer', 'engineer', 'educator', 'economist', 'ecologist', 'electrician', 'editor', 'emperor', 'enthusiast', 'expert', 'examiner', 'executor', 'elder', 'envoy', 'entrepreneur', 'element'],
    verbs: ['explores', 'examines', 'evaluates', 'energizes', 'elevates', 'encourages', 'establishes', 'emphasizes', 'enhances', 'expedites', 'embarks', 'enlightens', 'enriches', 'exceeds', 'executes', 'echoes'],
    adverbs: ['eagerly', 'earnestly', 'efficiently', 'elegantly', 'eloquently', 'eminently', 'endlessly', 'energetically', 'equitably', 'essentially', 'ethically', 'evidentially', 'exemplarily', 'exquisitely', 'easily', 'exactly']
  },
  'F': {
    beginning: ['fearless', 'fluid', 'focused', 'formidable', 'fortunate', 'fragrant', 'friendly', 'fundamental', 'futuristic', 'famous', 'faithful', 'fascinating', 'favorable', 'festive', 'flawless', 'flexible'],
    middle: ['effort', 'differ', 'swiftly', 'infinite', 'refined', 'profound', 'drifting', 'crafty', 'safari', 'surface', 'comfort', 'preface', 'defense', 'benefit', 'artful', 'profile'],
    ending: ['cliff', 'staff', 'grief', 'relief', 'tariff', 'motif', 'belief', 'sheriff', 'plaintiff', 'bailiff', 'whiff', 'surf', 'chief', 'brief', 'bluff', 'dwarf'],
    adjectives: ['fearless', 'fluid', 'focused', 'formidable', 'fragrant', 'friendly', 'futuristic', 'fascinating', 'flawless', 'flexible', 'formidable', 'fervent', 'fresh', 'fine', 'faithful', 'flowing'],
    nouns: ['forester', 'falconer', 'firefighter', 'philosopher', 'founder', 'fellow', 'farmer', 'fisherman', 'forger', 'financier', 'first-mate', 'frontrunner', 'flutist', 'friend', 'follower', 'fiddler'],
    verbs: ['fosters', 'forges', 'forms', 'focuses', 'facilitates', 'features', 'fulfills', 'furnishes', 'functions', 'flows', 'finds', 'frames', 'fixes', 'filters', 'fortifies', 'fashions'],
    adverbs: ['faithfully', 'famously', 'fascinatingly', 'fearlessly', 'fervently', 'finely', 'flawlessly', 'flexibly', 'fluently', 'fluidly', 'fondly', 'forcefully', 'formidably', 'fortunately', 'frequently', 'fully']
  },
  'G': {
    beginning: ['gallant', 'generous', 'genuine', 'gigantic', 'glamorous', 'gleaming', 'glorious', 'golden', 'graceful', 'gracious', 'grand', 'grateful', 'great', 'green', 'groundbreaking', 'guiding'],
    middle: ['bright', 'engine', 'signal', 'dragon', 'legacy', 'magnet', 'figure', 'pilgrim', 'knight', 'legend', 'jungle', 'starlight', 'program', 'fragile', 'target', 'dialogue'],
    ending: ['spring', 'wing', 'song', 'ring', 'strong', 'along', 'belong', 'morning', 'evening', 'sparkling', 'shining', 'building', 'king', 'bring', 'fang', 'gang'],
    adjectives: ['gallant', 'generous', 'genuine', 'gigantic', 'gleaming', 'glorious', 'golden', 'graceful', 'gracious', 'grand', 'grateful', 'great', 'green', 'groundbreaking', 'guiding', 'gentle'],
    nouns: ['guardian', 'geologist', 'gardener', 'general', 'guide', 'governor', 'genius', 'glider', 'gatherer', 'grocer', 'geographer', 'giant', 'guest', 'gemologist', 'guildmaster', 'gymnast'],
    verbs: ['guides', 'gathers', 'generates', 'governs', 'grasps', 'greets', 'guards', 'gains', 'gives', 'glides', 'glows', 'graces', 'grants', 'grounds', 'grows', 'guarantees'],
    adverbs: ['gallantly', 'generously', 'genuinely', 'gently', 'gladly', 'gleefully', 'gloriously', 'gracefully', 'graciously', 'grandly', 'gratefully', 'greatly', 'grippingly', 'groundedly', 'guardedly', 'guidance-wise']
  },
  'H': {
    beginning: ['harmonious', 'heroic', 'historic', 'honest', 'hopeful', 'hospitable', 'humble', 'humorous', 'hyper', 'healthy', 'hearty', 'helpful', 'highest', 'honorable', 'healing', 'heavenly'],
    middle: ['echo', 'rhythm', 'sphere', 'monarch', 'alchemy', 'python', 'orchid', 'anchor', 'pathway', 'cohesion', 'author', 'method', 'cathedral', 'ethos', 'fashion', 'whisper'],
    ending: ['path', 'truth', 'earth', 'worth', 'zenith', 'depth', 'breath', 'growth', 'faith', 'youth', 'wealth', 'health', 'north', 'south', 'month', 'fourth'],
    adjectives: ['harmonious', 'heroic', 'historic', 'honest', 'hopeful', 'hospitable', 'humble', 'humorous', 'healthy', 'hearty', 'helpful', 'honorable', 'healing', 'heavenly', 'holistic', 'hardy'],
    nouns: ['historian', 'healer', 'herald', 'hero', 'horticulturist', 'harvester', 'hunter', 'host', 'humanitarian', 'headmaster', 'harbor-master', 'herbalist', 'hiker', 'helmsman', 'hacker', 'helper'],
    verbs: ['harmonizes', 'heals', 'heralds', 'helps', 'honors', 'hosts', 'harnesses', 'heightens', 'holds', 'hones', 'houses', 'heeds', 'harvests', 'hails', 'handles', 'highlights'],
    adverbs: ['harmoniously', 'heartily', 'heavily', 'helpfully', 'heroically', 'highly', 'historically', 'honestly', 'honorably', 'hopefully', 'hospitably', 'hourly', 'humbly', 'humorously', 'hurriedly', 'hygienically']
  },
  'I': {
    beginning: ['illustrious', 'imaginative', 'immense', 'impartial', 'impeccable', 'important', 'impressive', 'incisive', 'inclusive', 'incomparable', 'incredible', 'indefatigable', 'independent', 'indispensable', 'industrious', 'influential'],
    middle: ['brilliant', 'radiant', 'pristine', 'infinite', 'divine', 'clarity', 'engine', 'spirit', 'zenith', 'music', 'vision', 'glacier', 'matrix', 'crystal', 'horizon', 'insight'],
    ending: ['ski', 'safari', 'origami', 'alibi', 'bikini', 'tsunami', 'khaki', 'confetti', 'graffiti', 'macaroni', 'spaghetti', 'broccoli', 'zucchini', 'corgi', 'yeti', 'swahili'],
    adjectives: ['illustrious', 'imaginative', 'immense', 'impartial', 'impeccable', 'important', 'impressive', 'incisive', 'inclusive', 'incomparable', 'incredible', 'independent', 'industrious', 'influential', 'ingenious', 'innovative'],
    nouns: ['inventor', 'inspector', 'instructor', 'illustrator', 'investigator', 'interpreter', 'innovator', 'intellectual', 'idealist', 'icon', 'individual', 'infantryman', 'intern', 'islander', 'idol', 'initiator'],
    verbs: ['illuminates', 'illustrates', 'imagines', 'implements', 'impresses', 'improves', 'includes', 'incorporates', 'increases', 'indicates', 'influences', 'informs', 'initiates', 'innovates', 'inspects', 'inspires'],
    adverbs: ['ideally', 'illustriously', 'imaginatively', 'immensely', 'impartially', 'impeccably', 'impressively', 'incisively', 'inclusively', 'incomparably', 'incredibly', 'independently', 'industriously', 'influentially', 'ingeniously', 'initially']
  },
  'J': {
    beginning: ['jubilant', 'judicious', 'jumpy', 'just', 'jaunty', 'jovial', 'joyful', 'joyous', 'jovian', 'jurisprudent', 'juggernaut', 'junction', 'jungle', 'juniper', 'jeweled', 'journalistic'],
    middle: ['major', 'project', 'object', 'subject', 'trajectory', 'enjoy', 'adjourn', 'conjecture', 'rejoice', 'majesty', 'abject', 'eject', 'deject', 'inject', 'interject', 'projector'],
    ending: ['hajj', 'raj', 'hadj', 'sovkhoz', 'kolkhoz', 'taj', 'swaraj', 'allege', 'badge', 'edge', 'hedge', 'wedge', 'ledge', 'ridge', 'bridge', 'lodge'],
    adjectives: ['jubilant', 'judicious', 'jaunty', 'jovial', 'joyful', 'joyous', 'jovian', 'just', 'jeweled', 'journalistic', 'joined', 'joint', 'juicy', 'jumbo', 'juridical', 'jutting'],
    nouns: ['judge', 'journalist', 'juggler', 'jeweler', 'juror', 'jockey', 'joiner', 'journeyman', 'jester', 'justice', 'janitor', 'jumper', 'jurisconsult', 'junior', 'janissary', 'jurisprudent'],
    verbs: ['judges', 'joins', 'journeys', 'jubilates', 'juggles', 'justifies', 'juxtaposes', 'jumps', 'jams', 'jots', 'jolts', 'jockeys', 'jests', 'jingles', 'jets', 'jousts'],
    adverbs: ['jauntily', 'jealously', 'jestingly', 'jocularly', 'jointly', 'jovially', 'joyfully', 'joylessly', 'joyously', 'jubilantly', 'judiciously', 'juridically', 'justifiably', 'justly', 'keenly', 'knowingly']
  },
  'K': {
    beginning: ['keen', 'kinetic', 'kind', 'kindred', 'kingly', 'knight', 'knowledgeable', 'known', 'kempt', 'knavish', 'kaleidoscopic', 'key', 'kith', 'keystone', 'kernel', 'kudos'],
    middle: ['baker', 'seeker', 'market', 'blanket', 'anchor', 'basket', 'rocket', 'cricket', 'sparkle', 'picket', 'pocket', 'ticket', 'packet', 'socket', 'jacket', 'bucket'],
    ending: ['look', 'book', 'took', 'cook', 'hook', 'shook', 'brook', 'crook', 'nook', 'peak', 'seek', 'week', 'creek', 'meek', 'sleek', 'break'],
    adjectives: ['keen', 'kinetic', 'kind', 'kindred', 'kingly', 'knowledgeable', 'kaleidoscopic', 'key', 'knightly', 'knotty', 'kempt', 'knowing', 'kithful', 'kosher', 'krypton-bright', 'karmic'],
    nouns: ['knight', 'king', 'keeper', 'kin', 'kayaker', 'kettle-maker', 'karateka', 'kitchener', 'kinsman', 'keysmith', 'kiosk-keeper', 'knot-tier', 'kaleidoscope', 'kernel', 'keynote', 'kite-flyer'],
    verbs: ['keeps', 'knows', 'knits', 'kindles', 'kneads', 'knocks', 'keys', 'kicks', 'kisses', 'kidnaps', 'kneels', 'knots', 'knifes', 'knuckles', 'kvetches', 'keels'],
    adverbs: ['keenly', 'kindly', 'kinetically', 'kingly', 'knightly', 'knowingly', 'knowledgeably', 'kemptly', 'karmically', 'kaleidoscopically', 'keen-eyed', 'kindheartedly', 'kith-wise', 'knot-wise', 'kudos-wise', 'knavishly']
  },
  'L': {
    beginning: ['laudable', 'lavish', 'leading', 'learned', 'legendary', 'legitimate', 'liberal', 'liberating', 'light', 'limpid', 'linear', 'literary', 'logical', 'luminous', 'lush', 'lyrical'],
    middle: ['splendid', 'flawless', 'glory', 'silver', 'balance', 'clarity', 'temple', 'pillar', 'realm', 'flame', 'valiant', 'gallant', 'solar', 'polar', 'stellar', 'lunar'],
    ending: ['crystal', 'portal', 'signal', 'coral', 'spiral', 'metal', 'pedal', 'fossil', 'vessel', 'tunnel', 'marvel', 'model', 'panel', 'level', 'novel', 'jewel'],
    adjectives: ['laudable', 'lavish', 'leading', 'learned', 'legendary', 'legitimate', 'liberal', 'light', 'limpid', 'linear', 'literary', 'logical', 'luminous', 'lush', 'lyrical', 'loyal'],
    nouns: ['leader', 'linguist', 'librarian', 'logician', 'lawyer', 'landscaper', 'luminary', 'laborer', 'lieutenant', 'lecturer', 'locksmith', 'lyricist', 'locust', 'loris', 'lynx', 'lark'],
    verbs: ['leads', 'learns', 'liberates', 'lights', 'links', 'listens', 'lives', 'locates', 'looks', 'loves', 'launches', 'levels', 'leverages', 'limits', 'lines', 'lists'],
    adverbs: ['laudably', 'lavishly', 'learnedly', 'legitimately', 'liberally', 'lightly', 'linearly', 'literarily', 'logically', 'loyally', 'lucidly', 'luminously', 'lushly', 'lyrically', 'largely', 'lastly']
  },
  'M': {
    beginning: ['magical', 'magnificent', 'majestic', 'major', 'malleable', 'manifest', 'marvelous', 'masterful', 'masterly', 'material', 'mature', 'maximal', 'meaningful', 'measured', 'melodious', 'memorable'],
    middle: ['summer', 'symbol', 'hammer', 'timber', 'glamour', 'flame', 'pyramid', 'harmony', 'dynamic', 'cosmic', 'atomic', 'calm', 'alms', 'realm', 'film', 'balm'],
    ending: ['calm', 'palm', 'balm', 'realm', 'film', 'album', 'rhythm', 'custom', 'wisdom', 'freedom', 'kingdom', 'bloom', 'gleam', 'beam', 'stream', 'dream'],
    adjectives: ['magical', 'magnificent', 'majestic', 'major', 'manifest', 'marvelous', 'masterful', 'mature', 'meaningful', 'measured', 'melodious', 'memorable', 'merciful', 'methodical', 'meticulous', 'mighty'],
    nouns: ['master', 'magician', 'mathematician', 'mechanic', 'mediator', 'mentor', 'merchant', 'messenger', 'meteorologist', 'miner', 'minister', 'monarch', 'musician', 'mystic', 'marshal', 'mason'],
    verbs: ['makes', 'manages', 'manifests', 'manipulates', 'maps', 'marches', 'marks', 'marshals', 'marvels', 'masters', 'matches', 'measures', 'mediates', 'melts', 'mentors', 'merges'],
    adverbs: ['magically', 'magnificently', 'majestically', 'markedly', 'marvelously', 'masterfully', 'materially', 'maturely', 'maximally', 'meaningfully', 'measuredly', 'melodiously', 'memorably', 'mercifully', 'methodically', 'meticulously']
  },
  'N': {
    beginning: ['national', 'native', 'natural', 'navigable', 'neat', 'necessary', 'neighborly', 'neoteric', 'nestled', 'neural', 'new', 'nimble', 'noble', 'nocturnal', 'nominal', 'nonpareil'],
    middle: ['candle', 'banner', 'planet', 'ancient', 'genius', 'dynasty', 'tunnel', 'channel', 'signal', 'mineral', 'corner', 'wonder', 'manner', 'pioneer', 'spinner', 'winner'],
    ending: ['ocean', 'horizon', 'vision', 'fountain', 'mountain', 'canyon', 'beacon', 'lesson', 'season', 'dragon', 'falcon', 'lion', 'sun', 'moon', 'rain', 'train'],
    adjectives: ['natural', 'navigable', 'neat', 'necessary', 'neighborly', 'neural', 'new', 'nimble', 'noble', 'nocturnal', 'notable', 'noteworthy', 'novel', 'nurturing', 'numerous', 'native'],
    nouns: ['navigator', 'naturalist', 'neighbor', 'nobleman', 'novelist', 'numismatist', 'nurse', 'nurturer', 'newscaster', 'notary', 'nomad', 'ninja', 'narrator', 'networker', 'neuroscientist', 'naturalist'],
    verbs: ['navigates', 'nurtures', 'notes', 'notices', 'nourishes', 'names', 'narrates', 'narrows', 'negotiates', 'nests', 'nets', 'networks', 'neutralizes', 'nods', 'normalizes', 'numbers'],
    adverbs: ['naturally', 'neatly', 'necessarily', 'neighborly', 'nervously', 'neutrally', 'newly', 'nicely', 'nimbly', 'nobly', 'nocturnally', 'nominally', 'normally', 'notably', 'noticeably', 'novel-wise']
  },
  'O': {
    beginning: ['objective', 'obliging', 'observant', 'obtainable', 'obvious', 'oceanic', 'odd', 'official', 'omnipotent', 'omnipresent', 'omniscient', 'open', 'operatic', 'opportune', 'optimal', 'opulent'],
    middle: ['glorious', 'harmonious', 'cosmic', 'motion', 'horizon', 'glory', 'story', 'memory', 'melody', 'iron', 'ivory', 'forest', 'echo', 'chariot', 'robot', 'pilot'],
    ending: ['echo', 'halo', 'hero', 'zero', 'cacao', 'piano', 'ratio', 'studio', 'tempo', 'torso', 'trio', 'volcano', 'avocado', 'cappuccino', 'origami', 'indigo'],
    adjectives: ['objective', 'observant', 'obtainable', 'oceanic', 'omnipresent', 'open', 'opportune', 'optimal', 'opulent', 'oratorical', 'orbiting', 'orderly', 'organic', 'original', 'ornate', 'orthodox'],
    nouns: ['officer', 'operator', 'optimist', 'orator', 'orchestrator', 'organizer', 'originator', 'ornithologist', 'osteopath', 'outdoorsman', 'overseer', 'owner', 'observer', 'optician', 'oceanographer', 'originator'],
    verbs: ['observes', 'obtains', 'occupies', 'occurs', 'offers', 'officiates', 'opens', 'operates', 'opines', 'orchestrates', 'orders', 'organizes', 'originates', 'outlines', 'overcomes', 'oversees'],
    adverbs: ['objectively', 'obligingly', 'observantly', 'obviously', 'occasionally', 'officially', 'ominously', 'openly', 'opportunely', 'optimally', 'optimistically', 'opulently', 'orally', 'orderly', 'ordinarily', 'originally']
  },
  'P': {
    beginning: ['pacific', 'paramount', 'passionate', 'patient', 'peaceful', 'peerless', 'perceptive', 'perfect', 'persevering', 'persistent', 'philosophical', 'pioneering', 'pleasant', 'poetic', 'poised', 'polished'],
    middle: ['sphere', 'empire', 'temple', 'maple', 'captain', 'optics', 'aspect', 'scepter', 'copper', 'whisper', 'rapture', 'leopard', 'eclipse', 'sapphire', 'triumph', 'campus'],
    ending: ['deep', 'leap', 'steep', 'reap', 'heap', 'keep', 'peep', 'weep', 'sleep', 'creep', 'sheep', 'sweep', 'camp', 'lamp', 'stamp', 'clamp'],
    adjectives: ['pacific', 'paramount', 'passionate', 'patient', 'peaceful', 'peerless', 'perceptive', 'perfect', 'persevering', 'persistent', 'philosophical', 'pioneering', 'pleasant', 'poetic', 'poised', 'polished'],
    nouns: ['painter', 'paladin', 'paragon', 'partner', 'pathfinder', 'patron', 'philosopher', 'physician', 'physicist', 'pilot', 'pioneer', 'planner', 'playwright', 'poet', 'politician', 'potter'],
    verbs: ['paints', 'pairs', 'participates', 'passes', 'pays', 'performs', 'persuades', 'photographs', 'picks', 'pilots', 'pioneers', 'places', 'plans', 'plays', 'pleases', 'points'],
    adverbs: ['pacifically', 'painstakingly', 'particularly', 'passionately', 'patiently', 'peacefully', 'peerlessly', 'perfectly', 'periodically', 'persistently', 'personally', 'philosophically', 'picturesquely', 'pioneeringly', 'plainly', 'plentifully']
  },
  'Q': {
    beginning: ['quaint', 'qualified', 'qualitative', 'quantitative', 'queenly', 'quick', 'quiescent', 'quiet', 'quintessential', 'quirky', 'quixotic', 'quotable', 'queen', 'quest', 'quiver', 'quarry'],
    middle: ['equal', 'unique', 'liquid', 'sequel', 'opaque', 'torque', 'frequent', 'conquest', 'inquire', 'require', 'acquire', 'adequate', 'eloquent', 'ubiquitous', 'tranquil', 'equator'],
    ending: ['opaque', 'antique', 'unique', 'technique', 'critique', 'boutique', 'physique', 'mystique', 'picturesque', 'grotesque', 'baroque', 'plaque', 'clique', 'cinq', 'tuque', 'toque'],
    adjectives: ['quaint', 'qualified', 'qualitative', 'quantitative', 'queenly', 'quick', 'quick-witted', 'quiescent', 'quiet', 'quintessential', 'quirky', 'quixotic', 'quotable', 'questing', 'quenched', 'quantum'],
    nouns: ['queen', 'quarryman', 'quarterback', 'quartermaster', 'questor', 'quizmaster', 'quoter', 'quill-maker', 'quantum-physicist', 'quarry-owner', 'quick-thinker', 'quality-inspector', 'quintet', 'quorum', 'querist', 'quester'],
    verbs: ['qualifies', 'quantifies', 'quells', 'quenches', 'queries', 'questions', 'quickens', 'quiets', 'quilts', 'quips', 'quivers', 'quotes', 'quests', 'quadruples', 'quarantines', 'quarrels'],
    adverbs: ['quaintly', 'qualifiedly', 'qualitatively', 'quantitatively', 'quarterly', 'queenly', 'queerly', 'quenchlessly', 'querulously', 'questionably', 'questioningly', 'quickly', 'quick-wittedly', 'quietly', 'quintessentially', 'quirkily']
  },
  'R': {
    beginning: ['radiant', 'radical', 'rapid', 'rational', 'ready', 'real', 'reasonable', 'receptive', 'refined', 'reflective', 'regal', 'reliable', 'remarkable', 'renowned', 'resilient', 'resplendent'],
    middle: ['spring', 'stream', 'crystal', 'forest', 'harbor', 'spirit', 'glorious', 'marvel', 'starlight', 'garden', 'bridge', 'paradise', 'serene', 'horizon', 'matrix', 'pillar'],
    ending: ['star', 'solar', 'lunar', 'polar', 'radar', 'cedar', 'altar', 'avatar', 'nectar', 'bazaar', 'guitar', 'pillar', 'dollar', 'cellar', 'collar', 'scholar'],
    adjectives: ['radiant', 'radical', 'rapid', 'rational', 'ready', 'real', 'reasonable', 'receptive', 'refined', 'reflective', 'regal', 'reliable', 'remarkable', 'renowned', 'resilient', 'resplendent'],
    nouns: ['ranger', 'reader', 'rebel', 'recorder', 'referee', 'reformer', 'regent', 'relative', 'repairer', 'reporter', 'researcher', 'resident', 'responder', 'restorer', 'reviewer', 'rider'],
    verbs: ['radiates', 'raises', 'reaches', 'reacts', 'reads', 'realizes', 'receives', 'recognizes', 'recommends', 'records', 'recovers', 'recruits', 'redesigns', 'refines', 'reflects', 'reforms'],
    adverbs: ['radiantly', 'radically', 'rapidly', 'rarely', 'rationally', 'readily', 'realistically', 'really', 'reasonably', 'receptively', 'recently', 'recklessly', 'refinedly', 'reflectively', 'regally', 'regularly']
  },
  'S': {
    beginning: ['sagacious', 'sage', 'saintly', 'salubrious', 'salutary', 'sanguine', 'sapient', 'scholarly', 'scientific', 'scintillating', 'scrupulous', 'seamless', 'seasoned', 'secure', 'sedulous', 'select'],
    middle: ['whisper', 'blossom', 'passage', 'castle', 'vessel', 'crystal', 'island', 'master', 'foster', 'listen', 'fasten', 'custom', 'system', 'wisdom', 'oasis', 'prism'],
    ending: ['oasis', 'genesis', 'nemesis', 'crisis', 'thesis', 'analysis', 'synopsis', 'canvas', 'atlas', 'compass', 'glass', 'grass', 'brass', 'moss', 'boss', 'loss'],
    adjectives: ['sagacious', 'sage', 'saintly', 'scholarly', 'scientific', 'scintillating', 'scrupulous', 'seamless', 'seasoned', 'secure', 'sedulous', 'select', 'selfless', 'sensational', 'sensible', 'sensitive'],
    nouns: ['sailor', 'saint', 'scholar', 'scientist', 'sculptor', 'seeker', 'senator', 'sentinel', 'servant', 'settler', 'shepherd', 'sheriff', 'singer', 'soldier', 'sorcerer', 'sovereign'],
    verbs: ['sails', 'saves', 'says', 'scans', 'schedules', 'scores', 'scouts', 'screens', 'sculpts', 'seals', 'searches', 'secures', 'sees', 'seeks', 'selects', 'sends'],
    adverbs: ['sagaciously', 'sagely', 'saintly', 'salubriously', 'sanely', 'sanguinely', 'sarcastically', 'satisfactorily', 'scarcely', 'scenically', 'scholarly', 'scientifically', 'scintillatingly', 'scrupulously', 'seamlessly', 'seasonally']
  },
  'T': {
    beginning: ['tactful', 'talented', 'tangible', 'tasteful', 'tenacious', 'tender', 'terrific', 'therapeutic', 'thorough', 'thoughtful', 'thriving', 'tidy', 'timeless', 'tireless', 'tolerant', 'top-notch'],
    middle: ['starlight', 'fountain', 'matrix', 'crystal', 'portal', 'castle', 'nature', 'artist', 'master', 'pattern', 'water', 'city', 'winter', 'autumn', 'petal', 'metal'],
    ending: ['zenith', 'summit', 'spirit', 'planet', 'comet', 'forest', 'craft', 'light', 'night', 'flight', 'sight', 'bright', 'delight', 'knight', 'height', 'weight'],
    adjectives: ['tactful', 'talented', 'tangible', 'tasteful', 'tenacious', 'tender', 'terrific', 'thorough', 'thoughtful', 'thriving', 'tidy', 'timeless', 'tireless', 'tolerant', 'trailblazing', 'tranquil'],
    nouns: ['tailor', 'teacher', 'technician', 'thinker', 'tourist', 'trader', 'trainer', 'traitor', 'traveler', 'treasurer', 'tribune', 'trooper', 'trustee', 'tutor', 'tycoon', 'typist'],
    verbs: ['takes', 'talks', 'tames', 'targets', 'tastes', 'teaches', 'tells', 'tends', 'tests', 'thanks', 'thinks', 'thrives', 'throws', 'ties', 'times', 'titles'],
    adverbs: ['tactfully', 'talentedly', 'tangibly', 'tastefully', 'technically', 'temporarily', 'tenaciously', 'tenderly', 'terrificaly', 'theoretically', 'thoroughly', 'thoughtfully', 'thriving-wise', 'tidily', 'timelessly', 'tirelessly']
  },
  'U': {
    beginning: ['ultimate', 'unabashed', 'unanimous', 'unassuming', 'unbiased', 'unbreakable', 'uncommon', 'undaunted', 'undeniable', 'understated', 'understanding', 'undivided', 'unequivocal', 'unfailing', 'unflappable', 'unfettered'],
    middle: ['flute', 'plume', 'nature', 'future', 'sculpture', 'treasure', 'pleasure', 'measure', 'autumn', 'column', 'tribute', 'minute', 'statue', 'virtue', 'avenue', 'rescue'],
    ending: ['guru', 'menu', 'bayou', 'plateau', 'chateau', 'bureau', 'taboo', 'voodoo', 'flu', 'emu', 'gnu', 'tofu', 'judo', 'kudu', 'subaru', 'zulu'],
    adjectives: ['ultimate', 'unanimous', 'unassuming', 'unbiased', 'unbreakable', 'uncommon', 'undaunted', 'undeniable', 'understanding', 'undivided', 'unequivocal', 'unfailing', 'unflappable', 'unfettered', 'unique', 'universal'],
    nouns: ['umpire', 'uncle', 'understudy', 'undertaker', 'underwriter', 'unifier', 'unionist', 'universalist', 'university-dean', 'urologist', 'usher', 'utilitarian', 'utopian', 'uvula-specialist', 'urchin', 'unicyclist'],
    verbs: ['undergoes', 'understands', 'undertakes', 'unfolds', 'unifies', 'unites', 'unleashes', 'unlocks', 'unmasks', 'unpacks', 'unrolls', 'unveils', 'upgrades', 'upholds', 'uplifts', 'urges'],
    adverbs: ['ultimately', 'unabashedly', 'unanimously', 'unassuming-wise', 'unbiasedly', 'unbreakably', 'uncommonly', 'undauntedly', 'undeniably', 'understandably', 'understandingly', 'undividedly', 'unequivocally', 'unfailingly', 'uniquely', 'universally']
  },
  'V': {
    beginning: ['valiant', 'valid', 'valorous', 'valuable', 'venerable', 'veracious', 'verifiable', 'versatile', 'versed', 'veteran', 'viable', 'vibrant', 'victorious', 'vigilant', 'vigorous', 'vintage'],
    middle: ['silver', 'river', 'haven', 'clover', 'tavern', 'universe', 'canvas', 'harvest', 'traveler', 'discovery', 'deliver', 'governor', 'service', 'movement', 'bravery', 'flavor'],
    ending: ['rev', 'lev', 'shiv', 'slav', 'moshav', 'kibbutz-sov', 'maglev', 'prokofiev', 'chekhov', 'turgenev', 'gorbachev', 'molotov', 'kalashnikov', 'romanov', 'nabokov', 'kasparov'],
    adjectives: ['valiant', 'valid', 'valorous', 'valuable', 'venerable', 'veracious', 'verifiable', 'versatile', 'versed', 'veteran', 'viable', 'vibrant', 'victorious', 'vigilant', 'vigorous', 'vintage'],
    nouns: ['valet', 'valedictorian', 'validator', 'vampire-slayer', 'vanguard', 'vanquisher', 'varnisher', 'veteran', 'veterinarian', 'vicar', 'victor', 'videographer', 'vigilante', 'viking', 'villager', 'violinist'],
    verbs: ['validates', 'values', 'vanquishes', 'varies', 'vaults', 'vectors', 'veils', 'venerates', 'ventures', 'verbalizes', 'verifies', 'vets', 'vibrates', 'views', 'vindicates', 'visits'],
    adverbs: ['valiantly', 'validly', 'valorously', 'valuably', 'venerably', 'veraciously', 'verifiably', 'verily', 'versatilely', 'vibrantly', 'victoriously', 'vigilantly', 'vigorously', 'virtually', 'virtuously', 'visibly']
  },
  'W': {
    beginning: ['warm', 'watchful', 'welcoming', 'well-read', 'whimsical', 'wholesome', 'wide-awake', 'wieldy', 'willing', 'winsome', 'wise', 'witty', 'wizardly', 'wonderful', 'wondrous', 'worthy'],
    middle: ['pathway', 'skyward', 'foreword', 'steward', 'highway', 'drawbridge', 'snowstorm', 'sunflower', 'firewood', 'clockwise', 'backward', 'forward', 'downward', 'upward', 'inward', 'outward'],
    ending: ['flow', 'glow', 'grow', 'slow', 'blow', 'snow', 'show', 'know', 'throw', 'shadow', 'meadow', 'window', 'yellow', 'narrow', 'fellow', 'willow'],
    adjectives: ['warm', 'watchful', 'welcoming', 'whimsical', 'wholesome', 'wide-awake', 'willing', 'winsome', 'wise', 'witty', 'wizardly', 'wonderful', 'wondrous', 'world-class', 'worthy', 'worthwhile'],
    nouns: ['walker', 'wanderer', 'warden', 'warrior', 'watchmaker', 'watchman', 'waterman', 'weaver', 'welder', 'wheelwright', 'whistler', 'winemaker', 'winner', 'witch', 'wizard', 'woodworker'],
    verbs: ['walks', 'wanders', 'wants', 'warms', 'warns', 'washes', 'watches', 'waters', 'waves', 'wears', 'weaves', 'welcomes', 'whispers', 'whistles', 'wins', 'wishes'],
    adverbs: ['warmly', 'watchfully', 'warily', 'waywardly', 'weakly', 'wealthily', 'wearily', 'welcomingly', 'well', 'whimsically', 'wholly', 'wholesomely', 'wickedly', 'widely', 'wildly', 'willingly']
  },
  'X': {
    beginning: ['xenial', 'xenolithic', 'xenomorphic', 'xerarch', 'xeric', 'xerographic', 'xerophytic', 'xiphoid', 'xylographic', 'xyloid', 'xylophonic', 'xenon-powered', 'x-factor', 'xanthic', 'xylitol-sweet', 'x-ray-clear'],
    middle: ['luxury', 'galaxy', 'matrix', 'maximum', 'mixture', 'oxygen', 'complex', 'context', 'execute', 'explore', 'express', 'expand', 'explain', 'example', 'examine', 'expect'],
    ending: ['apex', 'index', 'matrix', 'vortex', 'helix', 'suffix', 'prefix', 'crux', 'lynx', 'sphinx', 'onyx', 'larynx', 'pharynx', 'calyx', 'reflux', 'flux'],
    adjectives: ['xenial', 'xenolithic', 'xenomorphic', 'xeric', 'xerographic', 'xerophytic', 'xiphoid', 'xylographic', 'xyloid', 'xylophonic', 'xenial-minded', 'x-ray-precise', 'xanthic-gold', 'xenotropic', 'x-factor-rich', 'xenodochial'],
    nouns: ['xenial-host', 'xenobiologist', 'xenodiagnostic-expert', 'xenolith-collector', 'xenologist', 'xerographer', 'xerophyte-grower', 'xiphosuran-biologist', 'xylographer', 'xylophonist', 'x-ray-technician', 'xenon-researcher', 'xanthophyll-chemist', 'xenophile', 'xylotomist', 'xenolith-hunter'],
    verbs: ['x-rays', 'xerographs', 'x-factors', 'xylographs', 'xenotransplants', 'xanthates', 'xerocopies', 'xylomances', 'x-marks', 'xerotapes', 'xylophones', 'xenocrysts', 'x-checks', 'x-references', 'x-sections', 'x-ray-examines'],
    adverbs: ['xenially', 'xenogenously', 'xenolitically', 'xeric-wise', 'xerographically', 'xiphoidly', 'xylographically', 'xylophonically', 'x-factorly', 'xanthically', 'xenocrystically', 'xenomorphically', 'xenotropically', 'xenodochially', 'x-ray-wise', 'xylotomically']
  },
  'Y': {
    beginning: ['yearning', 'yeasty', 'yellow', 'yielding', 'yonder', 'young', 'youthful', 'yummy', 'yare', 'yieldable', 'young-hearted', 'yarn-spun', 'yuletide', 'yarrow-strewn', 'yolky', 'yeomanly'],
    middle: ['crystal', 'rhythm', 'pyramid', 'voyage', 'royal', 'loyal', 'beyond', 'canyon', 'bayou', 'player', 'layer', 'mayor', 'oyster', 'dynamo', 'symbol', 'mythic'],
    ending: ['joy', 'harmony', 'clarity', 'galaxy', 'liberty', 'melody', 'mystery', 'energy', 'destiny', 'infinity', 'journey', 'valley', 'day', 'way', 'ray', 'bay'],
    adjectives: ['yearning', 'yeasty', 'yellow', 'yielding', 'yonder', 'young', 'youthful', 'yummy', 'yare', 'yieldable', 'young-at-heart', 'yuletide', 'yarrow-scented', 'yeomanly', 'yarn-weaving', 'yelling'],
    nouns: ['yachtsman', 'yardmaster', 'yarn-spinner', 'yearling', 'yeoman', 'yield-manager', 'yodeler', 'yoga-master', 'yoke-maker', 'youngster', 'youth', 'yucca-grower', 'yurt-builder', 'ytterbium-chemist', 'yardstick-maker', 'yogi'],
    verbs: ['yacht-cruises', 'yanks', 'yaps', 'yawns', 'yawls', 'yaws', 'yearns', 'yeasts', 'yells', 'yellows', 'yelps', 'yields', 'yodels', 'yokes', 'youngs', 'yuletide-celebrates'],
    adverbs: ['yarely', 'year-round', 'yearningly', 'yeastily', 'yellowly', 'yieldingly', 'yonder-wise', 'youngly', 'youthfully', 'yummily', 'yawningly', 'yellingly', 'yeomanly', 'yieldably', 'yesterday-wise', 'yet-again']
  },
  'Z': {
    beginning: ['zany', 'zealous', 'zenithal', 'zero-defect', 'zero-gravity', 'zestful', 'zesty', 'zigzag', 'zillion', 'zippy', 'zodiacal', 'zonal', 'zoological', 'zygomorphic', 'zymotic', 'zest-filled'],
    middle: ['blizzard', 'horizon', 'hazard', 'puzzle', 'dazzle', 'breeze', 'bronze', 'frozen', 'wizard', 'bizarre', 'gaze', 'maze', 'prize', 'seize', 'citizen', 'trapeze'],
    ending: ['waltz', 'blitz', 'quartz', 'fizz', 'buzz', 'fuzz', 'jazz', 'whizz', 'quiz', 'fez', 'spitz', 'chintz', 'klutz', 'ritz', 'topaz', 'ersatz'],
    adjectives: ['zany', 'zealous', 'zenithal', 'zero-gravity', 'zestful', 'zesty', 'zigzag', 'zippy', 'zodiacal', 'zonal', 'zoological', 'zygomorphic', 'zymotic', 'zest-infused', 'zephyr-soft', 'zen-like'],
    nouns: ['zealot', 'zebra-keeper', 'zenith-watcher', 'zeppelin-pilot', 'zero-engineer', 'zest-collector', 'zigzag-runner', 'zinc-miner', 'zipper-maker', 'zitherist', 'zodiac-reader', 'zookeeper', 'zoologist', 'zygote-researcher', 'zymologist', 'zephyr'],
    verbs: ['zaps', 'zeros', 'zests', 'zigzags', 'zips', 'zones', 'zooms', 'zymes', 'zealously-guards', 'zeniths', 'zinc-plates', 'zither-plays', 'zodiac-charts', 'zoo-guides', 'z-curls', 'z-transforms'],
    adverbs: ['zanily', 'zealously', 'zenithally', 'zero-wise', 'zestfully', 'zestily', 'zigzaggedly', 'zippily', 'zodiacally', 'zonally', 'zoologically', 'zymotically', 'zen-wise', 'zephyr-like', 'zest-wise', 'zoomingly']
  }
};

// --------------------------------------------------------------------------
// 2. HINDI DEVANAGARI VOCABULARY BY TARGET SWAR, VYANJAN & MATRA
// --------------------------------------------------------------------------
export const HINDI_DYNAMIC_VOCAB: Record<string, HindiVocabularyCategory> = {
  'अ': {
    initial: ['अमर', 'अनंत', 'अपूर्व', 'अलौकिक', 'अभिनव', 'अनमोल', 'अतुलनीय', 'अनुपम', 'अथक', 'अटूट', 'अटल', 'अविचल', 'अद्वितीय', 'अनुकरणीय', 'अखंड', 'अमृत'],
    medial: ['सत्य', 'परम', 'कर्म', 'धर्म', 'मर्म', 'हर्ष', 'गर्व', 'सर्व', 'पर्व', 'स्पर्श', 'सफल', 'सबल', 'कमल', 'पवन', 'गगन', 'नमन'],
    final: ['मन', 'धन', 'तन', 'वन', 'जन', 'रण', 'क्षण', 'कण', 'श्रम', 'क्रम', 'दम', 'सम', 'यम', 'हम', 'सब', 'तब'],
    nouns: ['अन्वेषक', 'अध्यापक', 'अभियंता', 'अधिकारी', 'अनुसंधानकर्ता', 'अनुवादक', 'अभ्यर्थी', 'अतिथि', 'अभिभावक', 'अग्रणी', 'अधिष्ठाता', 'अक्षरकार', 'अश्वारोही', 'अभ्यासकर्ता'],
    adjectives: ['अद्वितीय', 'अनुपम', 'अनमोल', 'अतुलनीय', 'अथक', 'अडिग', 'अखंड', 'अविचल', 'अतुल्य', 'अलौकिक', 'असीम', 'अनुकूल', 'अपूर्व', 'अमूल्य', 'अविराम', 'अद्भुत'],
    verbs: ['अपनाते हैं', 'अग्रसर होते हैं', 'अर्पण करते हैं', 'अनुभव करते हैं', 'अनुसरण करते हैं', 'अध्ययन करते हैं', 'अभ्यास करते हैं', 'अन्वेषण करते हैं', 'अर्जित करते हैं', 'अलंकृत करते हैं'],
    adverbs: ['अनवरत रूप से', 'अथक परिश्रम से', 'अखंड निष्ठा से', 'अपूर्व उत्साह से', 'अत्यंत कुशलता से', 'अवश्य ही', 'अविराम गति से', 'अद्भुत लगन से'],
    phrases: ['असीम ज्ञान की खोज में', 'अमृत तुल्य वचनों के साथ', 'अद्वितीय उपलब्धियों की ओर', 'अखंड साधना के मार्ग पर', 'अपूर्व ऊर्जा का संचार करते हुए']
  },
  'आ': {
    initial: ['आनंद', 'आदर्श', 'आस्था', 'आकाश', 'आलोक', 'आकांक्षा', 'आत्मा', 'आशीर्वाद', 'आगमन', 'आचरण', 'आधुनिक', 'आविष्कार', 'आभार', 'आकर्षण', 'आत्मविश्वास', 'आयु'],
    medial: ['साधना', 'भावना', 'कामना', 'प्रार्थना', 'चेतना', 'कल्पना', 'रचना', 'महिमा', 'गरिमा', 'प्रतिभा', 'विशाल', 'उदार', 'महान', 'प्रकाश', 'प्रभात', 'प्रवाह'],
    final: ['सदा', 'यदा', 'तदा', 'सर्वदा', 'तथा', 'यथा', 'पुनः', 'कला', 'शाला', 'माला', 'छाया', 'माया', 'काया', 'दया', 'कृपा', 'सुधा'],
    nouns: ['आचार्य', 'आलोचक', 'आविष्कारक', 'आर्टिस्ट', 'आगमनकर्ता', 'आयोजक', 'आदर्शवादी', 'आंदोलनकारी', 'आवासकर्ता', 'आश्रयदाता'],
    adjectives: ['आदर्श', 'आनंदमय', 'आलोकित', 'आकर्षक', 'आधुनिक', 'आत्मविश्वासी', 'आध्यात्मिक', 'आदरणीय', 'आवश्यक', 'आश्चर्यजनक', 'आत्मीय', 'आश्वस्त'],
    verbs: ['आह्वान करते हैं', 'आराधना करते हैं', 'आरंभ करते हैं', 'आविष्कार करते हैं', 'आत्मसात करते हैं', 'आगमन करते हैं', 'आशीर्वाद देते हैं', 'आलोकन करते हैं'],
    adverbs: ['आनंदपूर्वक', 'आदरपूर्वक', 'आत्मविश्वास से', 'आश्चर्यजनक रूप से', 'आसानी से', 'आत्मीयता से', 'आजीवन', 'आदर्श रूप में'],
    phrases: ['आलोकित प्रभात की वेला में', 'आनंद के सागर में मग्न होकर', 'आत्मविश्वास के दृढ़ संकल्प से', 'आदर्श जीवन मूल्यों को अपनाते हुए']
  },
  'क': {
    initial: ['कर्म', 'कर्तव्य', 'कलम', 'कविता', 'कौशल', 'कीर्ति', 'कमल', 'किरण', 'कुशल', 'कल्याण', 'कल्पना', 'क्रांति', 'कोशिश', 'कठिनाई', 'कदम', 'कवयित्री'],
    medial: ['संकल्प', 'विकल्प', 'प्रकृति', 'आकृति', 'संस्कृति', 'सकारात्मक', 'एकाग्रता', 'चमत्कार', 'परिक्रमा', 'अधिकार', 'स्वीकार', 'उपकार', 'सहकार', 'पुस्तकालय'],
    final: ['नायक', 'गायक', 'लेखक', 'पाठक', 'शिक्षक', 'सेवक', 'दर्शक', 'पालक', 'धारक', 'चालक', 'साधक', 'चिन्तक', 'कारक', 'सार्वजनिक', 'प्रतीक', 'विवेक'],
    nouns: ['कलाकार', 'कर्मयोगी', 'कवि', 'कहानीकार', 'कृषक', 'कारीगर', 'कोषाध्यक्ष', 'कार्यकर्ता', 'खगोलविद्', 'कौशलवान्'],
    adjectives: ['कुशल', 'कर्मठ', 'कर्तव्यनिष्ठ', 'क्रांतिकारी', 'कल्पनाशील', 'कौशलपूर्ण', 'कल्याणकारी', 'कठिन', 'कोमल', 'कीर्तिमान'],
    verbs: ['करते हैं', 'कहते हैं', 'कौशल दिखाते हैं', 'कल्पना करते हैं', 'कीर्तिमान बनाते हैं', 'कदम बढ़ाते हैं', 'कोशिश करते हैं', 'कल्याण करते हैं'],
    adverbs: ['कुशलतापूर्वक', 'कर्मठता से', 'कठिन परिश्रम से', 'क्रमशः', 'कदम-दर-कदम', 'कृतज्ञतापूर्वक', 'कभी-कभी', 'केवल'],
    phrases: ['कर्म के पवित्र पथ पर', 'कल्याणकारी विचारों के साथ', 'कल्पना की अनंत ऊंचाइयों में', 'कर्तव्यनिष्ठा के सर्वोच्च शिखर पर']
  },
  'स': {
    initial: ['सत्य', 'साधना', 'संकल्प', 'समर्पण', 'सृष्टि', 'सौंदर्य', 'संस्कृति', 'सफलता', 'साहस', 'संतोष', 'सहयोग', 'सद्भाव', 'समरसता', 'संयम', 'सहानुभूति', 'संगीत'],
    medial: ['प्रशंसा', 'विकास', 'विश्वास', 'उल्लास', 'इतिहास', 'प्रयास', 'अभ्यास', 'प्रकाश', 'आकाश', 'अवकाश', 'उत्साह', 'जिज्ञासा', 'विरासत', 'साहस'],
    final: ['हंस', 'अंश', 'वंश', 'स्पर्श', 'हर्ष', 'निष्कर्ष', 'आदर्श', 'परामर्श', 'उत्कर्ष', 'आकर्ष', 'दिवस', 'साहस', 'मनुष्य', 'रस', 'यश', 'तपस'],
    nouns: ['साधक', 'सैनिक', 'संगीतकार', 'समाजसेवी', 'संपादक', 'संरक्षक', 'सृजनकर्ता', 'सत्याग्रही', 'सलाहकार', 'सहयोगी'],
    adjectives: ['सत्यनिष्ठ', 'साहसी', 'सफल', 'समर्पित', 'सृजनशील', 'सद्गुणी', 'संवेदनशील', 'सकारात्मक', 'सरल', 'सुंदर', 'सशक्त', 'सुव्यवस्थित'],
    verbs: ['साधते हैं', 'सृजन करते हैं', 'स्वीकारते हैं', 'सफल होते हैं', 'समर्पित करते हैं', 'सहयोग देते हैं', 'संवारते हैं', 'सीखते हैं'],
    adverbs: ['सफलतापूर्वक', 'साहसपूर्वक', 'सहजता से', 'सद्भाव के साथ', 'समर्पण भाव से', 'सदा', 'सर्वदा', 'स्पष्ट रूप से'],
    phrases: ['सत्य और अहिंसा के मार्ग पर', 'संकल्प की विजय यात्रा में', 'सृजनशीलता के पावन निकेतन में', 'समर्पण की पावन वेदी पर']
  },
  'म': {
    initial: ['मन', 'मानव', 'महान', 'महिमा', 'मंजिल', 'मधुर', 'मातृभूमि', 'मर्यादा', 'मित्रता', 'ममता', 'मेहनत', 'मुस्कान', 'मार्ग', 'मोक्ष', 'मंथन', 'मौलिकता'],
    medial: ['समर्पण', 'समानता', 'समाज', 'कमल', 'अमृत', 'समय', 'नमन', 'चमन', 'दमन', 'शमन', 'विमल', 'सुमन', 'कोमल', 'निर्मल', 'परम', 'धर्म'],
    final: ['कर्म', 'धर्म', 'शर्म', 'मर्म', 'हर्ष', 'उत्तम', 'प्रथम', 'मध्यम', 'अंतिम', 'सत्यम', 'शिवम', 'सुंदरम', 'संगम', 'आश्रम', 'विश्राम', 'पराक्रम'],
    nouns: ['मार्गदर्शक', 'मानवतावादी', 'मूर्तिकार', 'मंत्रणादाता', 'महारथी', 'माली', 'मजदूर', 'मास्टर', 'मित्र', 'मनोवैज्ञानिक'],
    adjectives: ['महान', 'मधुर', 'मेहनती', 'मर्यादित', 'मौलिक', 'महत्वपूर्ण', 'मनोहर', 'मांगलिक', 'मनोबल-युक्त', 'ममतामयी'],
    verbs: ['मार्गदर्शन करते हैं', 'मिलते हैं', 'मंथन करते हैं', 'मुस्कुराते हैं', 'महसूस करते हैं', 'मजबूत बनाते हैं', 'मानते हैं', 'मनाते हैं'],
    adverbs: ['मधुरता से', 'मेहनत से', 'मर्यादापूर्वक', 'मजबूती से', 'मनोयोगपूर्वक', 'मुक्तकंठ से', 'मुस्कुराते हुए', 'मात्र'],
    phrases: ['मानवता के पावन मंदिर में', 'मातृभूमि की सेवा के लिए', 'मधुर स्मृतियों के झरोखे से', 'महान लक्ष्यों की प्राप्ति हेतु']
  },
  'र': {
    initial: ['रचना', 'राष्ट्र', 'रत्न', 'रंग', 'रस', 'राग', 'रात्रि', 'रवि', 'रहस्य', 'राज', 'रानी', 'रेखा', 'रोशनी', 'रुचि', 'रूपांतरण', 'रचनाकार'],
    medial: ['सूर्य', 'धैर्य', 'शौर्य', 'वीर्य', 'कार्य', 'आचार्य', 'मार्ग', 'स्वर्ग', 'वर्ग', 'पर्व', 'गर्व', 'हर्ष', 'वर्ष', 'स्पर्श', 'आदर्श', 'उत्कर्ष'],
    final: ['अक्षर', 'सुंदर', 'मंदिर', 'सागर', 'गागर', 'नागर', 'नगर', 'डगर', 'मगर', 'अगर', 'अंबर', 'संबर', 'पीतांबर', 'दिगंबर', 'निशिचर', 'खेचर'],
    nouns: ['रचनाकार', 'राजदूत', 'रंगकर्मी', 'राष्ट्रभक्त', 'रथवान्', 'रत्नकार', 'रसायनविद्', 'राजनेता', 'रक्षक', 'रणबांकुरा'],
    adjectives: ['रचनात्मक', 'राष्ट्रप्रेमी', 'रोचक', 'रमणीय', 'रत्नजड़ित', 'रहस्यमयी', 'रंग-बिरंगा', 'रुचिकर', 'राजकीय', 'रोशन'],
    verbs: ['रचते हैं', 'रक्षा करते हैं', 'रंग भरते हैं', 'रोशन करते हैं', 'रूपांतरित करते हैं', 'रहते हैं', 'रखते हैं', 'रोकते हैं'],
    adverbs: ['रचनात्मक रूप से', 'रोचक ढंग से', 'रहस्यमयी अंदाज में', 'रात-दिन', 'रफ्तार से', 'रुचिपूर्वक', 'रीति-नीति से', 'रोज'],
    phrases: ['रचनात्मकता के नव प्रभात में', 'राष्ट्र सेवा के पावन यज्ञ में', 'रोशनी के अनंत विस्तार में', 'रत्नों से सुशोभित पथ पर']
  }
};

// Generic Hindi fallback vocabulary generator for any Hindi glyph
function getHindiGlyphVocab(char: string): HindiVocabularyCategory {
  if (HINDI_DYNAMIC_VOCAB[char]) {
    return HINDI_DYNAMIC_VOCAB[char];
  }
  return {
    initial: [`${char}ल`, `${char}म`, `${char}र`, `${char}स`, `${char}म्य`, `${char}ल्य`, `${char}व्य`, `${char}ति`],
    medial: [`प्र${char}`, `सु${char}`, `अ${char}`, `वि${char}`, `सं${char}`, `अनु${char}`, `परि${char}`],
    final: [`सु${char}`, `प${char}`, `न${char}`, `म${char}`, `स${char}`, `क${char}`, `र${char}`],
    nouns: [`${char}-साधक`, `${char}-अन्वेषक`, `${char}-लेखक`, `${char}-अभ्यासकर्ता`, `${char}-विद्वान`],
    adjectives: [`${char}-युक्त`, `${char}-प्रधान`, `${char}-सम्पन्न`, `${char}-विशिष्ट`, `${char}-आधारित`],
    verbs: [`${char}-युक्त अभ्यास करते हैं`, `${char}-अक्षर को साधते हैं`, `गति और प्रवाह बढ़ाते हैं`, `शुद्धता अर्जित करते हैं`],
    adverbs: [`${char}-ध्वनि के साथ`, `एकाग्रतापूर्वक`, `सटीकता से`, `अनवरत साधना से`],
    phrases: [`'${char}' अक्षर की साधना में`, `देवनागरी के पावन प्रवाह में`, `उंगलियों के सधे हुए तालमेल से`]
  };
}

// --------------------------------------------------------------------------
// 3. MASTER PROCEDURAL SENTENCE SYNTHESIZER CLASS
// --------------------------------------------------------------------------
export class DynamicWordEngine {
  private static seededRandomIndex = 0;

  // Simple deterministic pseudo-random with entropy
  private static getRandomItem<T>(array: T[]): T {
    if (!array || array.length === 0) return '' as unknown as T;
    const rand = Math.floor(Math.random() * array.length);
    return array[rand];
  }

  // Capitalize first character of string
  private static capitalize(str: string): string {
    if (!str) return '';
    return str.charAt(0).toUpperCase() + str.slice(1);
  }

  // Determiners matching vowel / consonant start
  private static getDeterminer(word: string): string {
    const firstLetter = word.trim().charAt(0).toLowerCase();
    if (['a', 'e', 'i', 'o', 'u'].includes(firstLetter)) {
      return this.getRandomItem(['An', 'The', 'Every', 'One notable', 'Each']);
    }
    return this.getRandomItem(['A', 'The', 'Every', 'One distinct', 'Each']);
  }

  // Prepositions array for coherent spatial / thematic relationships
  private static prepositions = [
    'across', 'through', 'beneath', 'beyond', 'along', 'beside', 'within',
    'around', 'toward', 'amidst', 'over', 'into', 'upon', 'throughout'
  ];

  // --------------------------------------------------------------------------
  // ENGLISH GRAMMATICAL PROCEDURAL SENTENCE GENERATOR
  // --------------------------------------------------------------------------
  public static generateEnglishSentence(targetLetter: string = 'A'): string {
    const letter = (targetLetter || 'A').toUpperCase();
    const vocab = ENGLISH_DYNAMIC_VOCAB[letter] || ENGLISH_DYNAMIC_VOCAB['A'];

    const adj1 = this.getRandomItem(vocab.adjectives);
    const noun1 = this.getRandomItem(vocab.nouns);
    const adv = this.getRandomItem(vocab.adverbs);
    const verb = this.getRandomItem(vocab.verbs);
    const prep = this.getRandomItem(this.prepositions);
    const adj2 = this.getRandomItem(vocab.beginning.concat(vocab.middle));
    const noun2 = this.getRandomItem(vocab.ending.concat(vocab.nouns));

    const det1 = this.getDeterminer(adj1);
    const det2 = ['a', 'e', 'i', 'o', 'u'].includes(adj2.charAt(0).toLowerCase()) ? 'an' : 'a';

    // Pick 1 of 5 robust grammatical sentence structures
    const templateIndex = Math.floor(Math.random() * 5);

    switch (templateIndex) {
      case 0:
        // [Determiner] + [Adjective] + [Noun] + [Adverb] + [Verb] + [Preposition] + [Determiner] + [Adjective] + [Noun].
        return `${det1} ${adj1} ${noun1} ${adv} ${verb} ${prep} ${det2} ${adj2} ${noun2}.`;

      case 1:
        // While [Adjective] [Noun] [Verb] [Preposition] [Noun], [Determiner] [Noun] [Adverb] [Verb] [Preposition] [Noun].
        const adj3 = this.getRandomItem(vocab.adjectives);
        const noun3 = this.getRandomItem(vocab.nouns);
        const verb2 = this.getRandomItem(vocab.verbs);
        return `While ${adj1} ${noun1} ${verb} ${prep} ${noun2}, ${det1.toLowerCase()} ${adj3} ${noun3} ${adv} ${verb2} ${prep} ${det2} ${adj2} ${noun2}.`;

      case 2:
        // Across [Adjective] [Nouns], every [Adjective] [Noun] [Adverb] [Verb] [Noun].
        return `Across ${adj1} ${noun2}s, every ${adj2} ${noun1} ${adv} ${verb} ${noun3 || 'knowledge'}.`;

      case 3:
        // [Adverb], the [Adjective] [Noun] [Verb] ${prep} [Adjective] [Noun] with [Adjective] [Noun].
        const noun4 = this.getRandomItem(vocab.beginning);
        return `${this.capitalize(adv)}, the ${adj1} ${noun1} ${verb} ${prep} ${adj2} ${noun2} with ${adj1} ${noun4}.`;

      case 4:
      default:
        // To master key '[Letter]', [Determiner] [Adjective] [Noun] [Adverb] [Verb] [Preposition] [Noun].
        return `To master key '${letter}', ${det1.toLowerCase()} ${adj1} ${noun1} ${adv} ${verb} ${prep} ${det2} ${adj2} ${noun2}.`;
    }
  }

  // --------------------------------------------------------------------------
  // HINDI DEVANAGARI PROCEDURAL SENTENCE GENERATOR
  // --------------------------------------------------------------------------
  public static generateHindiSentence(targetChar: string = 'क'): string {
    const char = targetChar || 'क';
    const vocab = getHindiGlyphVocab(char);

    const noun1 = this.getRandomItem(vocab.nouns);
    const adj1 = this.getRandomItem(vocab.adjectives);
    const adv = this.getRandomItem(vocab.adverbs);
    const verb = this.getRandomItem(vocab.verbs);
    const phrase = this.getRandomItem(vocab.phrases);
    const initWord = this.getRandomItem(vocab.initial);
    const medWord = this.getRandomItem(vocab.medial);

    const templateIndex = Math.floor(Math.random() * 4);

    switch (templateIndex) {
      case 0:
        // [विशेषण] [कर्ता] [क्रियाविशेषण] [कर्म पदबंध] [क्रिया]।
        return `${adj1} ${noun1} ${phrase}, ${adv} ${initWord} और ${medWord} को ${verb}।`;

      case 1:
        // जब [कर्ता] [क्रियाविशेषण] [क्रिया] करते हैं, तब [विशेषण] [कर्म] [क्रिया] होती है।
        return `जब ${noun1} ${adv} अभ्यास करते हैं, तब ${phrase} ${adj1} ${medWord} का नवीन सृजन होता है।`;

      case 2:
        // [वाक्यांश] के साथ, प्रत्येक [विशेषण] [कर्ता] [क्रियाविशेषण] [क्रिया]।
        return `${phrase}, प्रत्येक ${adj1} ${noun1} ${adv} देवनागरी लिपि के सौंदर्य को ${verb}।`;

      case 3:
      default:
        // '${char}' अक्षर की साधना में [कर्ता] [विशेषण] भाव से [क्रिया]।
        return `'${char}' अक्षर की साधना में ${noun1} ${adv} ${adj1} विचारों को अपनी उंगलियों से साकार करते हैं।`;
    }
  }

  // --------------------------------------------------------------------------
  // DUAL PAIR MUSCLE MEMORY SENTENCE GENERATOR
  // --------------------------------------------------------------------------
  public static generateDualPairSentence(letter1: string = 'A', letter2: string = 'S', language: 'en' | 'hi' = 'en'): string {
    if (language === 'hi') {
      const v1 = getHindiGlyphVocab(letter1);
      const v2 = getHindiGlyphVocab(letter2);
      const n1 = this.getRandomItem(v1.nouns);
      const a2 = this.getRandomItem(v2.adjectives);
      const adv = this.getRandomItem(v1.adverbs);
      return `'${letter1}' और '${letter2}' के द्वैत अभ्यास में, ${a2} ${n1} ${adv} दोनों कुंजियों का संतुलित समन्वय साधते हैं।`;
    }

    const l1 = letter1.toUpperCase();
    const l2 = letter2.toUpperCase();
    const vocab1 = ENGLISH_DYNAMIC_VOCAB[l1] || ENGLISH_DYNAMIC_VOCAB['A'];
    const vocab2 = ENGLISH_DYNAMIC_VOCAB[l2] || ENGLISH_DYNAMIC_VOCAB['S'];

    const adj1 = this.getRandomItem(vocab1.adjectives);
    const noun1 = this.getRandomItem(vocab1.nouns);
    const verb2 = this.getRandomItem(vocab2.verbs);
    const adv2 = this.getRandomItem(vocab2.adverbs);
    const adj2 = this.getRandomItem(vocab2.adjectives);
    const noun2 = this.getRandomItem(vocab2.nouns);

    return `The ${adj1} ${noun1} ${adv2} ${verb2} alongside the ${adj2} ${noun2}, synchronizing keystrokes '${l1}' and '${l2}' in perfect harmonic balance.`;
  }

  // --------------------------------------------------------------------------
  // BATCH STREAM GENERATOR: Synthesizes initial stream or infinite chunks
  // --------------------------------------------------------------------------
  public static generateDynamicStream(
    language: 'en' | 'hi' = 'en',
    category: string = 'alphabet',
    key: string = 'A',
    sentenceCount: number = 8
  ): string {
    const sentences: string[] = [];

    for (let i = 0; i < sentenceCount; i++) {
      if (category === 'bigram' && key.includes('+')) {
        const [k1, k2] = key.split('+');
        sentences.push(this.generateDualPairSentence(k1 || 'A', k2 || 'S', language));
      } else if (language === 'hi') {
        sentences.push(this.generateHindiSentence(key));
      } else {
        sentences.push(this.generateEnglishSentence(key));
      }
    }

    return sentences.join(' ');
  }
}
