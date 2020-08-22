import unittest
import copy

import my_sort


LIST02 = ['harm', 'winter', 'flow', 'flock', 'pump',
          'stop', 'dear', 'cluttered', 'ignorant', 'delicious',
          'tan', 'downtown', 'grieving', 'mass', 'smile',
          'lively', 'messy', 'peace', 'soup', 'person',
          'impulse', 'null', 'box', 'secretive', 'pickle',
          'creepy', 'horse', 'resonant', 'thread', 'bed',
          'skirt', 'suit', 'camp', 'living', 'natural',
          'profit', 'education', 'drain', 'boast', 'grouchy',
          'plants', 'tank', 'smoke', 'condition', 'glossy',
          'puzzled', 'station', 'start', 'perpetual', 'brake',
          'cracker', 'insect', 'ski', 'camp', 'check',
          'theory', 'open', 'historical', 'reflect', 'name',
          'obsolete', 'billowy', 'baseball', 'precious', 'recess',
          'play', 'understood', 'drain', 'sleet', 'fancy',
          'accessible', 'good', 'minister', 'watch', 'picture',
          'woman', 'raise', 'maid', 'clip', 'aspiring',
          'giant', 'thankful', 'beginner', 'hose', 'tap',
          'vivacious', 'direction', 'view', 'various', 'puny',
          'massive', 'rod', 'whisper', 'books', 'memorise',
          'little', 'giddy', 'soak', 'pass', 'sack',
          'close', 'current', 'wacky', 'abashed', 'disturbed',
          'elfin', 'long', 'squeak', 'thirsty', 'limping',
          'brother', 'feeling', 'year', 'offer', 'upbeat',
          'black-and-white', 'quicksand', 'film', 'flippant', 'ripe',
          'assorted', 'time', 'parsimonious', 'invention', 'shade',
          'bomb', 'seal', 'teaching', 'ambitious', 'sand',
          'airplane', 'digestion', 'abaft', 'daily', 'honorable',
          'clear', 'dad', 'tidy', 'calendar', 'command',
          'three', 'milky', 'economic', 'representative', 'sad',
          'lunch', 'callous', 'cable', 'magenta', 'prefer',
          'trite', 'perform', 'zebra', 'saw', 'lace',
          'lush', 'store', 'likeable', 'recondite', 'cobweb',
          'carpenter', 'spade', 'box', 'locket', 'jealous',
          'unequal', 'bear', 'shiny', 'burn', 'nosy',
          'jaded', 'suck', 'untidy', 'sordid', 'one',
          'deafening', 'nasty', 'merciful', 'impress', 'ugly',
          'space', 'lock', 'thaw', 'canvas', 'loose',
          'whip', 'diligent', 'old-fashioned', 'kindly', 'old',
          'redundant', 'zealous', 'naughty', 'dam', 'dare',
          'loaf', 'crook', 'earth', 'fly', 'discover',
          'hall', 'extra-large', 'ban', 'tedious', 'funny',
          'beneficial', 'aback', 'house', 'rotten', 'pull',
          'pollution', 'wing', 'measure', 'nebulous', 'boat',
          'tomatoes', 'bow', 'clean', 'even', 'guard',
          'lovely', 'true', 'chickens', 'signal', 'neat',
          'judge', 'slim', 'blushing', 'fresh', 'respect',
          'matter', 'rule', 'exchange', 'early', 'labored',
          'flagrant', 'celery', 'righteous', 'talk', 'chin',
          'touch', 'club', 'pricey', 'moldy', 'overwrought',
          'weak', 'self', 'breakable', 'skate', 'poor',
          'small', 'approval', 'terrible', 'abusive', 'zephyr',
          'finger', 'equal', 'left', 'grip', 'battle',
          'value', 'poised', 'prepare', 'erect', 'detail',
          'flesh', 'ludicrous', 'thought', 'ceaseless', 'bird',
          'watery', 'well-to-do', 'spot', 'cake', 'blue-eyed',
          'eight', 'amuse', 'spotty', 'exclusive', 'shiver',
          'load', 'puzzling', 'amuck', 'holiday', 'muddled',
          'drown', 'dangerous', 'next', 'taste', 'huge',
          'move', 'tired', 'feigned', 'faint', 'unsuitable',
          'knowing', 'abrupt', 'guarded', 'waves', 'moaning',
          'shelter', 'wretched', 'suit', 'charge', 'toad',
          'clever', 'flash', 'sparkle', 'crack', 'ritzy',
          'building', 'school', 'thank', 'potato', 'force',
          'enchanting', 'sweater', 'extend', 'idea', 'spell',
          'friendly', 'satisfy', 'rub', 'depressed', 'spot',
          'morning', 'hang', 'remarkable', 'twig', 'crown',
          'explode', 'gratis', 'deserted', 'helpful', 'place',
          'pizzas', 'deep', 'point', 'hard', 'hurt',
          'adjoining', 'glistening', 'alarm', 'zesty', 'knowledge',
          'trees', 'impartial', 'incredible', 'reject', 'bustling',
          'resolute', 'slope', 'train', 'pear', 'wave',
          'fireman', 'trousers', 'mine', 'wash', 'face',
          'ashamed', 'arch', 'yielding', 'second-hand', 'leg',
          'lip', 'use', 'sail', 'base', 'rainy',
          'spark', 'increase', 'lean', 'open', 'fish',
          'uttermost', 'laborer', 'disagreeable', 'plot', 'creature',
          'sudden', 'possessive', 'elated', 'cows', 'vein',
          'trip', 'worm', 'quiet', 'decorate', 'lyrical',
          'selfish', 'ruddy', 'afternoon', 'crayon', 'pinch',
          'proud', 'statement', 'church', 'notebook', 'equable',
          'coil', 'gate', 'dolls', 'risk', 'transport',
          'cough', 'vengeful', 'grade', 'scientific', 'choke',
          'boundary', 'attend', 'doubtful', 'volatile', 'unwieldy',
          'zippy', 'loss', 'tightfisted', 'comfortable', 'godly',
          'top', 'rejoice', 'change', 'glass', 'secretary',
          'correct', 'parallel', 'chilly', 'jump', 'acceptable',
          'blow', 'peck', 'gentle', 'thick', 'drawer',
          'striped', 'determined', 'playground', 'itch', 'van',
          'letter', 'jail', 'turn', 'legal', 'cream',
          'vacation', 'phobic', 'sugar', 'rare', 'expand',
          'partner', 'evanescent', 'account', 'thrill', 'lacking',
          'murder', 'quixotic', 'plant', 'request', 'heartbreaking',
          'tall', 'rinse', 'art', 'flap', 'muddle',
          'chivalrous', 'extra-small', 'ticket', 'shirt', 'ear',
          'silent', 'hole', 'overjoyed', 'expensive', 'homely',
          'stitch', 'hanging', 'claim', 'plough', 'produce',
          'yoke', 'meeting', 'fearful', 'suggestion', 'tumble',
          'daffy', 'bang', 'wry', 'invent', 'learn',
          'omniscient', 'imperfect', 'butter', 'tearful', 'boorish',
          'tame', 'yam', 'call', 'summer', 'descriptive',
          'clean', 'mellow', 'children', 'cheap',
          'encouraging', 'admire', 'happen', 'science', 'company',
          'roasted', 'dysfunctional', 'seemly', 'belief', 'borrow',
          'dime', 'angle', 'scattered', 'lonely', 'silent',
          'jeans', 'relation', 'stomach', 'abrasive', 'nippy',
          'mother', 'long', 'army', 'curl', 'development',
          'title', 'guide', 'pedal', 'road', 'dust',
          'painful', 'cannon', 'mourn', 'line', 'womanly',
          'detailed', 'zip', 'receipt', 'mom', 'oven',
          'upset', 'foregoing', 'hug', 'car', 'gusty',
          'bubble', 'form', 'nail', 'cause', 'caring',
          'afford', 'whirl', 'switch', 'eye', 'man',
          'rude', 'smell', 'frightening', 'half', 'flaky',
          'regret', 'question', 'answer', 'cross', 'periodic',
          'talk', 'governor', 'shrug', 'offend', 'doubt',
          'abundant', 'system', 'silky', 'lumber', 'outgoing',
          'vagabond', 'noiseless', 'flashy', 'type', 'cloistered',
          'verdant', 'thirsty', 'mundane', 'observation', 'angry',
          'soggy', 'smoke', 'girls', 'comparison', 'heat',
          'clap', 'jail', 'rock', 'design', 'tow',
          'handle', 'finger', 'scintillating', 'courageous', 'nervous',
          'owe', 'acoustics', 'clover', 'grape', 'turkey',
          'wealthy', 'sign', 'window', 'stir', 'consist',
          'unhealthy', 'tire', 'crooked', 'x-ray', 'full',
          'arrest', 'stage', 'scratch', 'immense', 'rail',
          'husky', 'suffer', 'disgusted', 'painstaking', 'glove',
          'effect', 'aloof', 'story', 'possess', 'death',
          'secret', 'cheerful', 'utopian', 'leather', 'smiling',
          'adjustment', 'spoon', 'balance', 'tense', 'glamorous',
          'graceful', 'rescue', 'street', 'twist', 'efficient',
          'acrid', 'rampant', 'complete', 'false', 'fork',
          'welcome', 'sweet', 'growth', 'exist', 'frequent',
          'truthful', 'holistic', 'average', 'dark', 'replace',
          'hover', 'steel', 'damaged', 'ready', 'throne',
          'group', 'dull', 'sloppy', 'damage', 'crabby',
          'like', 'vigorous', 'trail', 'coil', 'chubby',
          'petite', 'habitual', 'illegal', 'nonchalant', 'expansion',
          'aboard', 'strange', 'pin', 'injure', 'knock',
          'zoom', 'crowded', 'skin', 'price', 'elastic',
          'coherent', 'beef', 'eyes', 'sock', 'agree',
          'willing', 'prick', 'suggest', 'complete', 'agreement',
          'pot', 'fact', 'boot', 'enter', 'soft',
          'stone', 'record', 'lick', 'heat', 'ignore',
          'dress', 'defective', 'adventurous', 'illustrious', 'file',
          'practise', 'gifted', 'permit', 'decide', 'snatch',
          'mind', 'ruin', 'clear', 'obtain', 'plant',
          'wink', 'honey', 'tiresome', 'pink', 'mailbox',
          'sleepy', 'knot', 'save', 'surprise', 'tangy',
          'pastoral', 'juvenile', 'broken', 'bikes', 'hunt',
          'orange', 'join', 'card', 'ad hoc', 'lighten',
          'cure', 'bath', 'surprise', 'pies', 'animal',
          'action', 'ubiquitous', 'synonymous', 'mark', 'fang',
          'stain', 'tour', 'parcel', 'mixed', 'quirky',
          'spiders', 'stew', 'necessary', 'jam', 'field',
          'channel', 'front', 'sprout', 'psychedelic', 'shoe',
          'embarrass', 'work', 'describe', 'wish', 'test',
          'return', 'ill', 'lavish', 'past', 'trace',
          'bore', 'romantic', 'nauseating', 'excited', 'pause',
          'vase', 'fold', 'somber', 'spring', 'giraffe',
          'mute', 'blue', 'macabre', 'hospital', 'rapid',
          'meal', 'try', 'basin', 'unit', 'wind',
          'concentrate', 'hand', 'follow', 'intelligent', 'fuzzy',
          'annoy', 'range', 'queen', 'thinkable', 'sheet',
          'brush', 'highfalutin', 'squalid', 'trust', 'skinny',
          'contain', 'dead', 'jewel', 'found', 'weary',
          'rough', 'teeny-tiny', 'wrench', 'lewd', 'metal',
          'dislike', 'shame', 'motionless', 'grease', 'dirt',
          'rebel', 'jar', 'frame', 'pump', 'grandmother',
          'distance', 'greasy', 'wander', 'dry', 'nest',
          'grab', 'root', 'scare', 'scale', 'share',
          'snore', 'produce', 'flight', 'condemned', 'ethereal',
          'abnormal', 'unable', 'spectacular', 'truck', 'baby',
          'invincible', 'yard', 'cool', 'retire', 'brown',
          'overflow', 'seashore', 'float', 'tasteless', 'hapless',
          'slave', 'lucky', 'guide', 'earthy', 'income',
          'square', 'miscreant', 'regular', 'attack', 'writing',
          'thing', 'heady', 'aftermath', 'aware', 'amusing',
          'friction', 'peel', 'longing', 'tease', 'sore',
          'camera', 'frantic', 'twist', 'thundering', 'numerous',
          'advise', 'erratic', 'place', 'ocean', 'kneel',
          'rock', 'tick', 'guitar', 'grate', 'acidic',
          'tax', 'rhetorical', 'therapeutic', 'grateful', 'apparatus',
          'jumpy', 'outstanding', 'mice', 'reaction', 'stale',
          'excuse', 'wide-eyed', 'basket', 'deserve', 'grandfather',
          'furtive', 'bucket', 'discreet', 'expect', 'disgusting',
          'third', 'country', 'abandoned', 'fetch', 'bolt',
          'tip', 'step', 'grass', 'agreeable', 'spurious',
          'color', 'separate', 'picayune', 'pack', 'pat',
          'credit', 'internal', 'compare', 'vessel', 'whine',
          'instinctive', 'squash', 'draconian', 'abounding', 'substantial',
          'hum', 'black', 'alcoholic', 'magic', 'shape',
          'stem', 'quarter', 'absent', 'lively', 'quilt',
          'land', 'point', 'harsh', 'songs', 'side',
          'real', 'sisters', 'edge', 'receptive', 'overrated',
          'knot', 'cast', 'thoughtful', 'live', 'anxious',
          'support', 'show', 'soothe', 'meek', 'cushion',
          'plantation', 'responsible', 'pig', 'puffy', 'drag',
          'ants', 'ancient', 'pleasant', 'ajar', 'actor',
          'political', 'groovy', 'unaccountable', 'empty', 'hook',
          'want', 'tame', 'record', 'plug', 'stimulating',
          'violent']

LIST02_ASC = ['aback', 'abaft', 'abandoned', 'abashed', 'abnormal', 'aboard', 'abounding', 'abrasive', 'abrupt',
              'absent', 'abundant', 'abusive', 'acceptable', 'accessible', 'account', 'acidic', 'acoustics', 'acrid',
              'action', 'actor', 'ad hoc', 'adjoining', 'adjustment', 'admire', 'adventurous', 'advise', 'afford',
              'aftermath', 'afternoon', 'agree', 'agreeable', 'agreement', 'airplane', 'ajar', 'alarm', 'alcoholic',
              'aloof', 'ambitious', 'amuck', 'amuse', 'amusing', 'ancient', 'angle', 'angry', 'animal', 'annoy',
              'answer', 'ants', 'anxious', 'apparatus', 'approval', 'arch', 'army', 'arrest', 'art', 'ashamed',
              'aspiring', 'assorted', 'attack', 'attend', 'average', 'aware',
              'baby', 'balance', 'ban', 'bang', 'base', 'baseball', 'basin', 'basket', 'bath', 'battle', 'bear', 'bed',
              'beef', 'beginner', 'belief', 'beneficial', 'bikes', 'billowy', 'bird', 'black', 'black-and-white',
              'blow', 'blue', 'blue-eyed', 'blushing', 'boast', 'boat', 'bolt', 'bomb', 'books', 'boorish', 'boot',
              'bore', 'borrow', 'boundary', 'bow', 'box', 'box', 'brake', 'breakable', 'broken', 'brother', 'brown',
              'brush', 'bubble', 'bucket', 'building', 'burn', 'bustling', 'butter',
              'cable', 'cake', 'calendar', 'call', 'callous', 'camera', 'camp', 'camp', 'cannon', 'canvas', 'car',
              'card', 'caring', 'carpenter', 'cast', 'cause', 'ceaseless', 'celery', 'change', 'channel', 'charge',
              'cheap', 'check', 'cheerful', 'chickens', 'children', 'chilly', 'chin', 'chivalrous', 'choke', 'chubby',
              'church', 'claim', 'clap', 'clean', 'clean', 'clear', 'clear', 'clever', 'clip', 'cloistered', 'close',
              'clover', 'club', 'cluttered', 'cobweb', 'coherent', 'coil', 'coil', 'color', 'comfortable', 'command',
              'company', 'compare', 'comparison', 'complete', 'complete', 'concentrate', 'condemned', 'condition',
              'consist', 'contain', 'cool', 'correct', 'cough', 'country', 'courageous', 'cows', 'crabby', 'crack',
              'cracker', 'crayon', 'cream', 'creature', 'credit', 'creepy', 'crook', 'crooked', 'cross', 'crowded',
              'crown', 'cure', 'curl', 'current', 'cushion',
              'dad', 'daffy', 'daily', 'dam', 'damage', 'damaged', 'dangerous', 'dare', 'dark', 'dead', 'deafening',
              'dear', 'death', 'decide', 'decorate', 'deep', 'defective', 'delicious', 'depressed', 'describe',
              'descriptive', 'deserted', 'deserve', 'design', 'detail', 'detailed', 'determined', 'development',
              'digestion', 'diligent', 'dime', 'direction', 'dirt', 'disagreeable', 'discover', 'discreet', 'disgusted',
              'disgusting', 'dislike', 'distance', 'disturbed', 'dolls', 'doubt', 'doubtful', 'downtown', 'draconian',
              'drag', 'drain', 'drain', 'drawer', 'dress', 'drown', 'dry', 'dull', 'dust', 'dysfunctional',
              'ear', 'early', 'earth', 'earthy', 'economic', 'edge', 'education', 'effect', 'efficient', 'eight',
              'elastic', 'elated', 'elfin', 'embarrass', 'empty', 'enchanting', 'encouraging', 'enter', 'equable',
              'equal', 'erect', 'erratic', 'ethereal', 'evanescent', 'even', 'exchange', 'excited', 'exclusive',
              'excuse', 'exist', 'expand', 'expansion', 'expect', 'expensive', 'explode', 'extend', 'extra-large',
              'extra-small', 'eye', 'eyes',
              'face', 'fact', 'faint', 'false', 'fancy', 'fang', 'fearful', 'feeling', 'feigned', 'fetch', 'field',
              'file', 'film', 'finger', 'finger', 'fireman', 'fish', 'flagrant', 'flaky', 'flap', 'flash', 'flashy',
              'flesh', 'flight', 'flippant', 'float', 'flock', 'flow', 'fly', 'fold', 'follow', 'force', 'foregoing',
              'fork', 'form', 'found', 'frame', 'frantic', 'frequent', 'fresh', 'friction', 'friendly', 'frightening',
              'front', 'full', 'funny', 'furtive', 'fuzzy',
              'gate', 'gentle', 'giant', 'giddy', 'gifted', 'giraffe', 'girls', 'glamorous', 'glass', 'glistening',
              'glossy', 'glove', 'godly', 'good', 'governor', 'grab', 'graceful', 'grade', 'grandfather', 'grandmother',
              'grape', 'grass', 'grate', 'grateful', 'gratis', 'grease', 'greasy', 'grieving', 'grip', 'groovy',
              'grouchy', 'group', 'growth', 'guard', 'guarded', 'guide', 'guide', 'guitar', 'gusty',
              'habitual', 'half', 'hall', 'hand', 'handle', 'hang', 'hanging', 'hapless', 'happen', 'hard', 'harm',
              'harsh', 'heady', 'heartbreaking', 'heat', 'heat', 'helpful', 'highfalutin', 'historical', 'hole',
              'holiday', 'holistic', 'homely', 'honey', 'honorable', 'hook', 'horse', 'hose', 'hospital', 'house',
              'hover', 'hug', 'huge', 'hum', 'hunt', 'hurt', 'husky',
              'idea', 'ignorant', 'ignore', 'ill', 'illegal', 'illustrious', 'immense', 'impartial', 'imperfect',
              'impress', 'impulse', 'income', 'increase', 'incredible', 'injure', 'insect', 'instinctive',
              'intelligent', 'internal', 'invent', 'invention', 'invincible', 'itch',
              'jaded', 'jail', 'jail', 'jam', 'jar', 'jealous', 'jeans', 'jewel', 'join', 'judge', 'jump', 'jumpy',
              'juvenile',
              'kindly', 'kneel', 'knock', 'knot', 'knot', 'knowing', 'knowledge',
              'labored', 'laborer', 'lace', 'lacking', 'land', 'lavish', 'lean', 'learn', 'leather', 'left', 'leg',
              'legal', 'letter', 'lewd', 'lick', 'lighten', 'like', 'likeable', 'limping', 'line', 'lip', 'little',
              'live', 'lively', 'lively', 'living', 'load', 'loaf', 'lock', 'locket', 'lonely', 'long', 'long',
              'longing', 'loose', 'loss', 'lovely', 'lucky', 'ludicrous', 'lumber', 'lunch', 'lush', 'lyrical',
              'macabre', 'magenta', 'magic', 'maid', 'mailbox', 'man', 'mark', 'mass', 'massive', 'matter', 'meal',
              'measure', 'meek', 'meeting', 'mellow', 'memorise', 'merciful', 'messy', 'metal', 'mice', 'milky', 'mind',
              'mine', 'minister', 'miscreant', 'mixed', 'moaning', 'moldy', 'mom', 'morning', 'mother', 'motionless',
              'mourn', 'move', 'muddle', 'muddled', 'mundane', 'murder', 'mute',
              'nail', 'name', 'nasty', 'natural', 'naughty', 'nauseating', 'neat', 'nebulous', 'necessary', 'nervous',
              'nest', 'next', 'nippy', 'noiseless', 'nonchalant', 'nosy', 'notebook', 'null', 'numerous',
              'observation', 'obsolete', 'obtain', 'ocean', 'offend', 'offer', 'old', 'old-fashioned', 'omniscient',
              'one', 'open', 'open', 'orange', 'outgoing', 'outstanding', 'oven', 'overflow', 'overjoyed', 'overrated',
              'overwrought', 'owe',
              'pack', 'painful', 'painstaking', 'parallel', 'parcel', 'parsimonious', 'partner', 'pass', 'past',
              'pastoral', 'pat', 'pause', 'peace', 'pear', 'peck', 'pedal', 'peel', 'perform', 'periodic', 'permit',
              'perpetual', 'person', 'petite', 'phobic', 'picayune', 'pickle', 'picture', 'pies', 'pig', 'pin', 'pinch',
              'pink', 'pizzas', 'place', 'place', 'plant', 'plant', 'plantation', 'plants', 'play', 'playground',
              'pleasant', 'plot', 'plough', 'plug', 'point', 'point', 'poised', 'political', 'pollution', 'poor',
              'possess', 'possessive', 'pot', 'potato', 'practise', 'precious', 'prefer', 'prepare', 'price', 'pricey',
              'prick', 'produce', 'produce', 'profit', 'proud', 'psychedelic', 'puffy', 'pull', 'pump', 'pump', 'puny',
              'puzzled', 'puzzling',
              'quarter', 'queen', 'question', 'quicksand', 'quiet', 'quilt', 'quirky', 'quixotic',
              'rail', 'rainy', 'raise', 'rampant', 'range', 'rapid', 'rare', 'reaction', 'ready', 'real', 'rebel',
              'receipt', 'receptive', 'recess', 'recondite', 'record', 'record', 'redundant', 'reflect', 'regret',
              'regular', 'reject', 'rejoice', 'relation', 'remarkable', 'replace', 'representative', 'request',
              'rescue', 'resolute', 'resonant', 'respect', 'responsible', 'retire', 'return', 'rhetorical', 'righteous',
              'rinse', 'ripe', 'risk', 'ritzy', 'road', 'roasted', 'rock', 'rock', 'rod', 'romantic', 'root', 'rotten',
              'rough', 'rub', 'ruddy', 'rude', 'ruin', 'rule',
              'sack', 'sad', 'sail', 'sand', 'satisfy', 'save', 'saw', 'scale', 'scare', 'scattered', 'school',
              'science', 'scientific', 'scintillating', 'scratch', 'seal', 'seashore', 'second-hand', 'secret',
              'secretary', 'secretive', 'seemly', 'self', 'selfish', 'separate', 'shade', 'shame', 'shape', 'share',
              'sheet', 'shelter', 'shiny', 'shirt', 'shiver', 'shoe', 'show', 'shrug', 'side', 'sign', 'signal',
              'silent', 'silent', 'silky', 'sisters', 'skate', 'ski', 'skin', 'skinny', 'skirt', 'slave', 'sleepy',
              'sleet', 'slim', 'slope', 'sloppy', 'small', 'smell', 'smile', 'smiling', 'smoke', 'smoke', 'snatch',
              'snore', 'soak', 'sock', 'soft', 'soggy', 'somber', 'songs', 'soothe', 'sordid', 'sore', 'soup', 'space',
              'spade', 'spark', 'sparkle', 'spectacular', 'spell', 'spiders', 'spoon', 'spot', 'spot', 'spotty',
              'spring', 'sprout', 'spurious', 'squalid', 'square', 'squash', 'squeak', 'stage', 'stain', 'stale',
              'start', 'statement', 'station', 'steel', 'stem', 'step', 'stew', 'stimulating', 'stir', 'stitch',
              'stomach', 'stone', 'stop', 'store', 'story', 'strange', 'street', 'striped', 'substantial', 'suck',
              'sudden', 'suffer', 'sugar', 'suggest', 'suggestion', 'suit', 'suit', 'summer', 'support', 'surprise',
              'surprise', 'sweater', 'sweet', 'switch', 'synonymous', 'system',
              'talk', 'talk', 'tall', 'tame', 'tame', 'tan', 'tangy', 'tank', 'tap', 'taste', 'tasteless', 'tax',
              'teaching', 'tearful', 'tease', 'tedious', 'teeny-tiny', 'tense', 'terrible', 'test', 'thank', 'thankful',
              'thaw', 'theory', 'therapeutic', 'thick', 'thing', 'thinkable', 'third', 'thirsty', 'thirsty', 'thought',
              'thoughtful', 'thread', 'three', 'thrill', 'throne', 'thundering', 'tick', 'ticket', 'tidy',
              'tightfisted', 'time', 'tip', 'tire', 'tired', 'tiresome', 'title', 'toad', 'tomatoes', 'top', 'touch',
              'tour', 'tow', 'trace', 'trail', 'train', 'transport', 'trees', 'trip', 'trite', 'trousers', 'truck',
              'true', 'trust', 'truthful', 'try', 'tumble', 'turkey', 'turn', 'twig', 'twist', 'twist', 'type',
              'ubiquitous',
              'ugly', 'unable', 'unaccountable', 'understood', 'unequal', 'unhealthy', 'unit', 'unsuitable', 'untidy',
              'unwieldy', 'upbeat', 'upset', 'use', 'utopian', 'uttermost',
              'vacation', 'vagabond', 'value', 'van', 'various', 'vase', 'vein', 'vengeful', 'verdant', 'vessel',
              'view', 'vigorous', 'violent', 'vivacious', 'volatile',
              'wacky', 'wander', 'want', 'wash', 'watch', 'watery', 'wave', 'waves', 'weak', 'wealthy', 'weary',
              'welcome', 'well-to-do', 'whine', 'whip', 'whirl', 'whisper', 'wide-eyed', 'willing', 'wind', 'window',
              'wing', 'wink', 'winter', 'wish', 'woman', 'womanly', 'work', 'worm', 'wrench', 'wretched', 'writing',
              'wry',
              'x-ray',
              'yam', 'yard', 'year', 'yielding', 'yoke',
              'zealous', 'zebra', 'zephyr', 'zesty', 'zip', 'zippy', 'zoom']

LIST02_DES = ['zoom', 'zippy', 'zip', 'zesty', 'zephyr', 'zebra', 'zealous',
              'yoke', 'yielding', 'year', 'yard', 'yam',
              'x-ray',
              'wry', 'writing', 'wretched', 'wrench', 'worm', 'work', 'womanly', 'woman', 'wish', 'winter', 'wink',
              'wing', 'window', 'wind', 'willing', 'wide-eyed', 'whisper', 'whirl', 'whip', 'whine', 'well-to-do',
              'welcome', 'weary', 'wealthy', 'weak', 'waves', 'wave', 'watery', 'watch', 'wash', 'want', 'wander',
              'wacky',
              'volatile', 'vivacious', 'violent', 'vigorous', 'view', 'vessel', 'verdant', 'vengeful', 'vein', 'vase',
              'various', 'van', 'value', 'vagabond', 'vacation',
              'uttermost', 'utopian', 'use', 'upset', 'upbeat', 'unwieldy', 'untidy', 'unsuitable', 'unit', 'unhealthy',
              'unequal', 'understood', 'unaccountable', 'unable', 'ugly', 'ubiquitous',
              'type', 'twist', 'twist', 'twig', 'turn', 'turkey', 'tumble', 'try', 'truthful', 'trust', 'true', 'truck',
              'trousers', 'trite', 'trip', 'trees', 'transport', 'train', 'trail', 'trace', 'tow', 'tour', 'touch',
              'top', 'tomatoes', 'toad', 'title', 'tiresome', 'tired', 'tire', 'tip', 'time', 'tightfisted', 'tidy',
              'ticket', 'tick', 'thundering', 'throne', 'thrill', 'three', 'thread', 'thoughtful', 'thought', 'thirsty',
              'thirsty', 'third', 'thinkable', 'thing', 'thick', 'therapeutic', 'theory', 'thaw', 'thankful', 'thank',
              'test', 'terrible', 'tense', 'teeny-tiny', 'tedious', 'tease', 'tearful', 'teaching', 'tax', 'tasteless',
              'taste', 'tap', 'tank', 'tangy', 'tan', 'tame', 'tame', 'tall', 'talk', 'talk',
              'system', 'synonymous', 'switch', 'sweet', 'sweater', 'surprise', 'surprise', 'support', 'summer', 'suit',
              'suit', 'suggestion', 'suggest', 'sugar', 'suffer', 'sudden', 'suck', 'substantial', 'striped', 'street',
              'strange', 'story', 'store', 'stop', 'stone', 'stomach', 'stitch', 'stir', 'stimulating', 'stew', 'step',
              'stem', 'steel', 'station', 'statement', 'start', 'stale', 'stain', 'stage', 'squeak', 'squash', 'square',
              'squalid', 'spurious', 'sprout', 'spring', 'spotty', 'spot', 'spot', 'spoon', 'spiders', 'spell',
              'spectacular', 'sparkle', 'spark', 'spade', 'space', 'soup', 'sore', 'sordid', 'soothe', 'songs',
              'somber', 'soggy', 'soft', 'sock', 'soak', 'snore', 'snatch', 'smoke', 'smoke', 'smiling', 'smile',
              'smell', 'small', 'sloppy', 'slope', 'slim', 'sleet', 'sleepy', 'slave', 'skirt', 'skinny', 'skin', 'ski',
              'skate', 'sisters', 'silky', 'silent', 'silent', 'signal', 'sign', 'side', 'shrug', 'show', 'shoe',
              'shiver', 'shirt', 'shiny', 'shelter', 'sheet', 'share', 'shape', 'shame', 'shade', 'separate', 'selfish',
              'self', 'seemly', 'secretive', 'secretary', 'secret', 'second-hand', 'seashore', 'seal', 'scratch',
              'scintillating', 'scientific', 'science', 'school', 'scattered', 'scare', 'scale', 'saw', 'save',
              'satisfy', 'sand', 'sail', 'sad', 'sack',
              'rule', 'ruin', 'rude', 'ruddy', 'rub', 'rough', 'rotten', 'root', 'romantic', 'rod', 'rock', 'rock',
              'roasted', 'road', 'ritzy', 'risk', 'ripe', 'rinse', 'righteous', 'rhetorical', 'return', 'retire',
              'responsible', 'respect', 'resonant', 'resolute', 'rescue', 'request', 'representative', 'replace',
              'remarkable', 'relation', 'rejoice', 'reject', 'regular', 'regret', 'reflect', 'redundant', 'record',
              'record', 'recondite', 'recess', 'receptive', 'receipt', 'rebel', 'real', 'ready', 'reaction', 'rare',
              'rapid', 'range', 'rampant', 'raise', 'rainy', 'rail',
              'quixotic', 'quirky', 'quilt', 'quiet', 'quicksand', 'question', 'queen', 'quarter',
              'puzzling', 'puzzled', 'puny', 'pump', 'pump', 'pull', 'puffy', 'psychedelic', 'proud', 'profit',
              'produce', 'produce', 'prick', 'pricey', 'price', 'prepare', 'prefer', 'precious', 'practise', 'potato',
              'pot', 'possessive', 'possess', 'poor', 'pollution', 'political', 'poised', 'point', 'point', 'plug',
              'plough', 'plot', 'pleasant', 'playground', 'play', 'plants', 'plantation', 'plant', 'plant', 'place',
              'place', 'pizzas', 'pink', 'pinch', 'pin', 'pig', 'pies', 'picture', 'pickle', 'picayune', 'phobic',
              'petite', 'person', 'perpetual', 'permit', 'periodic', 'perform', 'peel', 'pedal', 'peck', 'pear',
              'peace', 'pause', 'pat', 'pastoral', 'past', 'pass', 'partner', 'parsimonious', 'parcel', 'parallel',
              'painstaking', 'painful', 'pack',
              'owe', 'overwrought', 'overrated', 'overjoyed', 'overflow', 'oven', 'outstanding', 'outgoing', 'orange',
              'open', 'open', 'one', 'omniscient', 'old-fashioned', 'old', 'offer', 'offend', 'ocean', 'obtain',
              'obsolete', 'observation',
              'numerous', 'null', 'notebook', 'nosy', 'nonchalant', 'noiseless', 'nippy', 'next', 'nest', 'nervous',
              'necessary', 'nebulous', 'neat', 'nauseating', 'naughty', 'natural', 'nasty', 'name', 'nail',
              'mute', 'murder', 'mundane', 'muddled', 'muddle', 'move', 'mourn', 'motionless', 'mother', 'morning',
              'mom', 'moldy', 'moaning', 'mixed', 'miscreant', 'minister', 'mine', 'mind', 'milky', 'mice', 'metal',
              'messy', 'merciful', 'memorise', 'mellow', 'meeting', 'meek', 'measure', 'meal', 'matter', 'massive',
              'mass', 'mark', 'man', 'mailbox', 'maid', 'magic', 'magenta', 'macabre',
              'lyrical', 'lush', 'lunch', 'lumber', 'ludicrous', 'lucky', 'lovely', 'loss', 'loose', 'longing', 'long',
              'long', 'lonely', 'locket', 'lock', 'loaf', 'load', 'living', 'lively', 'lively', 'live', 'little', 'lip',
              'line', 'limping', 'likeable', 'like', 'lighten', 'lick', 'lewd', 'letter', 'legal', 'leg', 'left',
              'leather', 'learn', 'lean', 'lavish', 'land', 'lacking', 'lace', 'laborer', 'labored',
              'knowledge', 'knowing', 'knot', 'knot', 'knock', 'kneel', 'kindly',
              'juvenile', 'jumpy', 'jump', 'judge', 'join', 'jewel', 'jeans', 'jealous', 'jar', 'jam', 'jail', 'jail',
              'jaded',
              'itch', 'invincible', 'invention', 'invent', 'internal', 'intelligent', 'instinctive', 'insect', 'injure',
              'incredible', 'increase', 'income', 'impulse', 'impress', 'imperfect', 'impartial', 'immense',
              'illustrious', 'illegal', 'ill', 'ignore', 'ignorant', 'idea',
              'husky', 'hurt', 'hunt', 'hum', 'huge', 'hug', 'hover', 'house', 'hospital', 'hose', 'horse', 'hook',
              'honorable', 'honey', 'homely', 'holistic', 'holiday', 'hole', 'historical', 'highfalutin', 'helpful',
              'heat', 'heat', 'heartbreaking', 'heady', 'harsh', 'harm', 'hard', 'happen', 'hapless', 'hanging', 'hang',
              'handle', 'hand', 'hall', 'half', 'habitual',
              'gusty', 'guitar', 'guide', 'guide', 'guarded', 'guard', 'growth', 'group', 'grouchy', 'groovy', 'grip',
              'grieving', 'greasy', 'grease', 'gratis', 'grateful', 'grate', 'grass', 'grape', 'grandmother',
              'grandfather', 'grade', 'graceful', 'grab', 'governor', 'good', 'godly', 'glove', 'glossy', 'glistening',
              'glass', 'glamorous', 'girls', 'giraffe', 'gifted', 'giddy', 'giant', 'gentle', 'gate',
              'fuzzy', 'furtive', 'funny', 'full', 'front', 'frightening', 'friendly', 'friction', 'fresh', 'frequent',
              'frantic', 'frame', 'found', 'form', 'fork', 'foregoing', 'force', 'follow', 'fold', 'fly', 'flow',
              'flock', 'float', 'flippant', 'flight', 'flesh', 'flashy', 'flash', 'flap', 'flaky', 'flagrant', 'fish',
              'fireman', 'finger', 'finger', 'film', 'file', 'field', 'fetch', 'feigned', 'feeling', 'fearful', 'fang',
              'fancy', 'false', 'faint', 'fact', 'face',
              'eyes', 'eye', 'extra-small', 'extra-large', 'extend', 'explode', 'expensive', 'expect', 'expansion',
              'expand', 'exist', 'excuse', 'exclusive', 'excited', 'exchange', 'even', 'evanescent', 'ethereal',
              'erratic', 'erect', 'equal', 'equable', 'enter', 'encouraging', 'enchanting', 'empty', 'embarrass',
              'elfin', 'elated', 'elastic', 'eight', 'efficient', 'effect', 'education', 'edge', 'economic', 'earthy',
              'earth', 'early', 'ear',
              'dysfunctional', 'dust', 'dull', 'dry', 'drown', 'dress', 'drawer', 'drain', 'drain', 'drag', 'draconian',
              'downtown', 'doubtful', 'doubt', 'dolls', 'disturbed', 'distance', 'dislike', 'disgusting', 'disgusted',
              'discreet', 'discover', 'disagreeable', 'dirt', 'direction', 'dime', 'diligent', 'digestion',
              'development', 'determined', 'detailed', 'detail', 'design', 'deserve', 'deserted', 'descriptive',
              'describe', 'depressed', 'delicious', 'defective', 'deep', 'decorate', 'decide', 'death', 'dear',
              'deafening', 'dead', 'dark', 'dare', 'dangerous', 'damaged', 'damage', 'dam', 'daily', 'daffy', 'dad',
              'cushion', 'current', 'curl', 'cure', 'crown', 'crowded', 'cross', 'crooked', 'crook', 'creepy', 'credit',
              'creature', 'cream', 'crayon', 'cracker', 'crack', 'crabby', 'cows', 'courageous', 'country', 'cough',
              'correct', 'cool', 'contain', 'consist', 'condition', 'condemned', 'concentrate', 'complete', 'complete',
              'comparison', 'compare', 'company', 'command', 'comfortable', 'color', 'coil', 'coil', 'coherent',
              'cobweb', 'cluttered', 'club', 'clover', 'close', 'cloistered', 'clip', 'clever', 'clear', 'clear',
              'clean', 'clean', 'clap', 'claim', 'church', 'chubby', 'choke', 'chivalrous', 'chin', 'chilly',
              'children', 'chickens', 'cheerful', 'check', 'cheap', 'charge', 'channel', 'change', 'celery',
              'ceaseless', 'cause', 'cast', 'carpenter', 'caring', 'card', 'car', 'canvas', 'cannon', 'camp', 'camp',
              'camera', 'callous', 'call', 'calendar', 'cake', 'cable',
              'butter', 'bustling', 'burn', 'building', 'bucket', 'bubble', 'brush', 'brown', 'brother', 'broken',
              'breakable', 'brake', 'box', 'box', 'bow', 'boundary', 'borrow', 'bore', 'boot', 'boorish', 'books',
              'bomb', 'bolt', 'boat', 'boast', 'blushing', 'blue-eyed', 'blue', 'blow', 'black-and-white', 'black',
              'bird', 'billowy', 'bikes', 'beneficial', 'belief', 'beginner', 'beef', 'bed', 'bear', 'battle', 'bath',
              'basket', 'basin', 'baseball', 'base', 'bang', 'ban', 'balance', 'baby',
              'aware', 'average', 'attend', 'attack', 'assorted', 'aspiring', 'ashamed', 'art', 'arrest', 'army',
              'arch', 'approval', 'apparatus', 'anxious', 'ants', 'answer', 'annoy', 'animal', 'angry', 'angle',
              'ancient', 'amusing', 'amuse', 'amuck', 'ambitious', 'aloof', 'alcoholic', 'alarm', 'ajar', 'airplane',
              'agreement', 'agreeable', 'agree', 'afternoon', 'aftermath', 'afford', 'advise', 'adventurous', 'admire',
              'adjustment', 'adjoining', 'ad hoc', 'actor', 'action', 'acrid', 'acoustics', 'acidic', 'account',
              'accessible', 'acceptable', 'abusive', 'abundant', 'absent', 'abrupt', 'abrasive', 'abounding', 'aboard',
              'abnormal', 'abashed', 'abandoned', 'abaft', 'aback']


class SortTest(unittest.TestCase):
    def test_bubble_asc(self):
        target = copy.deepcopy(LIST02)
        my_sort.bubble_sort(target)
        self.assertEqual(target, LIST02_ASC)

    def test_bubble_des(self):
        target = copy.deepcopy(LIST02)
        my_sort.bubble_sort(target, reverse=True)
        self.assertEqual(target, LIST02_DES)

    def test_selection_asc(self):
        target = copy.deepcopy(LIST02)
        my_sort.selection_sort(target)
        self.assertEqual(target, LIST02_ASC)

    def test_selection_des(self):
        target = copy.deepcopy(LIST02)
        my_sort.selection_sort(target, reverse=True)
        self.assertEqual(target, LIST02_DES)

    def test_insertion_asc(self):
        target = copy.deepcopy(LIST02)
        my_sort.insertion_sort(target)
        self.assertEqual(target, LIST02_ASC)

    def test_insertion_des(self):
        target = copy.deepcopy(LIST02)
        my_sort.insertion_sort(target, reverse=True)
        self.assertEqual(target, LIST02_DES)

    def test_merge_asc(self):
        target = copy.deepcopy(LIST02)
        my_sort.merge_sort(target)
        self.assertEqual(target, LIST02_ASC)

    def test_merge_des(self):
        target = copy.deepcopy(LIST02)
        my_sort.merge_sort(target, reverse=True)
        self.assertEqual(target, LIST02_DES)

    def test_quick_asc(self):
        target = copy.deepcopy(LIST02)
        my_sort.quick_sort(target)
        self.assertEqual(target, LIST02_ASC)

    def test_quick_des(self):
        target = copy.deepcopy(LIST02)
        my_sort.quick_sort(target, reverse=True)
        self.assertEqual(target, LIST02_DES)


if __name__ == '__main__':
    unittest.main(verbosity=2)
